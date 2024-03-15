
package org.openapitools.client.model


case class BillingProfilesGet200Response (
    _items: List[BillingProfilesResponse],
    _bookmark: Option[String]
)
object BillingProfilesGet200Response {
    def toStringBody(var_items: Object, var_bookmark: Object) =
        s"""
        | {
        | "items":$var_items,"bookmark":$var_bookmark
        | }
        """.stripMargin
}
