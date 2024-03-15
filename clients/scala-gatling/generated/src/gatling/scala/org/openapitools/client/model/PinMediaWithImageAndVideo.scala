
package org.openapitools.client.model


case class PinMediaWithImageAndVideo (
    _mediaType: Option[String],
    _items: Option[List[PinMediaMetadata]]
)
object PinMediaWithImageAndVideo {
    def toStringBody(var_mediaType: Object, var_items: Object) =
        s"""
        | {
        | "mediaType":$var_mediaType,"items":$var_items
        | }
        """.stripMargin
}
