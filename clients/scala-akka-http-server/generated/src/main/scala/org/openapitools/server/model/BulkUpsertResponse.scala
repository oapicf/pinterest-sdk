package org.openapitools.server.model


/**
 * ID of the bulk request.
 *
 * @param requestId  for example: ''549763856477-1660864560-1407e16a-c586-4add-94df-d0b160bec0ff, 549763856477-1660864560-d0b160bec0ff''
*/
final case class BulkUpsertResponse (
  requestId: Option[String] = None
)

