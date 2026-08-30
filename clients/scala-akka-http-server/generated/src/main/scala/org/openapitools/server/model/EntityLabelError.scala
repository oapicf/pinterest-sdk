package org.openapitools.server.model


/**
 * @param data  for example: ''null''
 * @param errorMessages  for example: ''null''
*/
final case class EntityLabelError (
  data: Option[EntityLabel] = None,
  errorMessages: Option[Seq[String]] = None
)

