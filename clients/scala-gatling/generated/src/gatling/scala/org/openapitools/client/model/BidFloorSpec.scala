
package org.openapitools.client.model


case class BidFloorSpec (
    /* Ad group billable event type. */
    _billableEvent: ActionType,
    /* List of ISO 3166-1 alpha-2 country codes. */
    _countries: Option[List[Country]],
    /* Creative type for the bid floor request. */
    _creativeType: Option[CreativeType],
    /* Currency for the bid floor value. */
    _currency: Currency,
    /* Campaign objective type. */
    _objectiveType: Option[BidFloorObjectiveType],
    /* Optimization goal metadata. */
    _optimizationGoalMetadata: Option[OptimizationGoalMetadata]
)
object BidFloorSpec {
    def toStringBody(var_billableEvent: Object, var_countries: Object, var_creativeType: Object, var_currency: Object, var_objectiveType: Object, var_optimizationGoalMetadata: Object) =
        s"""
        | {
        | "billableEvent":$var_billableEvent,"countries":$var_countries,"creativeType":$var_creativeType,"currency":$var_currency,"objectiveType":$var_objectiveType,"optimizationGoalMetadata":$var_optimizationGoalMetadata
        | }
        """.stripMargin
}
