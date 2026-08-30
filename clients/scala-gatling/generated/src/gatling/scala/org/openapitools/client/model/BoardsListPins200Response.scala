
package org.openapitools.client.model


case class BoardsListPins200Response (
    _bookmark: Option[String],
    _items: List[PinRead]
)
object BoardsListPins200Response {
    def toStringBody(var_bookmark: Object, var_items: Object) =
        s"""
        | {
        | "bookmark":$var_bookmark,"items":$var_items
        | }
        """.stripMargin
}
