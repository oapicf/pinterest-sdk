package org.openapitools.server.model


/**
 * A specific quiz inquiry.
 *
 * @param options  for example: ''null''
 * @param questionId  for example: ''null''
 * @param questionText  for example: ''null''
*/
final case class QuizPinQuestion (
  options: Option[Seq[QuizPinOption]] = None,
  questionId: Option[Double] = None,
  questionText: Option[String] = None
)

