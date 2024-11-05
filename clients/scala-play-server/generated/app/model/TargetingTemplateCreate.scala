package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TargetingTemplateCreate.
  * @param name Name of targeting template.
  * @param autoTargetingEnabled Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class TargetingTemplateCreate(
  name: String,
  autoTargetingEnabled: Option[Boolean],
  targetingAttributes: TargetingSpec,
  placementGroup: Option[PlacementGroupType],
  keywords: Option[List[TargetingTemplateKeyword]],
  trackingUrls: Option[TrackingUrls]
  additionalProperties: 
)

object TargetingTemplateCreate {
  implicit lazy val targetingTemplateCreateJsonFormat: Format[TargetingTemplateCreate] = {
    val realJsonFormat = Json.format[TargetingTemplateCreate]
    val declaredPropNames = Set("name", "autoTargetingEnabled", "targetingAttributes", "placementGroup", "keywords", "trackingUrls")
    
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
      Writes { targetingTemplateCreate =>
        val jsObj = realJsonFormat.writes(targetingTemplateCreate)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

