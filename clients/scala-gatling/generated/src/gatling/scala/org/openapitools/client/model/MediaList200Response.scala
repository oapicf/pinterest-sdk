
package org.openapitools.client.model


case class MediaList200Response (
    _bookmark: Option[String],
    _items: List[Media]
)
object MediaList200Response {
    def toStringBody(var_bookmark: Object, var_items: Object) =
        s"""
        | {
        | "bookmark":$var_bookmark,"items":$var_items
        | }
        """.stripMargin
}
