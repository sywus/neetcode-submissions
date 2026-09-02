// googled: 
// - str array to set java
// - convert map values into list

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> charMap = new HashMap<>();
        for (int i=0; i<strs.length; i++){
            char[] str = strs[i].toCharArray();
            Arrays.sort(str);
            String sorted = new String(str);
            charMap.putIfAbsent(sorted, new ArrayList<>());
            charMap.get(sorted).add(new String(strs[i]));
        }
        return new ArrayList<>(charMap.values());
    }
}
