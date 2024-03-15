
package org.openapitools.client.model


case class UserWebsitesGet200Response (
    _items: List[UserWebsiteSummary],
    _bookmark: Option[String]
)
object UserWebsitesGet200Response {
    def toStringBody(var_items: Object, var_bookmark: Object) =
        s"""
        | {
        | "items":$var_items,"bookmark":$var_bookmark
        | }
        """.stripMargin
}
