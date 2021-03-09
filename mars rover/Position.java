package mars.rover;

public class Position {

    public static void main(String[] args) {
        //Posição inicial da sonda 1
        Probe probe1 = new Probe(1, 2, Direction.N);

        //Sonda 1 comandos de entrada
        probe1.updatePosition(PositionCode.M);
        probe1.updatePosition(PositionCode.M);
        probe1.updatePosition(PositionCode.L);
        probe1.updatePosition(PositionCode.M);
        probe1.updatePosition(PositionCode.L);
        probe1.updatePosition(PositionCode.M);
        probe1.updatePosition(PositionCode.L);
        probe1.updatePosition(PositionCode.M);
        probe1.updatePosition(PositionCode.M);

        // Posição inicial da sonda 2
        Probe probe2 = new Probe(3, 3, Direction.E);

        // Sonda 2 comandos de entrada
        probe2.updatePosition(PositionCode.M);
        probe2.updatePosition(PositionCode.M);
        probe2.updatePosition(PositionCode.R);
        probe2.updatePosition(PositionCode.M);
        probe2.updatePosition(PositionCode.M);
        probe2.updatePosition(PositionCode.R);
        probe2.updatePosition(PositionCode.M);
        probe2.updatePosition(PositionCode.R);
        probe2.updatePosition(PositionCode.R);
        probe2.updatePosition(PositionCode.M);

        // posição final da sonda
        System.out.println("probe 1 position (X Y direction): " + probe1.getX() + " " + probe1.getY() + " " + probe1.getDirection());
        System.out.println("probe 2 position (X Y direction): " + probe2.getX() + " " + probe2.getY() + " " + probe2.getDirection());
    }
}