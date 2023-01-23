package application;

import chess.ChessPiece;

public class UI {

    public static void printBoard(ChessPiece[][] pieces) {
        for (int i = 0; i < pieces.length; i++) {
            System.out.print((8 - i) + "  ");
            for (int j = 0; j < pieces.length; j++) {
                printPiece(pieces[i][j], i, j);
            }
            System.out.println();
        }
        System.out.println("   ａ  ｂ  ｃ  ｄ  ｅ  ｆ  ｇ  ｈ");
    }

    private static void printPiece(ChessPiece piece, int row, int column) {
        if (piece == null && ((row % 2 == 0 && column % 2 != 0) || (row % 2 != 0 && column % 2 == 0))) {
            System.out.print("▭");
        } else if (piece == null) {
            System.out.print("▬");
        } else {
            System.out.print(piece);
        }
        System.out.print("  ");
    }
}
