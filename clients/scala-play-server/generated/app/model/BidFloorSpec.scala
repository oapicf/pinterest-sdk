package model

import play.api.libs.json._

/**
  * Bid floor specification for a given campaign configuration.
  * @param billableEvent Ad group billable event type.
  * @param countries List of ISO 3166-1 alpha-2 country codes.
  * @param creativeType Creative type for the bid floor request.
  * @param currency Currency for the bid floor value.
  * @param objectiveType Campaign objective type.
  * @param optimizationGoalMetadata Optimization goal metadata.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class BidFloorSpec(
  billableEvent: ActionType,
  countries: Option[List[Country]],
  creativeType: Option[CreativeType],
  currency: Currency,
  objectiveType: Option[BidFloorObjectiveType],
  optimizationGoalMetadata: Option[OptimizationGoalMetadata]
)

object BidFloorSpec {
  implicit lazy val bidFloorSpecJsonFormat: Format[BidFloorSpec] = Json.format[BidFloorSpec]
}

