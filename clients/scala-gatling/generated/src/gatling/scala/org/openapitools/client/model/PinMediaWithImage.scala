
package org.openapitools.client.model


case class PinMediaWithImage (
    _images: Option[ImageSize],
    _mediaType: String
)
object PinMediaWithImage {
    def toStringBody(var_images: Object, var_mediaType: Object) =
        s"""
        | {
        | "images":$var_images,"mediaType":$var_mediaType
        | }
        """.stripMargin
}
