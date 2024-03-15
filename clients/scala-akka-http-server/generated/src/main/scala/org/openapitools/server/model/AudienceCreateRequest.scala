package org.openapitools.server.model


/**
 * @param adAccountId Ad account ID. for example: ''549755885175''
 * @param name Audience name. for example: ''string''
 * @param rule  for example: ''null''
 * @param description Audience description. for example: ''string''
 * @param audienceType  for example: ''null''
*/
final case class AudienceCreateRequest (
  adAccountId: Option[String] = None,
  name: String,
  rule: AudienceRule,
  description: Option[String] = None,
  audienceType: AudienceCreateRequest1AudienceType
)

