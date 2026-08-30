package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LeadFormQuestion.
  * @param customQuestionLabel Question label for a custom question.
  * @param customQuestionOptions Question options for a custom question.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class LeadFormQuestion(
  customQuestionFieldType: Option[LeadFormQuestionFieldType],
  customQuestionLabel: Option[String],
  customQuestionOptions: Option[List[String]],
  questionType: Option[LeadFormQuestionType]
)

object LeadFormQuestion {
  implicit lazy val leadFormQuestionJsonFormat: Format[LeadFormQuestion] = Json.format[LeadFormQuestion]
}

