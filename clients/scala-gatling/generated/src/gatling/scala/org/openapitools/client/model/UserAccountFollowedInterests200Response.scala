
package org.openapitools.client.model


case class UserAccountFollowedInterests200Response (
    _items: List[Interest],
    _bookmark: Option[String]
)
object UserAccountFollowedInterests200Response {
    def toStringBody(var_items: Object, var_bookmark: Object) =
        s"""
        | {
        | "items":$var_items,"bookmark":$var_bookmark
        | }
        """.stripMargin
}
