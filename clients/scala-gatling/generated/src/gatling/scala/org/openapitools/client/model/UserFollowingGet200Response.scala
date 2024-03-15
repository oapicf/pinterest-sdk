
package org.openapitools.client.model


case class UserFollowingGet200Response (
    /* Users */
    _items: List[UserSummary],
    _bookmark: Option[String]
)
object UserFollowingGet200Response {
    def toStringBody(var_items: Object, var_bookmark: Object) =
        s"""
        | {
        | "items":$var_items,"bookmark":$var_bookmark
        | }
        """.stripMargin
}
