
package org.openapitools.client.model


case class PinMediaWithImageAndVideo (
    _items: Option[List[PinMediaMetadata]],
    _mediaType: String
)
object PinMediaWithImageAndVideo {
    def toStringBody(var_items: Object, var_mediaType: Object) =
        s"""
        | {
        | "items":$var_items,"mediaType":$var_mediaType
        | }
        """.stripMargin
}
