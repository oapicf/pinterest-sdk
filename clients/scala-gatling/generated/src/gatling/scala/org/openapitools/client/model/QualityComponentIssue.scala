
package org.openapitools.client.model


case class QualityComponentIssue (
    /* Unique identifier for the issue check. */
    _id: String,
    /* Human-readable name of the issue. */
    _name: String,
    /* Detailed reason for the issue. */
    _reason: String
)
object QualityComponentIssue {
    def toStringBody(var_id: Object, var_name: Object, var_reason: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"reason":$var_reason
        | }
        """.stripMargin
}
