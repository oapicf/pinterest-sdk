package org.openapitools.server.model


/**
 * @param id Targeting template ID for example: ''643''
 * @param operationType  for example: ''null''
 * @param targetingAttributes  for example: ''null''
*/
final case class TargetingTemplateUpdateRequest (
  id: String,
  operationType: String,
  targetingAttributes: Option[TargetingSpec] = None
)

