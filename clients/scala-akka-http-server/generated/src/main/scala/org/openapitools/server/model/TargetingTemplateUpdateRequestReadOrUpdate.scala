package org.openapitools.server.model


/**
 * @param id Targeting template ID for example: ''643''
 * @param operationType  for example: ''null''
 * @param targetingAttributes targeting profile attributes for example: ''null''
*/
final case class TargetingTemplateUpdateRequestReadOrUpdate (
  id: String,
  operationType: AudienceUpdateOperationType,
  targetingAttributes: Option[TargetingSpecOptimal] = None
)

