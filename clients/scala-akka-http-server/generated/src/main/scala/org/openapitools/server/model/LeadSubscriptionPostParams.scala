package org.openapitools.server.model


/**
 * @param adAccountId The Ad Account ID that this lead form belongs to. for example: ''null''
 * @param apiVersion API version. for example: ''null''
 * @param createdTime Subscription creation time. Unix timestamp in milliseconds. for example: ''null''
 * @param cryptographicAlgorithm Lead data encryption algorithm. for example: ''null''
 * @param cryptographicKey Base64 encoded key for client to decrypt lead data. for example: ''null''
 * @param id Subscription ID. for example: ''null''
 * @param leadFormId Lead form ID. for example: ''null''
 * @param userAccountId User account used to subscribe lead data. for example: ''null''
 * @param webhookUrl Standard HTTPS webhook URL. for example: ''null''
 * @param partnerAccessToken Partner access token. Only for clients that requires authentication. We recommend to avoid this param. for example: ''null''
 * @param partnerMetadata Partner metadata. Only for clients that requires special handling. We recommend to avoid this param. for example: ''null''
 * @param partnerRefreshToken Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param. for example: ''null''
*/
final case class LeadSubscriptionPostParams (
  adAccountId: Option[String] = None,
  apiVersion: Option[String] = None,
  createdTime: Option[Int] = None,
  cryptographicAlgorithm: Option[String] = None,
  cryptographicKey: Option[String] = None,
  id: Option[String] = None,
  leadFormId: Option[String] = None,
  userAccountId: Option[String] = None,
  webhookUrl: Option[String] = None,
  partnerAccessToken: Option[String] = None,
  partnerMetadata: Option[PartnerMetadata] = None,
  partnerRefreshToken: Option[String] = None
)

