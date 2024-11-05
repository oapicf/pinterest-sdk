package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdAccountCreateSubscriptionRequest.
  * @param webhookUrl Standard HTTPS webhook URL.
  * @param leadFormId Lead form ID.
  * @param partnerAccessToken Partner access token. Only for clients that requires authentication. We recommend to avoid this param.
  * @param partnerRefreshToken Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class AdAccountCreateSubscriptionRequest(
  webhookUrl: String,
  leadFormId: Option[String],
  partnerAccessToken: Option[String],
  partnerRefreshToken: Option[String],
  partnerMetadata: Option[AdAccountCreateSubscriptionRequestPartnerMetadata]
)

object AdAccountCreateSubscriptionRequest {
  implicit lazy val adAccountCreateSubscriptionRequestJsonFormat: Format[AdAccountCreateSubscriptionRequest] = Json.format[AdAccountCreateSubscriptionRequest]
}

