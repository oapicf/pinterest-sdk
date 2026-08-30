package org.openapitools.server.model


/**
 * @param data  for example: ''null''
 * @param exceptions  for example: ''null''
*/
final case class AdBatchItem (
  data: Option[Ad] = None,
  exceptions: Option[Error] = None
)

