package org.openapitools.server.model


/**
 * = BidFloorSpec =
 *
 * @param countries  for example: ''null''
 * @param currency  for example: ''null''
 * @param objectiveType  for example: ''null''
 * @param billableEvent  for example: ''null''
 * @param optimizationGoalMetadata  for example: ''null''
 * @param creativeType  for example: ''null''
*/
final case class BidFloorSpec (
  countries: Option[Seq[Country]] = None,
  currency: Currency,
  objectiveType: Option[ObjectiveType] = None,
  billableEvent: ActionType,
  optimizationGoalMetadata: Option[OptimizationGoalMetadata] = None,
  creativeType: Option[CreativeType] = None
)

