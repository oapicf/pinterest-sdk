
package org.openapitools.client.model


case class SharedAudienceResponse (
    /* Audience ID that was shared */
    _audienceId: Option[String],
    _permissions: Option[List[Role]],
    /* Account IDs that received the audience */
    _recipientAccountIds: Option[List[String]]
)
object SharedAudienceResponse {
    def toStringBody(var_audienceId: Object, var_permissions: Object, var_recipientAccountIds: Object) =
        s"""
        | {
        | "audienceId":$var_audienceId,"permissions":$var_permissions,"recipientAccountIds":$var_recipientAccountIds
        | }
        """.stripMargin
}
