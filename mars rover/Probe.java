package mars.rover;

public class Probe {

    private int x;
    private int y;
    private Direction direction;

    Probe(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void updatePosition(PositionCode positioncode) {
        switch (positioncode) {
            case M:
                switch (direction) {
                    case N:
                        y = y + 1;
                        break;
                    case E:
                        x = x + 1;
                        break;
                    case S:
                        y = y - 1;
                        break;
                    case W:
                        x = x - 1;
                        break;
                }
                break;

            case L:
                switch (direction) {
                    case N:
                        direction = Direction.W;
                        break;
                    case E:
                        direction = Direction.N;
                        break;
                    case S:
                        direction = Direction.E;
                        break;
                    case W:
                        direction = Direction.S;
                        break;
                }
                break;

            case R:
                switch (direction) {
                    case N:
                        direction = Direction.E;
                        break;
                    case E:
                        direction = Direction.S;
                        break;
                    case S:
                        direction = Direction.W;
                        break;
                    case W:
                        direction = Direction.N;
                        break;
                }
                break;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Direction getDirection() {
        return direction;
    }
}
