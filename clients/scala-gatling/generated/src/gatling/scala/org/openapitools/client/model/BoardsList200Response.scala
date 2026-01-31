
package org.openapitools.client.model


case class BoardsList200Response (
    _bookmark: Option[String],
    _items: List[Board]
)
object BoardsList200Response {
    def toStringBody(var_bookmark: Object, var_items: Object) =
        s"""
        | {
        | "bookmark":$var_bookmark,"items":$var_items
        | }
        """.stripMargin
}
