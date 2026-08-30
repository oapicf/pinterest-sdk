package org.openapitools.server.model


/**
 * Bid floor specification for a given campaign configuration.
 *
 * @param billableEvent Ad group billable event type. for example: ''null''
 * @param countries List of ISO 3166-1 alpha-2 country codes. for example: ''null''
 * @param creativeType Creative type for the bid floor request. for example: ''null''
 * @param currency Currency for the bid floor value. for example: ''null''
 * @param objectiveType Campaign objective type. for example: ''null''
 * @param optimizationGoalMetadata Optimization goal metadata. for example: ''null''
*/
final case class BidFloorSpec (
  billableEvent: ActionType,
  countries: Option[Seq[Country]] = None,
  creativeType: Option[CreativeType] = None,
  currency: Currency,
  objectiveType: Option[BidFloorObjectiveType] = None,
  optimizationGoalMetadata: Option[OptimizationGoalMetadata] = None
)

