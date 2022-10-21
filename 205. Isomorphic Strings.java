
//Using 2 hashMaP
class Solution {
    public boolean isIsomorphic(String s, String t) {
       HashMap<Character,Character> map1=new HashMap<>();
       HashMap<Character,Character> map2=new HashMap<>();
 
    for(int i = 0; i < s.length(); i++) {
        if(map1.containsKey(s.charAt(i)) && map1.get(s.charAt(i)) != t.charAt(i)) return false;
        if(map2.containsKey(t.charAt(i)) && map2.get(t.charAt(i)) != s.charAt(i)) return false;
        map1.put(s.charAt(i), t.charAt(i));
        map2.put(t.charAt(i), s.charAt(i));
    }
       return true;
        
    }
}

//using one hashMap

class Solution {
    public boolean isIsomorphic(String s, String t) {
    HashMap<Character,Character> map=new HashMap<>();
      for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i)).equals(t.charAt(i)))
                continue;
                else
                return false;
            }
            else{
                if(!map.containsValue(t.charAt(i))){
                map.put(s.charAt(i),t.charAt(i));

                }
                else{
                    return false;
                }
            
                
            }
        }
            return true;  
    }
}
