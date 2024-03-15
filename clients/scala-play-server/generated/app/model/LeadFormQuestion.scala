package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LeadFormQuestion.
  * @param customQuestionLabel Question label for a custom question.
  * @param customQuestionOptions Question options for a custom question.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class LeadFormQuestion(
  questionType: Option[LeadFormQuestionType],
  customQuestionFieldType: Option[LeadFormQuestionFieldType],
  customQuestionLabel: Option[String],
  customQuestionOptions: Option[List[String]]
)

object LeadFormQuestion {
  implicit lazy val leadFormQuestionJsonFormat: Format[LeadFormQuestion] = Json.format[LeadFormQuestion]
}

