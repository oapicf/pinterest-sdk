package model

import play.api.libs.json._

/**
  * A specific quiz inquiry.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class QuizPinQuestion(
  options: Option[List[QuizPinOption]],
  questionId: Option[BigDecimal],
  questionText: Option[String]
)

object QuizPinQuestion {
  implicit lazy val quizPinQuestionJsonFormat: Format[QuizPinQuestion] = Json.format[QuizPinQuestion]
}

