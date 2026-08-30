
package org.openapitools.client.model


case class BoardSectionsList200Response (
    _bookmark: Option[String],
    _items: List[BoardSection]
)
object BoardSectionsList200Response {
    def toStringBody(var_bookmark: Object, var_items: Object) =
        s"""
        | {
        | "bookmark":$var_bookmark,"items":$var_items
        | }
        """.stripMargin
}
