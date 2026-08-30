package org.openapitools.server.model


/**
 * @param entityId Entity ID to apply label to. for example: ''null''
 * @param entityType  for example: ''null''
 * @param labelId Label ID. for example: ''null''
 * @param status  for example: ''null''
*/
final case class EntityLabel (
  entityId: String,
  entityType: Option[LabelParentType] = None,
  labelId: String,
  status: Option[EntityLabelStatus] = None
)

