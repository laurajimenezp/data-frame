public class Variable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    private int column;

    public Variable(String name, int column) {
        this.name = name;
        this.column = column;
    }

}
