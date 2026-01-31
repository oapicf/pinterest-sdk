
package org.openapitools.client.model


case class QualityComponentDetails (
    /* Coverage percentage for this event type. */
    _coverage: Number,
    /* List of issues detected for this event type, if any. */
    _issues: Option[List[QualityComponentIssue]],
    /* Overlap percentage for this event type. Only populated for external_event_id */
    _overlap: Option[Number]
)
object QualityComponentDetails {
    def toStringBody(var_coverage: Object, var_issues: Object, var_overlap: Object) =
        s"""
        | {
        | "coverage":$var_coverage,"issues":$var_issues,"overlap":$var_overlap
        | }
        """.stripMargin
}
