package org.openapitools.server.model


/**
 * = AmazonConnectRequest =
 *
 * Request containing OTP and Amazon storefront info called by Amazon
 *
 * @param amazonStorefrontId The Amazon storefront id for example: ''null''
 * @param amazonStorefrontName The Amazon storefront name for example: ''null''
 * @param amazonStorefrontUrl The Amazon storefront url for example: ''null''
 * @param amazonUserId The Amazon user id for example: ''null''
 * @param isAmazonAccountLinked The Amazon account linking status for example: ''null''
 * @param oneTimePasscode The one time passcode for Pinterest-initiated linking requests for example: ''089aee0d-92d3-4f8f-a947-6dc016d85bf0''
 * @param pinterestUserId The Pinterest user id for Amazon-initiated linking requests for example: ''902057137772013006''
*/
final case class AmazonConnectRequest (
  amazonStorefrontId: Option[String] = None,
  amazonStorefrontName: String,
  amazonStorefrontUrl: String,
  amazonUserId: Option[String] = None,
  isAmazonAccountLinked: Boolean,
  oneTimePasscode: Option[String] = None,
  pinterestUserId: Option[String] = None
)

