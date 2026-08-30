package org.openapitools.server.model


/**
 * Resource create or update operation model.
 *
 * @param adAccountId Ad account ID. for example: ''null''
 * @param audienceType [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR for example: ''null''
 * @param description Audience description. for example: ''null''
 * @param name Audience name. for example: ''null''
 * @param operationType Audience operation type (update or remove). Only valid in update request body. for example: ''null''
 * @param rule  for example: ''null''
*/
final case class AdAccountsAudienceUpdate (
  adAccountId: Option[String] = None,
  audienceType: Option[AudienceType] = None,
  description: Option[String] = None,
  name: Option[String] = None,
  operationType: Option[AudienceUpdateOperationType] = None,
  rule: Option[AdAccountsAudienceRule] = None
)

