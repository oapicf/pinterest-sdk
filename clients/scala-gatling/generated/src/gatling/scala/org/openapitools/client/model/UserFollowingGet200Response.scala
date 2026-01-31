
package org.openapitools.client.model


case class UserFollowingGet200Response (
    _bookmark: Option[String],
    /* Users */
    _items: List[UserSummary]
)
object UserFollowingGet200Response {
    def toStringBody(var_bookmark: Object, var_items: Object) =
        s"""
        | {
        | "bookmark":$var_bookmark,"items":$var_items
        | }
        """.stripMargin
}
