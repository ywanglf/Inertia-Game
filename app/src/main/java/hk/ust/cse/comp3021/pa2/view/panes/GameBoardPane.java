package hk.ust.cse.comp3021.pa2.view.panes;

import hk.ust.cse.comp3021.pa2.model.GameState;
import hk.ust.cse.comp3021.pa2.view.GameUIComponent;
import hk.ust.cse.comp3021.pa2.view.controls.GameCell;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;

/**
 * A {@link javafx.scene.layout.Pane} for displaying the status of {@link hk.ust.cse.comp3021.pa2.model.GameBoard}.
 */
public class GameBoardPane extends GridPane implements GameUIComponent {

    /**
     * {@inheritDoc}
     */
    @Override
    public void initializeComponents() {
        this.setAlignment(Pos.CENTER);
        this.setCenterShape(true);
    }

    /**
     * Updates the game board display with latest {@link GameState}.
     *
     * @param gameState The latest {@link GameState}.
     */
    public void showGameState(GameState gameState) {
        // TODO: Update the content based on the state of the game board.
        int row = gameState.getGameBoard().getNumRows();
        int col = gameState.getGameBoard().getNumCols();
        for (int j=0; j<col; j++){
            for (int i=0; i<row; i++){
                GameCell gameCell = new GameCell(gameState.getGameBoard().getCell(i,j));
                this.add(gameCell,j ,i);
            }
        }
    }
}
