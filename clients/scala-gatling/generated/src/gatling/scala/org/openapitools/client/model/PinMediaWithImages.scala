
package org.openapitools.client.model


case class PinMediaWithImages (
    _items: Option[List[ImageMetadata]],
    _mediaType: String
)
object PinMediaWithImages {
    def toStringBody(var_items: Object, var_mediaType: Object) =
        s"""
        | {
        | "items":$var_items,"mediaType":$var_mediaType
        | }
        """.stripMargin
}
