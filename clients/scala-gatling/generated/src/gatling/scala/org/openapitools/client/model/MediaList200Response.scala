
package org.openapitools.client.model


case class MediaList200Response (
    /* Media */
    _items: List[MediaUploadDetails],
    _bookmark: Option[String]
)
object MediaList200Response {
    def toStringBody(var_items: Object, var_bookmark: Object) =
        s"""
        | {
        | "items":$var_items,"bookmark":$var_bookmark
        | }
        """.stripMargin
}
