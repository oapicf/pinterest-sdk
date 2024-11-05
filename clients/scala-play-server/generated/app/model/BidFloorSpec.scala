package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for BidFloorSpec.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
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

