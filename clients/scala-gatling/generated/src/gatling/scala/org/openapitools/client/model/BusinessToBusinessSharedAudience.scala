
package org.openapitools.client.model


case class BusinessToBusinessSharedAudience (
    /* Unique identifier of an audience */
    _audienceId: String,
    /* Permissions granted to the recipients. */
    _permissions: Option[List[Role]],
    /* Business IDs to share with or revoke from (request) / that received the audience (response). */
    _recipientBusinessIds: List[String]
)
object BusinessToBusinessSharedAudience {
    def toStringBody(var_audienceId: Object, var_permissions: Object, var_recipientBusinessIds: Object) =
        s"""
        | {
        | "audienceId":$var_audienceId,"permissions":$var_permissions,"recipientBusinessIds":$var_recipientBusinessIds
        | }
        """.stripMargin
}
