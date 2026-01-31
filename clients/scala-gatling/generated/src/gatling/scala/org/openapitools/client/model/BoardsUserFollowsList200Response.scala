
package org.openapitools.client.model


case class BoardsUserFollowsList200Response (
    _bookmark: Option[String],
    _items: List[Board]
)
object BoardsUserFollowsList200Response {
    def toStringBody(var_bookmark: Object, var_items: Object) =
        s"""
        | {
        | "bookmark":$var_bookmark,"items":$var_items
        | }
        """.stripMargin
}
