
package org.openapitools.client.model


case class TrendingPin (
    /* Height of the pin image in pixels */
    _height: Integer,
    /* Unique identifier for the pin */
    _id: String,
    /* URL of the pin image */
    _src: String,
    /* Width of the pin image in pixels */
    _width: Integer
)
object TrendingPin {
    def toStringBody(var_height: Object, var_id: Object, var_src: Object, var_width: Object) =
        s"""
        | {
        | "height":$var_height,"id":$var_id,"src":$var_src,"width":$var_width
        | }
        """.stripMargin
}
