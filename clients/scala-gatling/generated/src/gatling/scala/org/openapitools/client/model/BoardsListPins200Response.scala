
package org.openapitools.client.model


case class BoardsListPins200Response (
    /* Pins */
    _items: List[Pin],
    _bookmark: Option[String]
)
object BoardsListPins200Response {
    def toStringBody(var_items: Object, var_bookmark: Object) =
        s"""
        | {
        | "items":$var_items,"bookmark":$var_bookmark
        | }
        """.stripMargin
}
