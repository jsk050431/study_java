public class AddAll {
    int sum(int ... nums) {
        int result = 0;
        for (int i : nums) {
            result += i;
        }
        return result;
    }
}
