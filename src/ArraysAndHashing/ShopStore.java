package ArraysAndHashing;

public class ShopStore {
    public static boolean Check(int[] arr) {

        int Thirty = 0;
        int Sixty = 0;
        int OneTwenty = 0;
        for(int num : arr) {
            if(num == 30) {
                Thirty++;
            }
            else if (num == 60) {
                Sixty++;
                if(Thirty > 0) {
                    Thirty--;
                }
                else {
                    return false;
                }
            }
            else if(num == 120) {
                OneTwenty++;
                if(Thirty > 2) {
                    Thirty -= 3;
                }
                else if( Sixty > 0 && Thirty  > 0) {
                    Thirty--;
                    Sixty--;
                }

                else {
                    return false;
                }
            }

        }
        return true;

    }
    public static void main(String[] args) {
        int[] arr = {30, 30, 60, 60, 120};
        if(Check(arr)) {
            System.out.println("Transaction Successful");
        }
        else {
            System.out.println("Transaction Failed");
        }
    }
}
