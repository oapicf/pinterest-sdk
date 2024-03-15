package org.openapitools.server.model


/**
 * = AudienceInsightsResponse =
 *
 * Audience interests and demographics.
 *
 * @param categories Category interest distribution for example: ''null''
 * @param demographics  for example: ''null''
 * @param `type`  for example: ''null''
 * @param date Generation date for example: ''2022-10-09''
 * @param size Population count. for example: ''10000''
 * @param sizeIsUpperBound Indicates whether the audience size has been rounded up to the next highest upper boundary. for example: ''true''
*/
final case class AudienceInsightsResponse (
  categories: Option[Seq[AudienceCategory]] = None,
  demographics: Option[AudienceDemographics] = None,
  `type`: Option[AudienceInsightType] = None,
  date: Option[String] = None,
  size: Option[Int] = None,
  sizeIsUpperBound: Option[Boolean] = None
)

