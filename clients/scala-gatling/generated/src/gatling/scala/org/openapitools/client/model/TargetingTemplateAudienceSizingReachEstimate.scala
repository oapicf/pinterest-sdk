
package org.openapitools.client.model


case class TargetingTemplateAudienceSizingReachEstimate (
    _estimate: Option[Long],
    _lowerBound: Option[Long],
    _upperBound: Option[Long]
)
object TargetingTemplateAudienceSizingReachEstimate {
    def toStringBody(var_estimate: Object, var_lowerBound: Object, var_upperBound: Object) =
        s"""
        | {
        | "estimate":$var_estimate,"lowerBound":$var_lowerBound,"upperBound":$var_upperBound
        | }
        """.stripMargin
}
