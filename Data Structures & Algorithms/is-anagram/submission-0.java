class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> inv = new HashMap<>();
        Map<Character, Integer> inv2 = new HashMap<>();
        int sl = s.length();
        int tl = t.length();
        if(sl != tl) return false;
        for(int i = 0; i<sl; i++){
            int currentCount = inv.getOrDefault(s.charAt(i), 0);
            inv.put(s.charAt(i), currentCount + 1);
        }
        for(int i = 0; i<tl; i++){
            int currentCount = inv2.getOrDefault(t.charAt(i), 0);
            inv2.put(t.charAt(i), currentCount + 1);
        }
        return inv.equals(inv2);  
    }
}
