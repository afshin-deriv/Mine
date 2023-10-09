object Mine {

  sealed trait Cell
  case object Bomb extends Cell
  case object NotBomb extends Cell

  type Board = Vector[Vector[Cell]]

  def newGame(boardSize: Int, bombProbability: Double): Board = {
    val rnd = new scala.util.Random
    Vector.fill(boardSize, boardSize) {
      if (rnd.nextDouble() < bombProbability) Bomb else NotBomb
    }
  }

  def selectCell(board: Board, row: Int, col: Int): Option[Cell] = {
    if (row >= 0 && row < board.size && col >= 0 && col < board(row).size) {
      Some(board(row)(col))
    } else {
      None
    }
  }
}


