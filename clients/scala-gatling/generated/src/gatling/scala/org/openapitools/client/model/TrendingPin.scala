
package org.openapitools.client.model


case class TrendingPin (
    /* Dominant color of the pin image in hex format */
    _color: String,
    /* Height of the pin image in pixels */
    _height: Integer,
    /* Unique identifier for the pin */
    _id: String,
    /* URL of the pin image */
    _src: String,
    /* The vertical offset of the pin image as a percentage from 0 to 100, where 0 is the top of the image and 100 is the bottom. */
    _verticalOffset: Option[Double],
    /* Width of the pin image in pixels */
    _width: Integer
)
object TrendingPin {
    def toStringBody(var_color: Object, var_height: Object, var_id: Object, var_src: Object, var_verticalOffset: Object, var_width: Object) =
        s"""
        | {
        | "color":$var_color,"height":$var_height,"id":$var_id,"src":$var_src,"verticalOffset":$var_verticalOffset,"width":$var_width
        | }
        """.stripMargin
}
