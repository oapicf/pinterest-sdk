package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdAccountCreateSubscriptionResponse.
  * @param id Subscription ID.
  * @param cryptographicKey Base64 encoded key for client to decrypt lead data.
  * @param cryptographicAlgorithm Lead data encryption algorithm.
  * @param createdTime Subscription creation time. Unix timestamp in milliseconds.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class AdAccountCreateSubscriptionResponse(
  id: Option[String],
  cryptographicKey: Option[String],
  cryptographicAlgorithm: Option[String],
  createdTime: Option[Int]
)

object AdAccountCreateSubscriptionResponse {
  implicit lazy val adAccountCreateSubscriptionResponseJsonFormat: Format[AdAccountCreateSubscriptionResponse] = Json.format[AdAccountCreateSubscriptionResponse]
}

