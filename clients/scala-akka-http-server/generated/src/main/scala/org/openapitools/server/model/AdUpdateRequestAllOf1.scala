package org.openapitools.server.model


/**
 * = AdUpdateRequest =
 *
 * @param id The ID of this ad. for example: ''null''
 * @param pinId Pin ID. This field may only be updated for draft ads. for example: ''null''
*/
final case class AdUpdateRequestAllOf1 (
  id: String,
  pinId: Option[String] = None
)

