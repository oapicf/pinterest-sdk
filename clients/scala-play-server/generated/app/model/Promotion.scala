package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Promotion.
  * @param adAccountId The Ad Account ID that this promotion belongs to.
  * @param endTime Promotion end time. Unix timestamp in seconds. Independent of campaign end time.
  * @param externalId Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest.
  * @param id Promotion ID
  * @param platformType The source integration platform used when creating the promotion. Currently supported values are 'DEFAULT' and 'SHOPIFY'.
  * @param promotionCode Code that can be used to redeem a promotion.
  * @param promotionCustomId An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one.
  * @param promotionTitle Internal name for the promotion.
  * @param startTime Promotion start time. Unix timestamp in seconds. Independent of campaign start time.
  * @param templateValues List of values to be inserted in the promotion type-specific template.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class Promotion(
  adAccountId: String,
  discountStatus: Option[DiscountStatus],
  endTime: Option[Int],
  externalId: Option[String],
  id: String,
  platformType: Option[String],
  promotionCode: Option[String],
  promotionCustomId: Option[String],
  promotionTitle: String,
  promotionType: PromotionType,
  startTime: Option[Int],
  status: Option[EntityStatus],
  templateValues: Option[List[PromotionTemplateValue]]
)

object Promotion {
  implicit lazy val promotionJsonFormat: Format[Promotion] = Json.format[Promotion]
}

