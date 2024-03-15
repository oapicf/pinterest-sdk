package org.openapitools.server.model


/**
 * @param adAccountId Ad account ID. for example: ''549755885175''
 * @param name Audience name. for example: ''string''
 * @param rule  for example: ''null''
 * @param sharingType  for example: ''null''
 * @param dataParty  for example: ''null''
 * @param category  for example: ''DLX Demographics''
*/
final case class AudienceCreateCustomRequest (
  adAccountId: Option[String] = None,
  name: String,
  rule: AudienceRule,
  sharingType: AudienceSharingType,
  dataParty: AudienceDataParty,
  category: Option[String] = None
)

