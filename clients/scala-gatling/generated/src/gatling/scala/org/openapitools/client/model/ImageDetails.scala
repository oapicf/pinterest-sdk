
package org.openapitools.client.model


case class ImageDetails (
    _height: Integer,
    _url: String,
    _width: Integer
)
object ImageDetails {
    def toStringBody(var_height: Object, var_url: Object, var_width: Object) =
        s"""
        | {
        | "height":$var_height,"url":$var_url,"width":$var_width
        | }
        """.stripMargin
}
