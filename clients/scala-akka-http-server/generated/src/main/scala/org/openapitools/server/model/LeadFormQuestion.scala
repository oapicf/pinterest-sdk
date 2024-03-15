package org.openapitools.server.model


/**
 * @param questionType  for example: ''null''
 * @param customQuestionFieldType  for example: ''null''
 * @param customQuestionLabel Question label for a custom question. for example: ''null''
 * @param customQuestionOptions Question options for a custom question. for example: ''null''
*/
final case class LeadFormQuestion (
  questionType: Option[LeadFormQuestionType] = None,
  customQuestionFieldType: Option[LeadFormQuestionFieldType] = None,
  customQuestionLabel: Option[String] = None,
  customQuestionOptions: Option[Seq[String]] = None
)

