package org.academiadecodigo.bootcamp.gfx.simplegfx;

import org.academiadecodigo.bootcamp.grid.Grid;
import org.academiadecodigo.bootcamp.grid.position.GridPosition;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class SimpleGfxGrid implements Grid {

    public static final int PADDING = 10;
    private static final int CELLSIZE = 10;
    private int cols;
    private int rows;
    private int WIDTH;
    private int HEIGHT;
    private int X;
    private int Y;
    private Rectangle rectangle;


    public SimpleGfxGrid(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;
        this.WIDTH = this.cols * this.CELLSIZE;
        this.HEIGHT = this.rows * this.CELLSIZE;
        this.X = this.PADDING;
        this.Y = this.PADDING;
    }

    /**
     * @see Grid#init()
     */
    @Override
    public void init() {
        rectangle = new Rectangle(PADDING, PADDING, WIDTH, HEIGHT);
        rectangle.draw();
    }

    /**
     * @see Grid#getCols()
     */
    @Override
    public int getCols() {
        return cols;
    }

    /**
     * @see Grid#getRows()
     */
    @Override
    public int getRows() {
        return rows;
    }

    /**
     * Obtains the width of the grid in pixels
     *
     * @return the width of the grid
     */
    public int getWidth() {
        return WIDTH;
    }

    /**
     * Obtains the height of the grid in pixels
     *
     * @return the height of the grid
     */
    public int getHeight() {
        return HEIGHT;
    }

    /**
     * Obtains the grid X position in the SimpleGFX canvas
     *
     * @return the x position of the grid
     */
    public int getX() {
        return X;
    }

    /**
     * Obtains the grid Y position in the SimpleGFX canvas
     *
     * @return the y position of the grid
     */
    public int getY() {
        return Y;
    }

    /**
     * Obtains the pixel width and height of a grid position
     *
     * @return
     */
    public static int getCellSize() {
        return CELLSIZE;
    }

    /**
     * @see Grid#makeGridPosition()
     */
    @Override
    public GridPosition makeGridPosition() {
        SimpleGfxGridPosition gridPosition = new SimpleGfxGridPosition(this);
        return gridPosition;
    }

    /**
     * @see Grid#makeGridPosition(int, int)
     */
    @Override
    public GridPosition makeGridPosition(int col, int row) {
        SimpleGfxGridPosition gridPosition = new SimpleGfxGridPosition(col, row, this);
        return gridPosition;
    }

    /**
     * auxiliary method to compute the y value that corresponds to a specific row
     *
     * @param row index
     * @return y pixel value
     */
    public int rowToY(int row) {
        return (row) * this.CELLSIZE + this.PADDING;
    }

    /**
     * auxiliary method to compute the x value that corresponds to a specific column
     *
     * @param column index
     * @return x pixel value
     */
    public int columnToX(int column) {
        return (column) * this.CELLSIZE + this.PADDING;
    }
}
