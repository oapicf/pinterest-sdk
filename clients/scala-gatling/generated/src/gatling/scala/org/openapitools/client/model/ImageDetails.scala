
package org.openapitools.client.model


case class ImageDetails (
    _width: Integer,
    _height: Integer,
    _url: String
)
object ImageDetails {
    def toStringBody(var_width: Object, var_height: Object, var_url: Object) =
        s"""
        | {
        | "width":$var_width,"height":$var_height,"url":$var_url
        | }
        """.stripMargin
}
