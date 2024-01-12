package application;

import chess.ChessMatch;
import boardgame.Board;

    public class Main {
        public static void main(String[] args) {
            ChessMatch chessMatch = new ChessMatch();
            UI.printBoard(chessMatch.getPieces());
        }
    }

