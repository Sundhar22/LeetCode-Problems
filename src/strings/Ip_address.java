package strings;

public class Ip_address {
    /*
     * Input: address = "255.100.50.0"
     * Output: "255[.]100[.]50[.]0"
     */
    public static String defangIPaddr(String address) {
        String ans = "";
        int begin = 0;
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                String first = address.substring(begin, i);
                ans += first + "[.]";
                begin = i + 1;
            }
        }
        return ans + address.substring(begin, address.length());
    }

    public static void main(String[] args) {
        System.out.println(Ip_address.defangIPaddr("255.100.50.0"));
    }
}
