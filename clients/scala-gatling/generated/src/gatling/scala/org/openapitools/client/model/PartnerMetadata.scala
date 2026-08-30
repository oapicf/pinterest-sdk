
package org.openapitools.client.model


case class PartnerMetadata (
    /* Text field value that uniquely identifies a subscriber. */
    _subscriberKey: Option[String]
)
object PartnerMetadata {
    def toStringBody(var_subscriberKey: Object) =
        s"""
        | {
        | "subscriberKey":$var_subscriberKey
        | }
        """.stripMargin
}
