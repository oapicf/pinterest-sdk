
package org.openapitools.client.model


case class ConversionDeletionRequestCreate (
    /* Object containing the targets of the conversion deletion request. Users can be identified with user_emails, epiks, or both within the same request. */
    _deletionTargets: ConversionDeletionRequestTargets
)
object ConversionDeletionRequestCreate {
    def toStringBody(var_deletionTargets: Object) =
        s"""
        | {
        | "deletionTargets":$var_deletionTargets
        | }
        """.stripMargin
}
