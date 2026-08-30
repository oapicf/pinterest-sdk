package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LeadSubscription.
  * @param adAccountId The Ad Account ID that this lead form belongs to.
  * @param apiVersion API version.
  * @param createdTime Subscription creation time. Unix timestamp in milliseconds.
  * @param cryptographicAlgorithm Lead data encryption algorithm.
  * @param cryptographicKey Base64 encoded key for client to decrypt lead data.
  * @param id Subscription ID.
  * @param leadFormId Lead form ID.
  * @param userAccountId User account used to subscribe lead data.
  * @param webhookUrl Standard HTTPS webhook URL.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class LeadSubscription(
  adAccountId: Option[String],
  apiVersion: Option[String],
  createdTime: Option[Int],
  cryptographicAlgorithm: Option[String],
  cryptographicKey: Option[String],
  id: Option[String],
  leadFormId: Option[String],
  userAccountId: Option[String],
  webhookUrl: Option[String]
)

object LeadSubscription {
  implicit lazy val leadSubscriptionJsonFormat: Format[LeadSubscription] = Json.format[LeadSubscription]
}

