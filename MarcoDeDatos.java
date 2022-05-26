public class MarcoDeDatos {
   private String filePath;
   

   public void loadDataSet() {

   }

   public void writeDataSet(String outputFilePath) {

   }

   public void filterBy(String variableName, String operator) {

   }

   public void stats(String variableName, String statistic) {

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
