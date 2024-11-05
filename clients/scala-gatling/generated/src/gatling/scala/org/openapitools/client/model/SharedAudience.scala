
package org.openapitools.client.model


case class SharedAudience (
    /* Unique identifier of an audience */
    _audienceId: String,
    _operationType: OperationType,
    /* List of ad account IDs to share with or revoke from. */
    _recipientAccountIds: List[String]
)
object SharedAudience {
    def toStringBody(var_audienceId: Object, var_operationType: Object, var_recipientAccountIds: Object) =
        s"""
        | {
        | "audienceId":$var_audienceId,"operationType":$var_operationType,"recipientAccountIds":$var_recipientAccountIds
        | }
        """.stripMargin
}
