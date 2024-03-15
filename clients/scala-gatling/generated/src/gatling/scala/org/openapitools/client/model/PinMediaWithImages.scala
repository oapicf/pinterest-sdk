
package org.openapitools.client.model


case class PinMediaWithImages (
    _mediaType: Option[String],
    _items: Option[List[ImageMetadata]]
)
object PinMediaWithImages {
    def toStringBody(var_mediaType: Object, var_items: Object) =
        s"""
        | {
        | "mediaType":$var_mediaType,"items":$var_items
        | }
        """.stripMargin
}
