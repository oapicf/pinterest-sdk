package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdAccountCreateSubscriptionResponse.
  * @param id Subscription ID.
  * @param cryptographicKey Base64 encoded key for client to decrypt lead data.
  * @param cryptographicAlgorithm Lead data encryption algorithm.
  * @param createdTime Subscription creation time. Unix timestamp in milliseconds.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class AdAccountCreateSubscriptionResponse(
  id: Option[String],
  cryptographicKey: Option[String],
  cryptographicAlgorithm: Option[String],
  createdTime: Option[Int]
)

object AdAccountCreateSubscriptionResponse {
  implicit lazy val adAccountCreateSubscriptionResponseJsonFormat: Format[AdAccountCreateSubscriptionResponse] = Json.format[AdAccountCreateSubscriptionResponse]
}

