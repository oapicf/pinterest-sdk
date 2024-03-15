package org.openapitools.server.model


/**
 * @param adAccountId Ad account ID. for example: ''549755885175''
 * @param name Audience name. for example: ''string''
 * @param rule  for example: ''null''
 * @param description Audience description. for example: ''string''
 * @param operationType  for example: ''null''
*/
final case class AudienceUpdateRequest (
  adAccountId: Option[String] = None,
  name: Option[String] = None,
  rule: Option[AudienceRule] = None,
  description: Option[String] = None,
  operationType: Option[AudienceUpdateOperationType] = None
)

