package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for BidFloorSpec.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class BidFloorSpec(
  countries: Option[List[Country]],
  currency: Currency,
  objectiveType: Option[ObjectiveType],
  billableEvent: ActionType,
  optimizationGoalMetadata: Option[OptimizationGoalMetadata],
  creativeType: Option[CreativeType]
)

object BidFloorSpec {
  implicit lazy val bidFloorSpecJsonFormat: Format[BidFloorSpec] = Json.format[BidFloorSpec]
}

