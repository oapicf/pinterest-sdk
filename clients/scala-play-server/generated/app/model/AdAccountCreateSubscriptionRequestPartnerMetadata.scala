package model

import play.api.libs.json._

/**
  * Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.
  * @param subscriberKey Text field value that uniquely identifies a subscriber.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AdAccountCreateSubscriptionRequestPartnerMetadata(
  subscriberKey: Option[String]
)

object AdAccountCreateSubscriptionRequestPartnerMetadata {
  implicit lazy val adAccountCreateSubscriptionRequestPartnerMetadataJsonFormat: Format[AdAccountCreateSubscriptionRequestPartnerMetadata] = Json.format[AdAccountCreateSubscriptionRequestPartnerMetadata]
}

