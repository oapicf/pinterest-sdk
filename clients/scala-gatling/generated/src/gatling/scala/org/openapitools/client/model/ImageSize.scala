
package org.openapitools.client.model


case class ImageSize (
    _1200x: Option[ImageDetails],
    _150x150: Option[ImageDetails],
    _400x300: Option[ImageDetails],
    _600x: Option[ImageDetails]
)
object ImageSize {
    def toStringBody(var_1200x: Object, var_150x150: Object, var_400x300: Object, var_600x: Object) =
        s"""
        | {
        | "1200x":$var_1200x,"150x150":$var_150x150,"400x300":$var_400x300,"600x":$var_600x
        | }
        """.stripMargin
}
