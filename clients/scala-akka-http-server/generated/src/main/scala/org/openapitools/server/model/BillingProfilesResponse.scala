package org.openapitools.server.model


/**
 * @param id Billing ID. for example: ''12312451231''
 * @param cardType Type of the card. for example: ''VISA''
 * @param status Status of the billing. for example: ''INVALID''
 * @param advertiserId Advertiser ID of the billing. for example: ''12312451231''
 * @param paymentMethodBrand Brand of the payment method. for example: ''VISA''
*/
final case class BillingProfilesResponse (
  id: Option[String] = None,
  cardType: Option[String] = None,
  status: Option[String] = None,
  advertiserId: Option[String] = None,
  paymentMethodBrand: Option[String] = None
)

