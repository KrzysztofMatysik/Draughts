public class MapMaker {
    //1 b*b*b*b*
    //2 *b*b*b*b
    private int piecesNumber = 12;
    private int sizeMap = 8;
    char[][] Map;

    final char signWhiteField = '*';
    final char signWhitePawns = 'w';
    final char signWhiteQueen = 'm';

    final char signBlackField = '#';
    final char signBlackPawns = 'b';
    final char signBlackQueen = 'p';

    public void DrawingMap() {

        Map = new char[sizeMap][sizeMap];
        int countBlackPawns = piecesNumber;
        int countWhitePawns = piecesNumber;

        for (int i = 0; i < sizeMap; i++) {
            for (int j = 0; j < sizeMap; j += 2) {

                if (((i + j) % 2) == 0 && countBlackPawns > 0) {
                    Map[i][j] = signBlackField;
                    Map[i][j + 1] = signBlackPawns;
                    countBlackPawns--;
                } else if (((i + j) % 2) == 1 && countBlackPawns > 0) {
                    Map[i][j] = signBlackPawns;
                    Map[i][j + 1] = signBlackField;
                    countBlackPawns--;
                } else if (i == 3) {
                    Map[i][j] = signWhiteField;
                    Map[i][j + 1] = signBlackField;
                } else if (i == 4) {
                    Map[i][j] = signBlackField;
                    Map[i][j + 1] = signWhiteField;
                } else if (((i + j) % 2) == 1 && countWhitePawns > 0) {
                    Map[i][j] = signWhitePawns;
                    Map[i][j + 1] = signBlackField;
                } else if (((i + j) % 2) == 0 && countWhitePawns > 0) {
                    Map[i][j] = signBlackField;
                    Map[i][j + 1] = signWhitePawns;
                }
            }
        }
    }

//    public void TestDrawingMap() {
//        for (int i = 0; i < sizeMap; i++) {
//            for (int j = 0; j < sizeMap; j++) {
//
//                System.out.print(Map[i][j]);
//            }
//            System.out.println();
//        }
//    }


    public static void main(String[] args) {

        MapMaker mapMaker = new MapMaker();
        mapMaker.DrawingMap();
        //mapMaker.TestDrawingMap();


    }
}
