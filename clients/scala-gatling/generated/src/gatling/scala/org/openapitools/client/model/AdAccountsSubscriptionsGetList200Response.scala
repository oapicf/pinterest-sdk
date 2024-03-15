
package org.openapitools.client.model


case class AdAccountsSubscriptionsGetList200Response (
    _items: List[AdAccountGetSubscriptionResponse],
    _bookmark: Option[String]
)
object AdAccountsSubscriptionsGetList200Response {
    def toStringBody(var_items: Object, var_bookmark: Object) =
        s"""
        | {
        | "items":$var_items,"bookmark":$var_bookmark
        | }
        """.stripMargin
}
