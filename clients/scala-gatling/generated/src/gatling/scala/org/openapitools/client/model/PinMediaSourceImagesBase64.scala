
package org.openapitools.client.model


case class PinMediaSourceImagesBase64 (
    _sourceType: Option[String],
    /* Array with image objects. */
    _items: List[PinMediaSourceImagesBase64ItemsInner],
    _index: Option[Integer]
)
object PinMediaSourceImagesBase64 {
    def toStringBody(var_sourceType: Object, var_items: Object, var_index: Object) =
        s"""
        | {
        | "sourceType":$var_sourceType,"items":$var_items,"index":$var_index
        | }
        """.stripMargin
}
