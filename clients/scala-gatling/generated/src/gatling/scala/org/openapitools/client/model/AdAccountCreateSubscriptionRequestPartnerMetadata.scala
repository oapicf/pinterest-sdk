
package org.openapitools.client.model


case class AdAccountCreateSubscriptionRequestPartnerMetadata (
    /* Text field value that uniquely identifies a subscriber. */
    _subscriberKey: Option[String]
)
object AdAccountCreateSubscriptionRequestPartnerMetadata {
    def toStringBody(var_subscriberKey: Object) =
        s"""
        | {
        | "subscriberKey":$var_subscriberKey
        | }
        """.stripMargin
}
