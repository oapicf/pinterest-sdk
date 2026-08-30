package org.openapitools.server.model


/**
 * = AudienceInsights =
 *
 * Audience interests and demographics.
 *
 * @param categories Category interest distribution for example: ''null''
 * @param date Generation date for example: ''2022-10-09''
 * @param demographics  for example: ''null''
 * @param size Population count. for example: ''10000''
 * @param sizeIsUpperBound Indicates whether the audience size has been rounded up to the next highest upper boundary. for example: ''true''
 * @param `type`  for example: ''null''
*/
final case class AudienceInsights (
  categories: Option[Seq[AudienceCategory]] = None,
  date: Option[String] = None,
  demographics: Option[AudienceDemographics] = None,
  size: Option[Int] = None,
  sizeIsUpperBound: Option[Boolean] = None,
  `type`: Option[AudienceInsightType] = None
)

