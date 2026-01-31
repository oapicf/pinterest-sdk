package org.openapitools.server.model


/**
 * = AdAccountCreateSubscriptionRequest =
 *
 * @param leadFormId Lead form ID. for example: ''383791336903426390''
 * @param partnerAccessToken Partner access token. Only for clients that requires authentication. We recommend to avoid this param. for example: ''null''
 * @param partnerMetadata  for example: ''null''
 * @param partnerRefreshToken Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param. for example: ''null''
 * @param webhookUrl Standard HTTPS webhook URL. for example: ''https://webhook.example.com/xyz''
*/
final case class AdAccountCreateSubscriptionRequest (
  leadFormId: Option[String] = None,
  partnerAccessToken: Option[String] = None,
  partnerMetadata: Option[AdAccountCreateSubscriptionRequestPartnerMetadata] = None,
  partnerRefreshToken: Option[String] = None,
  webhookUrl: String
)

