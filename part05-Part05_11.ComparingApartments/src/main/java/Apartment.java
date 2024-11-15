
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        }
        return false;
    }
    
    public int priceDifference (Apartment compared) {
        if (largerThan(compared)) {
            return (this.squares * this.princePerSquare) - (compared.squares * compared.princePerSquare);
        }
        return (compared.squares * compared.princePerSquare) - (this.squares * this.princePerSquare);
    }
    
    public boolean moreExpensiveThan (Apartment compared) {
        if (((this.squares * this.princePerSquare) - (compared.squares * compared.princePerSquare)) > 0) {
            return true;
        }
        return false;
    }
}
