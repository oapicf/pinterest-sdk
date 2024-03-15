package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for BidFloorSpec.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
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

