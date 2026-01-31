package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for BidFloorSpec.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class BidFloorSpec(
  billableEvent: ActionType,
  countries: Option[List[Country]],
  creativeType: Option[CreativeType],
  currency: Currency,
  objectiveType: Option[ObjectiveType],
  optimizationGoalMetadata: Option[OptimizationGoalMetadata]
)

object BidFloorSpec {
  implicit lazy val bidFloorSpecJsonFormat: Format[BidFloorSpec] = Json.format[BidFloorSpec]
}

