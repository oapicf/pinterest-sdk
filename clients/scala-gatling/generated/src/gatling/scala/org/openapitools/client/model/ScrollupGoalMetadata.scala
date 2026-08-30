
package org.openapitools.client.model


case class ScrollupGoalMetadata (
    _scrollupGoalValueInMicroCurrency: Option[String]
)
object ScrollupGoalMetadata {
    def toStringBody(var_scrollupGoalValueInMicroCurrency: Object) =
        s"""
        | {
        | "scrollupGoalValueInMicroCurrency":$var_scrollupGoalValueInMicroCurrency
        | }
        """.stripMargin
}
