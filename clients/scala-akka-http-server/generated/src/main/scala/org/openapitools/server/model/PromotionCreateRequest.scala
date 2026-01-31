package org.openapitools.server.model


/**
 * @param discountStatus Discount status based on the current time and start and end time of discount for example: ''ACTIVE''
 * @param endTime Promotion end time. Unix timestamp in seconds. Independent of campaign end time. for example: ''1678003860''
 * @param externalId Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest. for example: ''abc''
 * @param platformType The source integration platform used when creating the promotion. Currently supported values are 'DEFAULT' and 'SHOPIFY'. for example: ''DEFAULT''
 * @param promotionCode Code that can be used to redeem a promotion. for example: ''blackfriday10''
 * @param promotionCustomId An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one. for example: ''freeshipping_2025''
 * @param promotionTitle Internal name for the promotion. for example: ''Black Friday 10% off''
 * @param promotionType  for example: ''null''
 * @param startTime Promotion start time. Unix timestamp in seconds. Independent of campaign start time. for example: ''1677003860''
 * @param templateValues List of values to be inserted in the promotion type-specific template. for example: ''null''
*/
final case class PromotionCreateRequest (
  discountStatus: Option[String] = None,
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

