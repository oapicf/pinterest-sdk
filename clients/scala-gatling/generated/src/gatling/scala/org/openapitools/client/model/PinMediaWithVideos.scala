
package org.openapitools.client.model


case class PinMediaWithVideos (
    _items: Option[List[VideoMetadataWithItemType]],
    _mediaType: String
)
object PinMediaWithVideos {
    def toStringBody(var_items: Object, var_mediaType: Object) =
        s"""
        | {
        | "items":$var_items,"mediaType":$var_mediaType
        | }
        """.stripMargin
}
