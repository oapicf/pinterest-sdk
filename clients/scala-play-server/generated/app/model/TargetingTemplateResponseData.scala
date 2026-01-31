package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TargetingTemplateResponseData.
  * @param autoTargetingEnabled Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
  * @param name targeting template name
  * @param adAccountId The ID of the advertiser that this targeting template belongs to.
  * @param createdTime Targeting template created time. Unix timestamp in seconds.
  * @param id Targeting template ID.
  * @param status Indicate targeting template is active or Deleted
  * @param updatedTime Targeting template updated time.Unix timestamp in seconds.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class TargetingTemplateResponseData(
  autoTargetingEnabled: Option[Boolean],
  keywords: Option[List[TargetingTemplateKeyword]],
  name: Option[String],
  placementGroup: Option[PlacementGroupType],
  targetingAttributes: Option[TargetingSpec],
  trackingUrls: Option[TrackingUrls],
  adAccountId: Option[String],
  createdTime: Option[Int],
  id: Option[String],
  sizing: Option[TargetingTemplateAudienceSizing],
  status: Option[TargetingTemplateResponseData.Status.Value],
  updatedTime: Option[Int]
  additionalProperties: 
)

object TargetingTemplateResponseData {
  implicit lazy val targetingTemplateResponseDataJsonFormat: Format[TargetingTemplateResponseData] = {
    val realJsonFormat = Json.format[TargetingTemplateResponseData]
    val declaredPropNames = Set("autoTargetingEnabled", "keywords", "name", "placementGroup", "targetingAttributes", "trackingUrls", "adAccountId", "createdTime", "id", "sizing", "status", "updatedTime")
    
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
      Writes { targetingTemplateResponseData =>
        val jsObj = realJsonFormat.writes(targetingTemplateResponseData)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }

  // noinspection TypeAnnotation
  object Status extends Enumeration {
    val ACTIVE = Value("ACTIVE")
    val DELETED = Value("DELETED")

    type Status = Value
    implicit lazy val StatusJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

