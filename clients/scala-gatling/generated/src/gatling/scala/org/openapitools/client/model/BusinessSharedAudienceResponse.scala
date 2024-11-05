
package org.openapitools.client.model


case class BusinessSharedAudienceResponse (
    /* Audience ID that was shared */
    _audienceId: Option[String],
    _permissions: Option[List[Role]],
    /* Business IDs that received the audience */
    _recipientBusinessIds: Option[List[String]]
)
object BusinessSharedAudienceResponse {
    def toStringBody(var_audienceId: Object, var_permissions: Object, var_recipientBusinessIds: Object) =
        s"""
        | {
        | "audienceId":$var_audienceId,"permissions":$var_permissions,"recipientBusinessIds":$var_recipientBusinessIds
        | }
        """.stripMargin
}
