class Solution {
    public int calPoints(String[] operations) {
    int[] scores = new int[operations.length];
    int size = 0; 
    for (int i = 0; i < operations.length; i++) {
        String op = operations[i];

        switch (op) {
            case "+":
             scores[size] = scores[size - 1] + scores[size - 2];
             size++;
             break;
             case "D":
             scores[size] = scores[size - 1] * 2;
             size++;
             break;
             case "C":
            size--; 
             break;
                default:
                    scores[size] = Integer.parseInt(op);
                    size++;
                    break;
            }
        }
        int totalSum = 0;
        for (int i = 0; i < size; i++) {
            totalSum += scores[i];
        }

        return totalSum;
    }
}
