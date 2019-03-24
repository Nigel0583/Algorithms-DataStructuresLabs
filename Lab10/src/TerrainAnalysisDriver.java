public class TerrainAnalysisDriver {
    public static void main(String[] args) {

        TerrainAnalysis terrain = new TerrainAnalysis(8, 4);
        System.out.println(terrain.display());
        System.out.println(terrain.getNumberOfPeaks());
    }
}
