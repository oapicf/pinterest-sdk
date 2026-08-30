package org.openapitools.server.model


/**
 * @param active True if the offer code is currently active. for example: ''true''
 * @param advertiserId Advertiser ID the offer was applied to. for example: ''12312451231''
 * @param discountCurrency Currency value for the discount. for example: ''USD''
 * @param discountInMicroCurrency The discount applied in the offer's currency value. for example: ''125000000''
 * @param discountType The type of discount of this credit for example: ''null''
 * @param remainingDiscountInMicroCurrency The credits left to spend. for example: ''125000000''
 * @param title Human readable title of the offer code. for example: ''Ads Credits''
*/
final case class AdsCreditDiscountsResponse (
  active: Option[Boolean] = None,
  advertiserId: Option[String] = None,
  discountCurrency: Option[String] = None,
  discountInMicroCurrency: Option[Double] = None,
  discountType: Option[AdsCreditDiscountType] = None,
  remainingDiscountInMicroCurrency: Option[Double] = None,
  title: Option[String] = None
)

