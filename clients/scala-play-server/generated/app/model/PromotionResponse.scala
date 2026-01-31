package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PromotionResponse.
  * @param discountStatus Discount status based on the current time and start and end time of discount
  * @param endTime Promotion end time. Unix timestamp in seconds. Independent of campaign end time.
  * @param externalId Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest.
  * @param platformType The source integration platform used when creating the promotion. Currently supported values are 'DEFAULT' and 'SHOPIFY'.
  * @param promotionCode Code that can be used to redeem a promotion.
  * @param promotionCustomId An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one.
  * @param promotionTitle Internal name for the promotion.
  * @param startTime Promotion start time. Unix timestamp in seconds. Independent of campaign start time.
  * @param templateValues List of values to be inserted in the promotion type-specific template.
  * @param adAccountId The Ad Account ID that this promotion belongs to.
  * @param id Promotion ID
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class PromotionResponse(
  discountStatus: Option[PromotionResponse.DiscountStatus.Value],
  endTime: Option[Int],
  externalId: Option[String],
  platformType: Option[String],
  promotionCode: Option[String],
  promotionCustomId: Option[String],
  promotionTitle: Option[String],
  promotionType: Option[PromotionType],
  startTime: Option[Int],
  templateValues: Option[List[PromotionTemplateValue]],
  adAccountId: Option[String],
  id: Option[String],
  status: Option[EntityStatus]
  additionalProperties: 
)

object PromotionResponse {
  implicit lazy val promotionResponseJsonFormat: Format[PromotionResponse] = {
    val realJsonFormat = Json.format[PromotionResponse]
    val declaredPropNames = Set("discountStatus", "endTime", "externalId", "platformType", "promotionCode", "promotionCustomId", "promotionTitle", "promotionType", "startTime", "templateValues", "adAccountId", "id", "status")
    
    Format(
      Reads {
        case JsObject(xs) =>
          val declaredProps = xs.filterKeys(declaredPropNames)
          val additionalProps = JsObject(xs -- declaredPropNames)
          val restructuredProps = declaredProps + ("additionalProperties" -> additionalProps)
          val newObj = JsObject(restructuredProps)
          realJsonFormat.reads(newObj)
        case _ =>
          JsError("error.expected.jsobject")
      },
      Writes { promotionResponse =>
        val jsObj = realJsonFormat.writes(promotionResponse)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }

  // noinspection TypeAnnotation
  object DiscountStatus extends Enumeration {
    val OTHER = Value("OTHER")
    val ACTIVE = Value("ACTIVE")
    val PAUSED = Value("PAUSED")
    val SCHEDULED = Value("SCHEDULED")
    val EXPIRED = Value("EXPIRED")

    type DiscountStatus = Value
    implicit lazy val DiscountStatusJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

