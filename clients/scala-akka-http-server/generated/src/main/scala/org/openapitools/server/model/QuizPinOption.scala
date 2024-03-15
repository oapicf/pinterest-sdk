package org.openapitools.server.model


/**
 *  This field contains multiple options to a quiz question.
 *
 * @param id  for example: ''null''
 * @param text  for example: ''null''
*/
final case class QuizPinOption (
  id: Option[Double] = None,
  text: Option[String] = None
)

