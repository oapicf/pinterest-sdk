
package org.openapitools.client.model


case class SearchUserBoardsGet200Response (
    _bookmark: Option[String],
    /* items */
    _items: List[Board]
)
object SearchUserBoardsGet200Response {
    def toStringBody(var_bookmark: Object, var_items: Object) =
        s"""
        | {
        | "bookmark":$var_bookmark,"items":$var_items
        | }
        """.stripMargin
}
