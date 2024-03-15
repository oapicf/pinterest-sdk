
package org.openapitools.client.model


case class PinMediaSourceImagesURL (
    _sourceType: Option[String],
    /* Array with image objects. */
    _items: List[PinMediaSourceImagesURLItemsInner],
    _index: Option[Integer]
)
object PinMediaSourceImagesURL {
    def toStringBody(var_sourceType: Object, var_items: Object, var_index: Object) =
        s"""
        | {
        | "sourceType":$var_sourceType,"items":$var_items,"index":$var_index
        | }
        """.stripMargin
}
