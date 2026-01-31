package org.openapitools.server.model


/**
 * Gender demographic distribution
 *
 * @param female Percentage of female users for example: ''null''
 * @param male Percentage of male users for example: ''null''
 * @param unspecified Percentage of users with unspecified gender for example: ''null''
*/
final case class GenderDemographics (
  female: Double,
  male: Double,
  unspecified: Double
)

