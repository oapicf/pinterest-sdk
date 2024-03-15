
package org.openapitools.client.model


case class BoardsUserFollowsList200Response (
    _items: List[Board],
    _bookmark: Option[String]
)
object BoardsUserFollowsList200Response {
    def toStringBody(var_items: Object, var_bookmark: Object) =
        s"""
        | {
        | "items":$var_items,"bookmark":$var_bookmark
        | }
        """.stripMargin
}
