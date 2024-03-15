package org.openapitools.server.model


/**
 * = Audience =
 *
 * @param adAccountId Ad account ID. for example: ''549755885175''
 * @param id Audience ID. for example: ''1234''
 * @param name Audience name. for example: ''ACME Tools''
 * @param audienceType <a href=\"/docs/reference/glossary/#Audience Types\">Audience types</a>: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR for example: ''null''
 * @param description Audience description. for example: ''People who love making quilts.''
 * @param rule  for example: ''null''
 * @param size Audience size. for example: ''1000''
 * @param status Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it. for example: ''null''
 * @param `type` Always \"audience\". for example: ''audience''
 * @param createdTimestamp Creation time. Unix timestamp in seconds. for example: ''1451431341''
 * @param updatedTimestamp Last update time. Unix timestamp in seconds. for example: ''1451431341''
*/
final case class Audience (
  adAccountId: Option[String] = None,
  id: Option[String] = None,
  name: Option[String] = None,
  audienceType: Option[String] = None,
  description: Option[String] = None,
  rule: Option[AudienceRule] = None,
  size: Option[Int] = None,
  status: Option[String] = None,
  `type`: Option[String] = None,
  createdTimestamp: Option[Int] = None,
  updatedTimestamp: Option[Int] = None
)

