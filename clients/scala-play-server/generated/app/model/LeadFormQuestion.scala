package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LeadFormQuestion.
  * @param customQuestionLabel Question label for a custom question.
  * @param customQuestionOptions Question options for a custom question.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class LeadFormQuestion(
  questionType: Option[LeadFormQuestionType],
  customQuestionFieldType: Option[LeadFormQuestionFieldType],
  customQuestionLabel: Option[String],
  customQuestionOptions: Option[List[String]]
)

object LeadFormQuestion {
  implicit lazy val leadFormQuestionJsonFormat: Format[LeadFormQuestion] = Json.format[LeadFormQuestion]
}

