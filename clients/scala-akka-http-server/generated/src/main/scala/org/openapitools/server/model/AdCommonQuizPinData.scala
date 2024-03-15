package org.openapitools.server.model


/**
 * Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.
 *
 * @param questions  for example: ''null''
 * @param results  for example: ''null''
*/
final case class AdCommonQuizPinData (
  questions: Option[Seq[QuizPinQuestion]] = None,
  results: Option[Seq[QuizPinResult]] = None
)

