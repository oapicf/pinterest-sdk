
package org.openapitools.client.model


case class ConversionDeletionRequestTargets (
    /* Array of plain text user emails. */
    _userEmails: List[String],
    /* Array of EPIKs (Encrypted Pinterest ID Keys). An EPIK is a user match type that utilizes 3P browser localStorage (similar to a third-party cookie). */
    _epiks: List[String]
)
object ConversionDeletionRequestTargets {
    def toStringBody(var_userEmails: Object, var_epiks: Object) =
        s"""
        | {
        | "userEmails":$var_userEmails,"epiks":$var_epiks
        | }
        """.stripMargin
}
