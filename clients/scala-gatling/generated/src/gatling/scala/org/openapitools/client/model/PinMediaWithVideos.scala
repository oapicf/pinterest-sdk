
package org.openapitools.client.model


case class PinMediaWithVideos (
    _mediaType: Option[String],
    _items: Option[List[VideoMetadata]]
)
object PinMediaWithVideos {
    def toStringBody(var_mediaType: Object, var_items: Object) =
        s"""
        | {
        | "mediaType":$var_mediaType,"items":$var_items
        | }
        """.stripMargin
}
