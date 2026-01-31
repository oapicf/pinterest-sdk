
package org.openapitools.client.model


case class AdAccountsSubscriptionsGetList200Response (
    _bookmark: Option[String],
    _items: List[LeadSubscription]
)
object AdAccountsSubscriptionsGetList200Response {
    def toStringBody(var_bookmark: Object, var_items: Object) =
        s"""
        | {
        | "bookmark":$var_bookmark,"items":$var_items
        | }
        """.stripMargin
}
