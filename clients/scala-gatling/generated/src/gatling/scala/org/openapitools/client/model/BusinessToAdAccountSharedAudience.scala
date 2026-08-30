
package org.openapitools.client.model


case class BusinessToAdAccountSharedAudience (
    /* Unique identifier of an audience */
    _audienceId: String,
    /* Permissions granted to the recipients. */
    _permissions: Option[List[Role]],
    /* Ad account IDs to share with or revoke from (request) / that received the audience (response). */
    _recipientAccountIds: List[String]
)
object BusinessToAdAccountSharedAudience {
    def toStringBody(var_audienceId: Object, var_permissions: Object, var_recipientAccountIds: Object) =
        s"""
        | {
        | "audienceId":$var_audienceId,"permissions":$var_permissions,"recipientAccountIds":$var_recipientAccountIds
        | }
        """.stripMargin
}
