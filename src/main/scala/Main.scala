object Main extends App {
  import Mine._

  // Init the game
  val board = newGame(8, 0.2) // 20% probability for a cell to be a bomb

  // Let user select a cell
  val row = 4
  val col = 3

  selectCell(board, row, col) match {
    case Some(Bomb) => println(s"Boom! The cell at ($row, $col) is a bomb.")
    case Some(NotBomb) => println(s"Safe! The cell at ($row, $col) is not a bomb.")
    case None => println("Invalid cell selection.")
  }
}
