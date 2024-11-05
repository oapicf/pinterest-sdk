package org.openapitools.server.model


/**
 * @param audienceId Unique identifier of an audience for example: ''2542621871096''
 * @param operationType  for example: ''null''
 * @param recipientBusinessIds List of business IDs to share with or revoke from. for example: ''null''
*/
final case class BusinessSharedAudience (
  audienceId: String,
  operationType: OperationType,
  recipientBusinessIds: Seq[String]
)

