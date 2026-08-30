
package org.openapitools.client.model


case class LeadFormTest (
    /* Subscription ID. */
    _subscriptionId: Option[String]
)
object LeadFormTest {
    def toStringBody(var_subscriptionId: Object) =
        s"""
        | {
        | "subscriptionId":$var_subscriptionId
        | }
        """.stripMargin
}
