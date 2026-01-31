package org.openapitools.server.model


/**
 * = Media object containing URL type definition. =
 *
 * Pin URL-based media source for product pin creation. Currently the field is only available to a list of beta users.
 *
 * @param isAffiliateLink This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products. for example: ''null''
 * @param sourceType  for example: ''null''
*/
final case class PinMediaSourcePinURL (
  isAffiliateLink: Option[Boolean] = None,
  sourceType: String
)

