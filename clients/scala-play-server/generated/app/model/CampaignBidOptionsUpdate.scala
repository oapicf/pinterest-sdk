package model

import play.api.libs.json._

/**
  * Object describing an update to the campaign level bid multipliers.
  * @param updateMask List of fields to update, only the fields in the list will be updated.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CampaignBidOptionsUpdate(
  appTypeMultipliers: Option[AppTypeMultipliers],
  audienceMultipliers: Option[CampaignAudienceMultipliers],
  placementMultipliers: Option[PlacementMultipliers],
  updateMask: CampaignBidOptionsUpdate.UpdateMask.Value
  additionalProperties: 
)

object CampaignBidOptionsUpdate {
  implicit lazy val campaignBidOptionsUpdateJsonFormat: Format[CampaignBidOptionsUpdate] = {
    val realJsonFormat = Json.format[CampaignBidOptionsUpdate]
    val declaredPropNames = Set("appTypeMultipliers", "audienceMultipliers", "placementMultipliers", "updateMask")
    
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
      Writes { campaignBidOptionsUpdate =>
        val jsObj = realJsonFormat.writes(campaignBidOptionsUpdate)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }

  // noinspection TypeAnnotation
  object UpdateMask extends Enumeration {
    val AUDIENCE = Value("AUDIENCE")
    val APPTYPE = Value("APP_TYPE")
    val PLACEMENT = Value("PLACEMENT")
    val GENDER = Value("GENDER")
    val AGEBUCKET = Value("AGE_BUCKET")

    type UpdateMask = Value
    implicit lazy val UpdateMaskJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

