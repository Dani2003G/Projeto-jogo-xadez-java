package boardgame;

public abstract class Piece {
    
    protected Position position;
    private Board board;

    // CONSTRUCTORS

    public Piece(){}

    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    // GET

    protected Board getBoard() {
        return board;
    }

    public abstract boolean[][] posibleMoves();

    public boolean posibleMove(Position position){
        return posibleMoves()[position.getRow()][position.getColumn()];
    }
  
    public boolean isThereAnyPossibleMove(){
        boolean[][] mat = posibleMoves();
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat.length; j++){
                if(mat[i][j]){
                    return true;
                }
            }
        }
        return false;
    }
}
