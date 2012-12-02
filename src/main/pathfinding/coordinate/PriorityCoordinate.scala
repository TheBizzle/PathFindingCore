package pathfinding.coordinate

/**
 * Created by IntelliJ IDEA.
 * User: Jason
 * Date: 11/5/11
 * Time: 1:52 AM
 */

//@ This stuff should be in the 'datastructure' package...
trait PriorityCoordinate {
  self: Coordinate =>
  def priority: Int
  override def hashCode             = 41 * super.hashCode + priority
  override def toString             = "%s:%s".format(super.toString, priority)
  override def canEqual(other: Any) = other.isInstanceOf[this.type]
  override def equals  (that: Any)  = {
    that match {
      case thatCoord: this.type => super.equals(thatCoord) && (priority == thatCoord.priority)
      case _                    => false
    }
  }
}

object PriorityCoordinate {
  protected type Cor2  = Coordinate2D
  protected type PCor2 = Coordinate2D with PriorityCoordinate
  def apply(coord: Cor2, priority: Int)       : PCor2 = apply(coord.x, coord.y, priority)
  def apply(_x: Int, _y: Int, _priority: Int) : PCor2 = new Coordinate2D with PriorityCoordinate {
    override val (x, y, priority) = (_x, _y, _priority)
    override def copy = apply(x, y, priority)
  }
}

