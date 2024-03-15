package org.openapitools.server.model


/**
 * Two set of objects to be managed asyncronusly by bulk. One for creations, one for modifications.
 *
 * @param create  for example: ''null''
 * @param update  for example: ''null''
*/
final case class BulkUpsertRequest (
  create: Option[BulkUpsertRequestCreate] = None,
  update: Option[BulkUpsertRequestUpdate] = None
)

