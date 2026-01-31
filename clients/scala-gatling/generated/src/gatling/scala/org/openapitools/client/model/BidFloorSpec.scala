
package org.openapitools.client.model


case class BidFloorSpec (
    _billableEvent: ActionType,
    _countries: Option[List[Country]],
    _creativeType: Option[CreativeType],
    _currency: Currency,
    _objectiveType: Option[ObjectiveType],
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
