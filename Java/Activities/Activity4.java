package activities;

public class Activity4{
    public static void main(String[] args) {
        int sort[] = {5, 9, 1, 89, 54, 36};
        int temp = Integer.MIN_VALUE;
        int res[];
        for (int i = 0; i < sort.length; i++) {
            for (int j = i + 1; j < sort.length; j++) {
                {
                    if (sort[i] > sort[j]) {
                        temp = sort[i];
                        sort[i] = sort[j];
                        sort[j] = temp;

                    }
                }

            }

        }

        for(int i = 0; i < sort.length; i++) {
            System.out.print(" "+sort[i]);
        }
    }
}
