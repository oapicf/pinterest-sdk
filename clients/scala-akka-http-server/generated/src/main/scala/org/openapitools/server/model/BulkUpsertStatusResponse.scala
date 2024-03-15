package org.openapitools.server.model


/**
 * ID of the bulk request.
 *
 * @param status  for example: ''null''
 * @param resultUrl  for example: ''https://pinterest-waterloo.s3.us-east-1.amazonaws.com/bulk_framework/AD_ENTITY_UPSERT/549763856637-1659122537-0b4d77d3-f620-48ce-bec9-616106afb8d4/(...)''
*/
final case class BulkUpsertStatusResponse (
  status: Option[BulkUpsertStatus] = None,
  resultUrl: Option[String] = None
)

