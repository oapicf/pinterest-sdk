
package org.openapitools.client.model


case class BusinessToBusinessSharedAudienceUpdateWithRequiredBody (
    /* Unique identifier of an audience */
    _audienceId: String,
    _operationType: OperationType,
    /* Business IDs to share with or revoke from (request) / that received the audience (response). */
    _recipientBusinessIds: List[String]
)
object BusinessToBusinessSharedAudienceUpdateWithRequiredBody {
    def toStringBody(var_audienceId: Object, var_operationType: Object, var_recipientBusinessIds: Object) =
        s"""
        | {
        | "audienceId":$var_audienceId,"operationType":$var_operationType,"recipientBusinessIds":$var_recipientBusinessIds
        | }
        """.stripMargin
}
