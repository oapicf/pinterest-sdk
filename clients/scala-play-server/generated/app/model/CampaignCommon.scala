package model

import play.api.libs.json._

/**
  * Campaign Data
  * @param adAccountId Campaign's Advertiser ID.
  * @param name Campaign name.
  * @param lifetimeSpendCap Campaign total spending cap.
  * @param dailySpendCap Campaign daily spending cap.
  * @param orderLineId Order line ID that appears on the invoice.
  * @param startTime Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
  * @param endTime Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-07T10:47:31.836531Z[Etc/UTC]")
case class CampaignCommon(
  adAccountId: String,
  name: Option[String],
  status: Option[EntityStatus],
  lifetimeSpendCap: Option[Int],
  dailySpendCap: Option[Int],
  orderLineId: Option[String],
  trackingUrls: Option[TrackingUrls],
  startTime: Option[Int],
  endTime: Option[Int]
  additionalProperties: 
)

object CampaignCommon {
  implicit lazy val campaignCommonJsonFormat: Format[CampaignCommon] = {
    val realJsonFormat = Json.format[CampaignCommon]
    val declaredPropNames = Set("adAccountId", "name", "status", "lifetimeSpendCap", "dailySpendCap", "orderLineId", "trackingUrls", "startTime", "endTime")
    
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
      Writes { campaignCommon =>
        val jsObj = realJsonFormat.writes(campaignCommon)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

