package model

import play.api.libs.json._

/**
  * The result, and link out, based on the user’s choice.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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

