
package org.openapitools.client.model


case class LeadFormTestResponse (
    /* Subscription ID. */
    _subscriptionId: Option[String]
)
object LeadFormTestResponse {
    def toStringBody(var_subscriptionId: Object) =
        s"""
        | {
        | "subscriptionId":$var_subscriptionId
        | }
        """.stripMargin
}
