package org.openapitools.server.model


/**
 * Resource create operation model.
 *
 * @param adAccountId Ad account ID. for example: ''null''
 * @param audienceType [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR for example: ''null''
 * @param description Audience description. for example: ''null''
 * @param name Audience name. for example: ''null''
 * @param rule  for example: ''null''
*/
final case class AdAccountsAudienceCreate (
  adAccountId: Option[String] = None,
  audienceType: Option[AudienceType] = None,
  description: Option[String] = None,
  name: Option[String] = None,
  rule: Option[AdAccountsAudienceRule] = None
)

