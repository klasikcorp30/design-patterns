package edev.structuralpattersn.adapterpattern;

public class School {
    public static void main(String[] args) {
        AssignmentWork aw = new AssignmentWork();
        PenAdapter pen = new PenAdapter();
        aw.setP(pen);
        aw.writeAssignment("This is a cool assignment");
    }
}
