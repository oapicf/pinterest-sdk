package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TargetingTypeFilter.
  * @param targetingTypes List of targeting types. Requires `level` to be a value ending in `_TARGETING`. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class TargetingTypeFilter(
  targetingTypes: Option[List[AdsAnalyticsTargetingType]]
)

object TargetingTypeFilter {
  implicit lazy val targetingTypeFilterJsonFormat: Format[TargetingTypeFilter] = Json.format[TargetingTypeFilter]
}

