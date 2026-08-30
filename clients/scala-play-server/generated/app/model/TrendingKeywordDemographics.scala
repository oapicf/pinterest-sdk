package model

import play.api.libs.json._

/**
  * A mapping of demographic dimensions (e.g. \"gender\", \"age\") to their category distributions. For each dimension: Key: The category (e.g., \"female\", \"18-24\"). Value: The proportion of search volume (e.g., 0.12 for 12%). Values less than 0.05 are set to 0.04 for privacy. The sum for all categories in a dimension will approximately equal 1. Only applicable when `include_demographics` query parameter is set to `true`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class TrendingKeywordDemographics(
  ageDistribution: Option[TrendsAgeDistribution],
  genderDistribution: Option[TrendsGenderDistribution]
)

object TrendingKeywordDemographics {
  implicit lazy val trendingKeywordDemographicsJsonFormat: Format[TrendingKeywordDemographics] = Json.format[TrendingKeywordDemographics]
}

