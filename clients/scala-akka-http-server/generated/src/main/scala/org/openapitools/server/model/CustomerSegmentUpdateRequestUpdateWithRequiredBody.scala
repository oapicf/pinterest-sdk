package org.openapitools.server.model


/**
 * Resource create or update operation model with required body fields (no OptionalProperties).
 *
 * @param audienceIds Audience IDs to update the customer segment to. Only applicable for UPDATE operations. for example: ''null''
 * @param id Customer segment ID. for example: ''null''
 * @param operationType  for example: ''null''
*/
final case class CustomerSegmentUpdateRequestUpdateWithRequiredBody (
  audienceIds: Option[Seq[String]] = None,
  id: String,
  operationType: AudienceUpdateOperationType
)

