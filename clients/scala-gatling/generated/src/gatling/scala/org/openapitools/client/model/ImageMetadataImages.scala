
package org.openapitools.client.model


case class ImageMetadataImages (
    _150x150: Option[ImageDetails],
    _400x300: Option[ImageDetails],
    _600x: Option[ImageDetails],
    _1200x: Option[ImageDetails]
)
object ImageMetadataImages {
    def toStringBody(var_150x150: Object, var_400x300: Object, var_600x: Object, var_1200x: Object) =
        s"""
        | {
        | "150x150":$var_150x150,"400x300":$var_400x300,"600x":$var_600x,"1200x":$var_1200x
        | }
        """.stripMargin
}
