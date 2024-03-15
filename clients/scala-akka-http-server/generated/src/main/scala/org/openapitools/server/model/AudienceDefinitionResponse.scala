package org.openapitools.server.model


/**
 * @param items  for example: ''null''
*/
final case class AudienceDefinitionResponse (
  items: Option[Seq[AudienceDefinition]] = None
)

