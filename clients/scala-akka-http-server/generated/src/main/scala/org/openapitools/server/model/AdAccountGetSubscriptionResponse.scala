package org.openapitools.server.model


/**
 * = AdAccountGetSubscriptionsResponse =
 *
 * @param leadFormId Lead form ID. for example: ''383791336903426390''
 * @param webhookUrl Standard HTTPS webhook URL. for example: ''https://webhook.example.com/xyz''
 * @param adAccountId The Ad Account ID that this lead form belongs to. for example: ''549755885176''
 * @param apiVersion API version. for example: ''v5''
 * @param createdTime Lead subscription creation time. Unix timestamp in milliseconds. for example: ''1699209842000''
 * @param cryptographicAlgorithm Lead data encryption algorithm. for example: ''AES-256-GCM''
 * @param cryptographicKey Base64 encoded key for client to decrypt lead data. for example: ''ucvxbV2Tdss0vNeYsdh4Qfa/1Khm2b0PqXvXeTTZh54''
 * @param id Subscription ID. for example: ''8078432025948590686''
 * @param userAccountId User account used to subscribe lead data. for example: ''549755885175''
*/
final case class AdAccountGetSubscriptionResponse (
  leadFormId: Option[String] = None,
  webhookUrl: Option[String] = None,
  adAccountId: Option[String] = None,
  apiVersion: Option[String] = None,
  createdTime: Option[Int] = None,
  cryptographicAlgorithm: Option[String] = None,
  cryptographicKey: Option[String] = None,
  id: Option[String] = None,
  userAccountId: Option[String] = None
)

