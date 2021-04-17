package cse512

object HotzoneUtils {

  def ST_Contains(queryRectangle: String, pointString: String ): Boolean = {
    val points =  queryRectangle.split(",")

    val float_points = points.map(x => x.toDouble)

    // //bl -> bottom-left, tr -> top-right
    val bl_x = float_points(0)
    val bl_y = float_points(1)
    val tr_x = float_points(2)
    val tr_y = float_points(3)

    val pt = pointString.split(",").map(x => x.toDouble)
    val x = pt(0)
    val y = pt(1)

    if (x >= bl_x && x <= tr_x && y >= bl_y && y <= tr_y){ true } else{ false }
  }

  // YOU NEED TO CHANGE THIS PART

}
