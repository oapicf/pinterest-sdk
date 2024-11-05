package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TargetingTemplateGetResponseData.
  * @param name targeting template name
  * @param autoTargetingEnabled Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
  * @param id Targeting template ID.
  * @param createdTime Targeting template created time. Unix timestamp in seconds.
  * @param updatedTime Targeting template updated time.Unix timestamp in seconds.
  * @param adAccountId The ID of the advertiser that this targeting template belongs to.
  * @param status Indicate targeting template is active or Deleted
  * @param valid Inform if the targeting template is valid (ex. would be false if has revoked audience)
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class TargetingTemplateGetResponseData(
  name: Option[String],
  autoTargetingEnabled: Option[Boolean],
  targetingAttributes: Option[TargetingSpec],
  placementGroup: Option[PlacementGroupType],
  keywords: Option[List[TargetingTemplateKeyword]],
  trackingUrls: Option[TrackingUrls],
  id: Option[String],
  createdTime: Option[Int],
  updatedTime: Option[Int],
  adAccountId: Option[String],
  status: Option[TargetingTemplateGetResponseData.Status.Value],
  sizing: Option[TargetingTemplateAudienceSizing],
  valid: Option[Boolean]
  additionalProperties: 
)

object TargetingTemplateGetResponseData {
  implicit lazy val targetingTemplateGetResponseDataJsonFormat: Format[TargetingTemplateGetResponseData] = {
    val realJsonFormat = Json.format[TargetingTemplateGetResponseData]
    val declaredPropNames = Set("name", "autoTargetingEnabled", "targetingAttributes", "placementGroup", "keywords", "trackingUrls", "id", "createdTime", "updatedTime", "adAccountId", "status", "sizing", "valid")
    
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
      Writes { targetingTemplateGetResponseData =>
        val jsObj = realJsonFormat.writes(targetingTemplateGetResponseData)
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

