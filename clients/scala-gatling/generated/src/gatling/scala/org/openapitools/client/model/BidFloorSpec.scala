
package org.openapitools.client.model


case class BidFloorSpec (
    _countries: Option[List[Country]],
    _currency: Currency,
    _objectiveType: Option[ObjectiveType],
    _billableEvent: ActionType,
    _optimizationGoalMetadata: Option[OptimizationGoalMetadata],
    _creativeType: Option[CreativeType]
)
object BidFloorSpec {
    def toStringBody(var_countries: Object, var_currency: Object, var_objectiveType: Object, var_billableEvent: Object, var_optimizationGoalMetadata: Object, var_creativeType: Object) =
        s"""
        | {
        | "countries":$var_countries,"currency":$var_currency,"objectiveType":$var_objectiveType,"billableEvent":$var_billableEvent,"optimizationGoalMetadata":$var_optimizationGoalMetadata,"creativeType":$var_creativeType
        | }
        """.stripMargin
}
