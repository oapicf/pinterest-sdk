
package org.openapitools.client.model


case class BusinessSharedAudience (
    /* Unique identifier of an audience */
    _audienceId: String,
    _operationType: OperationType,
    /* List of business IDs to share with or revoke from. */
    _recipientBusinessIds: List[String]
)
object BusinessSharedAudience {
    def toStringBody(var_audienceId: Object, var_operationType: Object, var_recipientBusinessIds: Object) =
        s"""
        | {
        | "audienceId":$var_audienceId,"operationType":$var_operationType,"recipientBusinessIds":$var_recipientBusinessIds
        | }
        """.stripMargin
}
