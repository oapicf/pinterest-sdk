package org.openapitools.server.model


/**
 * @param data  for example: ''null''
 * @param errorMessages  for example: ''null''
*/
final case class LabelError (
  data: Option[Label] = None,
  errorMessages: Option[Seq[String]] = None
)

