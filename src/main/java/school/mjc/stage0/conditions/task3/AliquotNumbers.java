package school.mjc.stage0.conditions.task3;

public class AliquotNumbers {
    public void isFirstAliquot(int first, int second) {
        String aliquot;
        if (second % first == 0) {
            aliquot ="Aliquot";
        } else {
            aliquot = "Not aliquot";
        }
        System.out.println(aliquot);
    }
}
