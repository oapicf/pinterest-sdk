
package org.openapitools.client.model


case class ConversionDeletionRequestUserEmailTargets (
    /* Array of plain text user emails. */
    _userEmails: List[String]
)
object ConversionDeletionRequestUserEmailTargets {
    def toStringBody(var_userEmails: Object) =
        s"""
        | {
        | "userEmails":$var_userEmails
        | }
        """.stripMargin
}
