package org.openapitools.server.model


/**
 * @param entitiesLabels  for example: ''null''
 * @param errors Labels that were not successfully applied. for example: ''null''
*/
final case class LabeledEntities (
  entitiesLabels: Option[Seq[EntityLabel]] = None,
  errors: Option[Seq[EntityLabelError]] = None
)

