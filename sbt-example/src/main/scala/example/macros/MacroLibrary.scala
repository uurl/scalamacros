package example.macros

// This line throws errors
import scala.reflect.macros.blackbox

object MacroLibrary {
  def hello_impl(c: blackbox.Context)(): c.Expr[Unit] = {
    import c.universe._
    c.Expr(q"""println("Hello World")""")
  }
}