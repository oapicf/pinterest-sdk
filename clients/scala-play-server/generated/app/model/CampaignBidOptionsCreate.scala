package model

import play.api.libs.json._

/**
  * Object describing the campaign level bid multipliers.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CampaignBidOptionsCreate(
  appTypeMultipliers: Option[AppTypeMultipliers],
  audienceMultipliers: Option[CampaignAudienceMultipliers],
  placementMultipliers: Option[PlacementMultipliers]
  additionalProperties: 
)

object CampaignBidOptionsCreate {
  implicit lazy val campaignBidOptionsCreateJsonFormat: Format[CampaignBidOptionsCreate] = {
    val realJsonFormat = Json.format[CampaignBidOptionsCreate]
    val declaredPropNames = Set("appTypeMultipliers", "audienceMultipliers", "placementMultipliers")
    
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
      Writes { campaignBidOptionsCreate =>
        val jsObj = realJsonFormat.writes(campaignBidOptionsCreate)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

