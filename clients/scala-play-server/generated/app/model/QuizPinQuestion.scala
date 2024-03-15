package model

import play.api.libs.json._

/**
  * A specific quiz inquiry.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class QuizPinQuestion(
  questionId: Option[BigDecimal],
  questionText: Option[String],
  options: Option[List[QuizPinOption]]
)

object QuizPinQuestion {
  implicit lazy val quizPinQuestionJsonFormat: Format[QuizPinQuestion] = Json.format[QuizPinQuestion]
}

