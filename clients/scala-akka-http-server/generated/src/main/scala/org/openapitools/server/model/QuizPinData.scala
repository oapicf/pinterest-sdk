package org.openapitools.server.model


/**
 * This field includes all quiz data including questions, options, and results.
 *
 * @param questions  for example: ''null''
 * @param results  for example: ''null''
*/
final case class QuizPinData (
  questions: Option[Seq[QuizPinQuestion]] = None,
  results: Option[Seq[QuizPinResult]] = None
)

