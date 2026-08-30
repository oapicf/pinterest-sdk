package org.openapitools.server.model


/**
 * Exception details for a batch operation item.
 *
 * @param code  for example: ''2''
 * @param message  for example: ''Advertiser not found.''
*/
final case class BatchItemException (
  code: Option[Int] = None,
  message: String
)

