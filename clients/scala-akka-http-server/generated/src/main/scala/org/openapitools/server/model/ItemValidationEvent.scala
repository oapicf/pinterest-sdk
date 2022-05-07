package org.openapitools.server.model


/**
 * Object describing an item validation event
 *
 * @param attribute The attribute that the item validation event references for example: ''title''
 * @param code The event code that the item validation event references for example: ''106''
 * @param message Title message describing the item validation event for example: ''Title is missing from product metadata.''
*/
final case class ItemValidationEvent (
  attribute: Option[String],
  code: Option[Int],
  message: Option[String]
)

