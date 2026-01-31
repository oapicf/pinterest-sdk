package org.openapitools.server.model


/**
 * @param adAccountId Ad account ID. for example: ''549755885175''
 * @param name Audience name. for example: ''string''
 * @param rule  for example: ''null''
 * @param audienceType <a href=\"/docs/reference/glossary/#Audience Types\">Audience types</a>: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR. Values are case-sensitive. for example: ''null''
 * @param description Audience description. for example: ''string''
*/
final case class AudienceCreateRequest (
  adAccountId: Option[String] = None,
  name: String,
  rule: AudienceRule,
  audienceType: AudienceType,
  description: Option[String] = None
)

