package org.openapitools.server.model


/**
 * @param adAccountId Ad account ID. for example: ''null''
 * @param audienceType [Audience types](/docs/reference/glossary/#Audience Types): ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR for example: ''null''
 * @param createdByCompanyName The company that created this audience. for example: ''null''
 * @param createdTimestamp Creation time. Unix timestamp in seconds. for example: ''null''
 * @param description Audience description. for example: ''null''
 * @param id Audience ID. for example: ''null''
 * @param isNca Whether the audience derives from a new customer acquisition (expanded matching) customer list. Read-only. for example: ''null''
 * @param name Audience name. for example: ''null''
 * @param rule  for example: ''null''
 * @param size Audience size. for example: ''null''
 * @param status Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it. for example: ''null''
 * @param `type` Always \"audience\". for example: ''null''
 * @param updatedTimestamp Last update time. Unix timestamp in seconds. for example: ''null''
*/
final case class AdAccountsAudience (
  adAccountId: Option[String] = None,
  audienceType: Option[AudienceType] = None,
  createdByCompanyName: Option[String] = None,
  createdTimestamp: Option[Int] = None,
  description: Option[String] = None,
  id: String,
  isNca: Option[Boolean] = None,
  name: Option[String] = None,
  rule: Option[AdAccountsAudienceRule] = None,
  size: Option[Int] = None,
  status: Option[AudienceStatus] = None,
  `type`: Option[String] = None,
  updatedTimestamp: Option[Int] = None
)

