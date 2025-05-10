package model

import play.api.libs.json._

/**
  * A specific quiz inquiry.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class QuizPinQuestion(
  questionId: Option[BigDecimal],
  questionText: Option[String],
  options: Option[List[QuizPinOption]]
)

object QuizPinQuestion {
  implicit lazy val quizPinQuestionJsonFormat: Format[QuizPinQuestion] = Json.format[QuizPinQuestion]
}

