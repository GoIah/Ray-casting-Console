
import com.acidmanic.consoletools.drawing.AsciiBorders;
import com.acidmanic.consoletools.drawing.Padding;
import com.acidmanic.consoletools.table.Cell;
import com.acidmanic.consoletools.table.Row;
import com.acidmanic.consoletools.table.Table;

class main {
    public static void main(String[] args) {
        System.out.println("hello world");
        
        /* create a table */
        Table table = new Table();

        /* create first row, and add to table */
        Row firstRow = new Row();

        table.getRows().add(firstRow);

        /* create two cells for first row */
        Cell firstRowLeft = new Cell("Left-Cell");

        Cell firstRowRight = new Cell("Right-Cell");

        firstRow.getCells().add(firstRowLeft);

        firstRow.getCells().add(firstRowRight);

        /* That's it! we can print the table now */
        System.out.println(table.render());

        /* Set a padding for all cells in table */
        table.setCellsPadding(new Padding(2));

        //line("Table With Padding");// print a line and a message

        System.out.println(table.render());

        /* Make cells for second row bordered */
        Row secondRow = new Row();

        Cell secondRowLeft = new Cell("Left-Cell");
        Cell secondRowRight = new Cell("Right-Cell");

        secondRowLeft.setBorder(AsciiBorders.SOLID);
        secondRowRight.setBorder(AsciiBorders.SOLID);

        secondRow.getCells().add(secondRowLeft);
        secondRow.getCells().add(secondRowRight);

        table.getRows().add(secondRow);

        //line("Bordered Cells");

        System.out.println(table.render());

        /* border up the table! */
        table.setBorder(AsciiBorders.DOUBLELINE);

        //line("Bordered Table");

        System.out.println(table.render());

    }
}