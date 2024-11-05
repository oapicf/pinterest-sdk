package model

import play.api.libs.json._

/**
  * Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.
  * @param subscriberKey Text field value that uniquely identifies a subscriber.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class AdAccountCreateSubscriptionRequestPartnerMetadata(
  subscriberKey: Option[String]
)

object AdAccountCreateSubscriptionRequestPartnerMetadata {
  implicit lazy val adAccountCreateSubscriptionRequestPartnerMetadataJsonFormat: Format[AdAccountCreateSubscriptionRequestPartnerMetadata] = Json.format[AdAccountCreateSubscriptionRequestPartnerMetadata]
}

