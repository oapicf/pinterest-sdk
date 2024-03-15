package model

import play.api.libs.json._

/**
  * This field includes all quiz data including questions, options, and results.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class QuizPinData(
  questions: Option[List[QuizPinQuestion]],
  results: Option[List[QuizPinResult]]
)

object QuizPinData {
  implicit lazy val quizPinDataJsonFormat: Format[QuizPinData] = Json.format[QuizPinData]
}

