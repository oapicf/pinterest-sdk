package org.openapitools.server.model


/**
 * Item validation event
 *
 * @param attribute The item attribute referenced by the validation event eg. price, availability, ad_link for example: ''price''
 * @param code The event code that the item validation event references for example: ''113''
 * @param message Title message describing the item validation event for example: ''Some supplemental item data was not published due to incorrect formatting''
*/
final case class SupplementalItemValidationEvent (
  attribute: String,
  code: Int,
  message: String
)

