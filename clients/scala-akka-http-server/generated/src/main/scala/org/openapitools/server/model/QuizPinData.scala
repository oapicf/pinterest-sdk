package org.openapitools.server.model


/**
 * This field includes all quiz data including questions, options, and results.
 *
 * @param questions  for example: ''null''
 * @param results  for example: ''null''
 * @param tieBreakerCustomResult  for example: ''null''
 * @param tieBreakerType  for example: ''null''
*/
final case class QuizPinData (
  questions: Option[Seq[QuizPinQuestion]] = None,
  results: Option[Seq[QuizPinResult]] = None,
  tieBreakerCustomResult: Option[QuizPinResult] = None,
  tieBreakerType: Option[TieBreakerType] = None
)

