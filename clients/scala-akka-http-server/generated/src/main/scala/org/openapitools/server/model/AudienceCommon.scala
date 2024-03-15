package org.openapitools.server.model


/**
 * = AudienceCommon =
 *
 * @param adAccountId Ad account ID. for example: ''549755885175''
 * @param name Audience name. for example: ''string''
 * @param rule  for example: ''null''
*/
final case class AudienceCommon (
  adAccountId: Option[String] = None,
  name: Option[String] = None,
  rule: Option[AudienceRule] = None
)

