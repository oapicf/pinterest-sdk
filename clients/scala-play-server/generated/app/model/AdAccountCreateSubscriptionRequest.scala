package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdAccountCreateSubscriptionRequest.
  * @param leadFormId Lead form ID.
  * @param partnerAccessToken Partner access token. Only for clients that requires authentication. We recommend to avoid this param.
  * @param partnerRefreshToken Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.
  * @param webhookUrl Standard HTTPS webhook URL.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AdAccountCreateSubscriptionRequest(
  leadFormId: Option[String],
  partnerAccessToken: Option[String],
  partnerMetadata: Option[AdAccountCreateSubscriptionRequestPartnerMetadata],
  partnerRefreshToken: Option[String],
  webhookUrl: String
)

object AdAccountCreateSubscriptionRequest {
  implicit lazy val adAccountCreateSubscriptionRequestJsonFormat: Format[AdAccountCreateSubscriptionRequest] = Json.format[AdAccountCreateSubscriptionRequest]
}

