package org.openapitools.server.model


/**
 * @param data  for example: ''null''
 * @param errorMessages  for example: ''null''
*/
final case class KeywordError (
  data: Option[Keyword] = None,
  errorMessages: Option[Seq[String]] = None
)

