package org.openapitools.server.model


/**
 * A JSON object that represents a single estimation point. An estimation point contains the expected budget used and the estimated result, Y, along with an expected range based for the budget.
 *
 * @param budget The budget value of the point. for example: ''5000000''
 * @param doubleY Y value as a decimal. for example: ''10.68''
 * @param maxY The maximum Y value of the point. for example: ''2000''
 * @param minY The minimum Y value of the point. for example: ''1000''
 * @param y The expected Y value of the point. for example: ''1500''
*/
final case class CampaignPlanningPointEstimate (
  budget: Int,
  doubleY: Double,
  maxY: Int,
  minY: Int,
  y: Int
)

