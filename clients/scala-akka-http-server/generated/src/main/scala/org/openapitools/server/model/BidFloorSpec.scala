package org.openapitools.server.model


/**
 * = BidFloorSpec =
 *
 * @param billableEvent  for example: ''null''
 * @param countries  for example: ''null''
 * @param creativeType  for example: ''null''
 * @param currency  for example: ''null''
 * @param objectiveType  for example: ''null''
 * @param optimizationGoalMetadata  for example: ''null''
*/
final case class BidFloorSpec (
  billableEvent: ActionType,
  countries: Option[Seq[Country]] = None,
  creativeType: Option[CreativeType] = None,
  currency: Currency,
  objectiveType: Option[ObjectiveType] = None,
  optimizationGoalMetadata: Option[OptimizationGoalMetadata] = None
)

