
package org.openapitools.client.model


case class CustomerSegmentUpdateRequestUpdateWithRequiredBody (
    /* Audience IDs to update the customer segment to. Only applicable for UPDATE operations. */
    _audienceIds: Option[List[String]],
    /* Customer segment ID. */
    _id: String,
    _operationType: AudienceUpdateOperationType
)
object CustomerSegmentUpdateRequestUpdateWithRequiredBody {
    def toStringBody(var_audienceIds: Object, var_id: Object, var_operationType: Object) =
        s"""
        | {
        | "audienceIds":$var_audienceIds,"id":$var_id,"operationType":$var_operationType
        | }
        """.stripMargin
}
