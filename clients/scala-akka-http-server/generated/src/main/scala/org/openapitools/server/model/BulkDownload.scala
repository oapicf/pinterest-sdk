package org.openapitools.server.model


/**
 * Ad entities to get in bulk request.
 *
 * @param requestId ID of the bulk request. for example: ''2680059592705''
*/
final case class BulkDownload (
  requestId: Option[String] = None
)

