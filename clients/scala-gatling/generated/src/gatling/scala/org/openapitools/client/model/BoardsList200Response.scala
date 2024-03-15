
package org.openapitools.client.model


case class BoardsList200Response (
    /* Boards */
    _items: List[Board],
    _bookmark: Option[String]
)
object BoardsList200Response {
    def toStringBody(var_items: Object, var_bookmark: Object) =
        s"""
        | {
        | "items":$var_items,"bookmark":$var_bookmark
        | }
        """.stripMargin
}
