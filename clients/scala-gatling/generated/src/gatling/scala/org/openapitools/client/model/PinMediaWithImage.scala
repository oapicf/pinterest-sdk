
package org.openapitools.client.model


case class PinMediaWithImage (
    _mediaType: Option[String],
    _images: Option[PinMediaWithImageAllOfImages]
)
object PinMediaWithImage {
    def toStringBody(var_mediaType: Object, var_images: Object) =
        s"""
        | {
        | "mediaType":$var_mediaType,"images":$var_images
        | }
        """.stripMargin
}
