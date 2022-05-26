public class DataFrame {
    private String filePath;
    private Double dataSet[][];
    private Variable variables[];

    public void loadDataSet(){
        // TODO: please read a csv file and populate the dataSet matrix. important just values not file headers

    }

    public void writeDataSet(String outputFilePath){

    }
    public int getVarColumn(String var){
        int column = 0;
        for (int i = 0; i < this.variables.length; i++) {
            if (this.variables[i].getName().equals(var)){
                column = this.variables[i].getColumn();
            }
        }
        return column;
    }


    public void filterBy(String variableName, String operator, double value){
        int column = getVarColumn(variableName);

        switch (operator)
        {
            case "<": lessThan(column, value);
            case ">": greaterThan(column, value);
        }
    }

    public double [] lessThan(int column, double value){
        int n = this.dataSet[column].length;
        double[] values = new double[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (this.dataSet[column][i] < value){
                values[k] = this.dataSet[column][i];
                k++;
            }
        }

        return values;
    }

    public double [] greaterThan(int column, double value){
        int n = this.dataSet[column].length;
        double[] values = new double[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (this.dataSet[column][i] > value){
                values[k] = this.dataSet[column][i];
                k++;
            }
        }

        return values;
    }

    public void stats(String variableName, String statistic){
        int column = getVarColumn(variableName);

        switch (statistic)
        {
            case "mean": mean(column);
            case "st-dev": stDev(column);
        }

    }

    public Double mean(int column){
        double sum = 0.0;
        int n = this.dataSet[column].length;
        for (int i = 0; i < n; i++) {
            sum += this.dataSet[column][i];
        }
        double mean = sum / n;
        return mean;
    }

    public Double stDev(int column){
        double mean = mean(column);
        double sum = 0.0;
        int n = this.dataSet[column].length;

        for (int i = 0; i < n; i++) {
            sum += (this.dataSet[column][i] - mean) * (this.dataSet[column][i] - mean);
        }
        return Math.sqrt(sum / (n - 1));
    }

    public Double varianza (int column){
        double mean = mean(column);
        double sum = 0.0;
        int n = this.dataSet[column].length;
        for (int i = 0; i < n; i++) {
            sum += (this.dataSet[column][i] - mean) * (this.dataSet[column][i] - mean);
    }
        return (sum / (n - 1));
  }
}




