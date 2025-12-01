package org.example;

import org.example.model.*;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Game {
    Board board;
    Deque<Player> players;
    Player winner;

    public void initGame() {
        players = new LinkedList<>();
        PlayingPiece playingPiece1 = new PlayingPieceX();
        PlayingPiece playingPiece2 = new PlayingPieceO();
        Player player1 = new Player("p1",playingPiece1);
        Player player2 = new Player("p2",playingPiece2);
        players.add(player1);
        players.add(player2);
        board = new Board(3);
    }

    public String startGame() {
        boolean noWinner = true;
        while(noWinner) {
            Player currentPlayer = players.removeFirst();
            board.printBoard();
            List<List<Integer>> free = board.getFreeCells();
            if(free.isEmpty()) {
                noWinner = false;
                continue;
            }
            System.out.println("Player: "+currentPlayer.getName()+"enter row and column: ");
            Scanner sc = new Scanner(System.in);
            int row = sc.nextInt();
            int col = sc.nextInt();

            boolean addPiece = board.addPiece(row,col, currentPlayer.getPlayingPiece());
            if(!addPiece) {
                System.out.println("Incorrect move played");
                players.addFirst(currentPlayer);
                continue;
            }
            players.addLast(currentPlayer);

            boolean isWinner = checkWinner(row,col,currentPlayer.getPlayingPiece().type);
            if(isWinner) {
                board.printBoard();
                winner = currentPlayer;
                return currentPlayer.getName()+"Won";
            }
        }
        return "Draw";
    }

    public boolean checkWinner(int row, int col, PieceType pieceType) {
        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        // Check Row
        for (int i = 0; i < board.size; i++) {
            if (board.board[row][i] == null || board.board[row][i].type != pieceType) {
                rowMatch = false;
                break;
            }
        }

        // Check Column
        for (int i = 0; i < board.size; i++) {
            if (board.board[i][col] == null || board.board[i][col].type != pieceType) {
                columnMatch = false;
                break;
            }
        }

        // Check Diagonally
        for (int i = 0, j = 0; i < board.size; i++, j++) {
            if (board.board[i][j] == null || board.board[i][j].type != pieceType) {
                diagonalMatch = false;
                break;
            }
        }

        // Check Anti-Diagonally
        for (int i = 0, j = board.size - 1; i < board.size; i++, j--) {
            if (board.board[i][j] == null || board.board[i][j].type != pieceType) {
                antiDiagonalMatch = false;
                break;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;

    }
}
