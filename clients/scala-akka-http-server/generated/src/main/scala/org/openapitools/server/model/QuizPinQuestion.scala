package org.openapitools.server.model


/**
 * A specific quiz inquiry.
 *
 * @param questionId  for example: ''null''
 * @param questionText  for example: ''null''
 * @param options  for example: ''null''
*/
final case class QuizPinQuestion (
  questionId: Option[Double] = None,
  questionText: Option[String] = None,
  options: Option[Seq[QuizPinOption]] = None
)

