package org.openapitools.server.model


/**
 * @param advertiserId Advertiser ID of the billing. for example: ''12312451231''
 * @param billingType Billing type of the advertiser for example: ''CREDIT_CARD''
 * @param cardType Type of the card. for example: ''VISA''
 * @param id Billing ID. for example: ''12312451231''
 * @param paymentMethodBrand Brand of the payment method. for example: ''VISA''
 * @param status Status of the billing. for example: ''INVALID''
*/
final case class BillingProfilesResponse (
  advertiserId: Option[String] = None,
  billingType: Option[BillingType] = None,
  cardType: Option[BillingProfileCardType] = None,
  id: Option[String] = None,
  paymentMethodBrand: Option[BillingProfilePaymentMethodBrand] = None,
  status: Option[BillingProfileStatus] = None
)

