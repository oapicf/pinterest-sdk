package org.openapitools.server.model


/**
 * Resource create or update operation model with required body fields (no OptionalProperties).
 *
 * @param audienceId Unique identifier of an audience for example: ''2542621871096''
 * @param operationType  for example: ''null''
 * @param recipientBusinessIds Business IDs to share with or revoke from (request) / that received the audience (response). for example: ''null''
*/
final case class AdAccountToBusinessSharedAudienceUpdateWithRequiredBody (
  audienceId: String,
  operationType: OperationType,
  recipientBusinessIds: Seq[String]
)

