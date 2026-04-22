import java.util.HashMap;
import java.util.Map;
void main() {
    class RomanToInteger {
        public int romanToInt(String s) {
            Map<Character, Integer> values = new HashMap<>();
            values.put('I', 1);
            values.put('V', 5);
            values.put('X', 10);
            values.put('L', 50);
            values.put('C', 100);
            values.put('D', 500);
            values.put('M', 1000);

            int result = 0;
            int length = s.length();

            for (int i = 0; i < length; i++) {
                int currentValue = values.get(s.charAt(i));
                if(i < length -1) {
                    int nextValue = values.get(s.charAt(i + 1));

                    if (currentValue < nextValue) {
                        result -= currentValue;
                    }else  {
                        result += currentValue;
                    }
                }else  {
                    result += currentValue;
                }
            }
            return result;
        }
    }
}
