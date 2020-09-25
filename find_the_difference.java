class Solution {
    public char findTheDifference(String s, String t) {
        List<Character> l1 = new ArrayList<>();
        int j;
        for(int i=0;i<t.length();i++){
            l1.add(t.charAt(i));
        }
        Character c;
        for(j=0;j<s.length();j++){
            c=s.charAt(j);
            l1.remove(c);
        }
        return l1.get(0);
    }
}