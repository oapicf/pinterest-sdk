package org.openapitools.server.model


/**
 * Resource create operation model.
 *
 * @param discountStatus  for example: ''null''
 * @param endTime Promotion end time. Unix timestamp in seconds. Independent of campaign end time. for example: ''null''
 * @param externalId Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest. for example: ''null''
 * @param platformType The source integration platform used when creating the promotion. Currently supported values are 'DEFAULT' and 'SHOPIFY'. for example: ''null''
 * @param promotionCode Code that can be used to redeem a promotion. for example: ''null''
 * @param promotionCustomId An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one. for example: ''null''
 * @param promotionTitle Internal name for the promotion. for example: ''null''
 * @param promotionType  for example: ''null''
 * @param startTime Promotion start time. Unix timestamp in seconds. Independent of campaign start time. for example: ''null''
 * @param templateValues List of values to be inserted in the promotion type-specific template. for example: ''null''
*/
final case class PromotionCreate (
  discountStatus: Option[DiscountStatus] = None,
  endTime: Option[Int] = None,
  externalId: Option[String] = None,
  platformType: Option[String] = None,
  promotionCode: Option[String] = None,
  promotionCustomId: Option[String] = None,
  promotionTitle: String,
  promotionType: PromotionType,
  startTime: Option[Int] = None,
  templateValues: Option[Seq[PromotionTemplateValue]] = None
)

