package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TargetingTypeFilter.
  * @param targetingTypes List of targeting types. Requires `level` to be a value ending in `_TARGETING`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class TargetingTypeFilter(
  targetingTypes: Option[List[AdsAnalyticsTargetingType]]
)

object TargetingTypeFilter {
  implicit lazy val targetingTypeFilterJsonFormat: Format[TargetingTypeFilter] = Json.format[TargetingTypeFilter]
}

