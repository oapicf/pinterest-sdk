package org.openapitools.server.model


/**
 * @param audienceId Unique identifier of an audience for example: ''2542621871096''
 * @param operationType  for example: ''null''
 * @param recipientAccountIds List of ad account IDs to share with or revoke from. for example: ''null''
*/
final case class SharedAudience (
  audienceId: String,
  operationType: OperationType,
  recipientAccountIds: Seq[String]
)

