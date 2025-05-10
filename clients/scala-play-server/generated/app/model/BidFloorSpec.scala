package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for BidFloorSpec.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
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

