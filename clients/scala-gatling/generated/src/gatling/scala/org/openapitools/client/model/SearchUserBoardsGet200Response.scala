
package org.openapitools.client.model


case class SearchUserBoardsGet200Response (
    /* items */
    _items: List[Board],
    _bookmark: Option[String]
)
object SearchUserBoardsGet200Response {
    def toStringBody(var_items: Object, var_bookmark: Object) =
        s"""
        | {
        | "items":$var_items,"bookmark":$var_bookmark
        | }
        """.stripMargin
}
