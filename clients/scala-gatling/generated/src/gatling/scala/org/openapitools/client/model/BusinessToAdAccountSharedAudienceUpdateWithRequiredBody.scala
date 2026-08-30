
package org.openapitools.client.model


case class BusinessToAdAccountSharedAudienceUpdateWithRequiredBody (
    /* Unique identifier of an audience */
    _audienceId: String,
    _operationType: OperationType,
    /* Ad account IDs to share with or revoke from (request) / that received the audience (response). */
    _recipientAccountIds: List[String]
)
object BusinessToAdAccountSharedAudienceUpdateWithRequiredBody {
    def toStringBody(var_audienceId: Object, var_operationType: Object, var_recipientAccountIds: Object) =
        s"""
        | {
        | "audienceId":$var_audienceId,"operationType":$var_operationType,"recipientAccountIds":$var_recipientAccountIds
        | }
        """.stripMargin
}
