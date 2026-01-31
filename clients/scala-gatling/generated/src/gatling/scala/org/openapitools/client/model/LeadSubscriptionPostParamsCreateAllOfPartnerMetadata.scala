
package org.openapitools.client.model


case class LeadSubscriptionPostParamsCreateAllOfPartnerMetadata (
    /* Text field value that uniquely identifies a subscriber. */
    _subscriberKey: Option[String]
)
object LeadSubscriptionPostParamsCreateAllOfPartnerMetadata {
    def toStringBody(var_subscriberKey: Object) =
        s"""
        | {
        | "subscriberKey":$var_subscriberKey
        | }
        """.stripMargin
}
