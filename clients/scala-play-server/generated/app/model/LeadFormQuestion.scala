package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LeadFormQuestion.
  * @param customQuestionLabel Question label for a custom question.
  * @param customQuestionOptions Question options for a custom question.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class LeadFormQuestion(
  questionType: Option[LeadFormQuestionType],
  customQuestionFieldType: Option[LeadFormQuestionFieldType],
  customQuestionLabel: Option[String],
  customQuestionOptions: Option[List[String]]
)

object LeadFormQuestion {
  implicit lazy val leadFormQuestionJsonFormat: Format[LeadFormQuestion] = Json.format[LeadFormQuestion]
}

