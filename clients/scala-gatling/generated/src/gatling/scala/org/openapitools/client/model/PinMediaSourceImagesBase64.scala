
package org.openapitools.client.model


case class PinMediaSourceImagesBase64 (
    _index: Option[Integer],
    /* Array with image objects. */
    _items: List[PinMediaSourceImagesBase64Item],
    /* The source type of the media. */
    _sourceType: String
)
object PinMediaSourceImagesBase64 {
    def toStringBody(var_index: Object, var_items: Object, var_sourceType: Object) =
        s"""
        | {
        | "index":$var_index,"items":$var_items,"sourceType":$var_sourceType
        | }
        """.stripMargin
}
