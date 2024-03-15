package org.openapitools.server.model


/**
 * = Pin URL =
 *
 * Pin URL-based media source for product pin creation. Currently the field is only available to a list of beta users.
 *
 * @param sourceType  for example: ''null''
 * @param isAffiliateLink This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products. for example: ''null''
*/
final case class PinMediaSourcePinURL (
  sourceType: String,
  isAffiliateLink: Option[Boolean] = None
)

