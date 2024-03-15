
package org.openapitools.client.model


case class OptimizationGoalMetadataScrollupGoalMetadata (
    _scrollupGoalValueInMicroCurrency: Option[String]
)
object OptimizationGoalMetadataScrollupGoalMetadata {
    def toStringBody(var_scrollupGoalValueInMicroCurrency: Object) =
        s"""
        | {
        | "scrollupGoalValueInMicroCurrency":$var_scrollupGoalValueInMicroCurrency
        | }
        """.stripMargin
}
