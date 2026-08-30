package model

import play.api.libs.json._

/**
  * This field includes all quiz data including questions, options, and results.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class QuizPinData(
  questions: Option[List[QuizPinQuestion]],
  results: Option[List[QuizPinResult]],
  tieBreakerCustomResult: Option[QuizPinResult],
  tieBreakerType: Option[TieBreakerType]
)

object QuizPinData {
  implicit lazy val quizPinDataJsonFormat: Format[QuizPinData] = Json.format[QuizPinData]
}

