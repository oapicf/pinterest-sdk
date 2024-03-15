package org.openapitools.server.model


/**
 * @param active True if the offer code is currently active. for example: ''true''
 * @param advertiserId Advertiser ID the offer was applied to. for example: ''12312451231''
 * @param discountType The type of discount of this credit for example: ''null''
 * @param discountInMicroCurrency The discount applied in the offer’s currency value. for example: ''125000000''
 * @param discountCurrency Currency value for the discount. for example: ''USD''
 * @param title Human readable title of the offer code. for example: ''Ads Credits''
 * @param remainingDiscountInMicroCurrency The credits left to spend. for example: ''125000000''
*/
final case class AdsCreditDiscountsResponse (
  active: Option[Boolean] = None,
  advertiserId: Option[String] = None,
  discountType: Option[String] = None,
  discountInMicroCurrency: Option[Double] = None,
  discountCurrency: Option[String] = None,
  title: Option[String] = None,
  remainingDiscountInMicroCurrency: Option[Double] = None
)

