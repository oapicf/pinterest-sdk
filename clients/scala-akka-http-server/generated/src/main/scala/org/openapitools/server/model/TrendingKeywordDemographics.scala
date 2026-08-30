package org.openapitools.server.model


/**
 * A mapping of demographic dimensions (e.g. \"gender\", \"age\") to their category distributions. For each dimension: Key: The category (e.g., \"female\", \"18-24\"). Value: The proportion of search volume (e.g., 0.12 for 12%). Values less than 0.05 are set to 0.04 for privacy. The sum for all categories in a dimension will approximately equal 1. Only applicable when `include_demographics` query parameter is set to `true`.
 *
 * @param ageDistribution  for example: ''null''
 * @param genderDistribution  for example: ''null''
*/
final case class TrendingKeywordDemographics (
  ageDistribution: Option[TrendsAgeDistribution] = None,
  genderDistribution: Option[TrendsGenderDistribution] = None
)

