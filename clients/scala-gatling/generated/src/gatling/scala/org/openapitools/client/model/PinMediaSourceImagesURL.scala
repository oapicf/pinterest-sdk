
package org.openapitools.client.model


case class PinMediaSourceImagesURL (
    _index: Option[Integer],
    /* Array with image objects. */
    _items: List[PinMediaSourceImagesURLItem],
    /* The source type of the media. */
    _sourceType: String
)
object PinMediaSourceImagesURL {
    def toStringBody(var_index: Object, var_items: Object, var_sourceType: Object) =
        s"""
        | {
        | "index":$var_index,"items":$var_items,"sourceType":$var_sourceType
        | }
        """.stripMargin
}
