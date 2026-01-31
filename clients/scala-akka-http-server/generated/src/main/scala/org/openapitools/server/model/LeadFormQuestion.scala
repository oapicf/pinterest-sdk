package org.openapitools.server.model


/**
 * @param customQuestionFieldType  for example: ''null''
 * @param customQuestionLabel Question label for a custom question. for example: ''null''
 * @param customQuestionOptions Question options for a custom question. for example: ''null''
 * @param questionType  for example: ''null''
*/
final case class LeadFormQuestion (
  customQuestionFieldType: Option[LeadFormQuestionFieldType] = None,
  customQuestionLabel: Option[String] = None,
  customQuestionOptions: Option[Seq[String]] = None,
  questionType: Option[LeadFormQuestionType] = None
)

