package model

import play.api.libs.json._

/**
  * The result, and link out, based on the user’s choice.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class QuizPinResult(
  organicPinId: Option[String],
  androidDeepLink: Option[String],
  iosDeepLink: Option[String],
  destinationUrl: Option[String],
  resultId: Option[BigDecimal]
)

object QuizPinResult {
  implicit lazy val quizPinResultJsonFormat: Format[QuizPinResult] = Json.format[QuizPinResult]
}

