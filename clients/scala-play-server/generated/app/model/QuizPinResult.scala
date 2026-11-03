package model

import play.api.libs.json._

/**
  * The result, and link out, based on the user’s choice.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class QuizPinResult(
  androidDeepLink: Option[String],
  destinationUrl: Option[String],
  iosDeepLink: Option[String],
  organicPinId: Option[String],
  resultId: Option[BigDecimal]
)

object QuizPinResult {
  implicit lazy val quizPinResultJsonFormat: Format[QuizPinResult] = Json.format[QuizPinResult]
}

