package org.openapitools.server.model


/**
 * = Promotion template value =
 *
 * @param amount Numeric value. for example: ''100''
 * @param currencyCode  for example: ''null''
 * @param customText Custom text. for example: ''My promotion''
 * @param percent Percent value. for example: ''10''
*/
final case class PromotionTemplateValue (
  amount: Option[Double] = None,
  currencyCode: Option[Currency] = None,
  customText: Option[String] = None,
  percent: Option[Double] = None
)

