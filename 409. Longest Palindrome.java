class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
          
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        boolean old=false;
        int count=0;
        Set<Map.Entry<Character,Integer>> entrySet = map.entrySet();
        for(Map.Entry<Character,Integer> e : entrySet)
        {
            if(e.getValue()%2==0){
                count=count+e.getValue();
            }
            else {
                int mod=e.getValue();
                count=count+ (mod/2)*2;
                if(old==false){
              count=count+1;
              old=true; 
            }
        }
        }
        return count;
    }
}


Easy
class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int len = 0;

        for (int i : map.values()) {
            if (i % 2 == 0) len += i;
            else len += i - 1;
        }

        return len < s.length() ? len + 1 : len;
    }
}

// TC: O(n), SC: O(n)

Using Array
class Solution {
    public int longestPalindrome(String s) {
        int[] charCount = new int[128];

        for (char c : s.toCharArray()) {
            charCount[c]++;
        }

        int len = 0;

        for (int count : charCount) {
            len += 2 * (count / 2);
        }

        return len < s.length() ? len + 1 : len;
    }
}

// TC: O(n), SC: O(1)
