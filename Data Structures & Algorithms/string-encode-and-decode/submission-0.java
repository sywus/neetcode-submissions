class Solution {

// input: ["hello", "world"]
// output: "5#hello5#world"
    public String encode(List<String> strs) {
        if (strs.isEmpty()) return "";
        StringBuilder res = new StringBuilder();

        for (String str : strs){
            res.append(str.length()).append("#").append(str);
        }
        return res.toString();
    }

// input: "5#hello5#world"
// output: ["hello", "world"]
    public List<String> decode(String str) {
        if (str.length() == 0) return new ArrayList<>();
        List<String> res = new ArrayList<>();

        int i = 0;
        int j = 0;
        while (i < str.length()){
            int delim = i;
            while (str.charAt(delim) != '#'){
                delim++;
            }
            int length = Integer.parseInt(str.substring(i, delim));
            i = delim + 1;
            j = i + length;
            res.add(str.substring(i, j));
            i = j;
        }
        return res;
    }
}
