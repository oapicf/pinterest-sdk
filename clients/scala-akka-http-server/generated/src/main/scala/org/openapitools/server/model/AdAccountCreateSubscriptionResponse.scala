package org.openapitools.server.model


/**
 * = AdAccountCreateSubscriptionResponse =
 *
 * @param id Subscription ID. for example: ''8078432025948590686''
 * @param cryptographicKey Base64 encoded key for client to decrypt lead data. for example: ''ucvxbV2Tdss0vNeYsdh4Qfa/1Khm2b0PqXvXeTTZh54''
 * @param cryptographicAlgorithm Lead data encryption algorithm. for example: ''AES-256-GCM''
 * @param createdTime Subscription creation time. Unix timestamp in milliseconds. for example: ''1699209842000''
*/
final case class AdAccountCreateSubscriptionResponse (
  id: Option[String] = None,
  cryptographicKey: Option[String] = None,
  cryptographicAlgorithm: Option[String] = None,
  createdTime: Option[Int] = None
)

