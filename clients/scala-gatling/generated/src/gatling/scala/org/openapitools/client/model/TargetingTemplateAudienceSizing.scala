
package org.openapitools.client.model


case class TargetingTemplateAudienceSizing (
    _reachEstimate: Option[TargetingTemplateAudienceSizingReachEstimate]
)
object TargetingTemplateAudienceSizing {
    def toStringBody(var_reachEstimate: Object) =
        s"""
        | {
        | "reachEstimate":$var_reachEstimate
        | }
        """.stripMargin
}
