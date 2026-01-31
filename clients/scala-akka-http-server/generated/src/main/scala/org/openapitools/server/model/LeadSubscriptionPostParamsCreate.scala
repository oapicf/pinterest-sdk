package org.openapitools.server.model


/**
 * @param leadFormId Lead form ID. for example: ''null''
 * @param webhookUrl Standard HTTPS webhook URL. for example: ''null''
 * @param partnerAccessToken Partner access token. Only for clients that requires authentication. We recommend to avoid this param. for example: ''null''
 * @param partnerMetadata  for example: ''null''
 * @param partnerRefreshToken Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param. for example: ''null''
*/
final case class LeadSubscriptionPostParamsCreate (
  leadFormId: Option[String] = None,
  webhookUrl: String,
  partnerAccessToken: Option[String] = None,
  partnerMetadata: Option[LeadSubscriptionPostParamsCreateAllOfPartnerMetadata] = None,
  partnerRefreshToken: Option[String] = None
)

