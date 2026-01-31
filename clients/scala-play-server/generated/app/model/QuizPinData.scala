package model

import play.api.libs.json._

/**
  * This field includes all quiz data including questions, options, and results.
  * @param tieBreakerType Quiz ad tie breaker type, default is RANDOM
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class QuizPinData(
  questions: Option[List[QuizPinQuestion]],
  results: Option[List[QuizPinResult]],
  tieBreakerCustomResult: Option[QuizPinResult],
  tieBreakerType: Option[QuizPinData.TieBreakerType.Value]
)

object QuizPinData {
  implicit lazy val quizPinDataJsonFormat: Format[QuizPinData] = Json.format[QuizPinData]

  // noinspection TypeAnnotation
  object TieBreakerType extends Enumeration {
    val RANDOM = Value("RANDOM")
    val CUSTOM = Value("CUSTOM")

    type TieBreakerType = Value
    implicit lazy val TieBreakerTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

