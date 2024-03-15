package org.openapitools.server.model


/**
 * = AdAccountGetSubscriptionsResponse =
 *
 * @param leadFormId Lead form ID. for example: ''383791336903426390''
 * @param webhookUrl Standard HTTPS webhook URL. for example: ''https://webhook.example.com/xyz''
 * @param id Subscription ID. for example: ''8078432025948590686''
 * @param userAccountId User account used to subscribe lead data. for example: ''549755885175''
 * @param adAccountId The Ad Account ID that this lead form belongs to. for example: ''549755885176''
 * @param apiVersion API version. for example: ''v5''
 * @param cryptographicKey Base64 encoded key for client to decrypt lead data. for example: ''ucvxbV2Tdss0vNeYsdh4Qfa/1Khm2b0PqXvXeTTZh54''
 * @param cryptographicAlgorithm Lead data encryption algorithm. for example: ''AES-256-GCM''
 * @param createdTime Lead form creation time. Unix timestamp in milliseconds. for example: ''1699209842000''
*/
final case class AdAccountGetSubscriptionResponse (
  leadFormId: Option[String] = None,
  webhookUrl: Option[String] = None,
  id: Option[String] = None,
  userAccountId: Option[String] = None,
  adAccountId: Option[String] = None,
  apiVersion: Option[String] = None,
  cryptographicKey: Option[String] = None,
  cryptographicAlgorithm: Option[String] = None,
  createdTime: Option[Int] = None
)

