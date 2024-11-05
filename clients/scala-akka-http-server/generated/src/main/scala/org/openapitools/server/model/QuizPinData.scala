package org.openapitools.server.model


/**
 * This field includes all quiz data including questions, options, and results.
 *
 * @param questions  for example: ''null''
 * @param results  for example: ''null''
 * @param tieBreakerType Quiz ad tie breaker type, default is RANDOM for example: ''null''
 * @param tieBreakerCustomResult  for example: ''null''
*/
final case class QuizPinData (
  questions: Option[Seq[QuizPinQuestion]] = None,
  results: Option[Seq[QuizPinResult]] = None,
  tieBreakerType: Option[String] = None,
  tieBreakerCustomResult: Option[QuizPinResult] = None
)

