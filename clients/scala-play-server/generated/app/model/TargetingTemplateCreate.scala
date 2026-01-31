package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TargetingTemplateCreate.
  * @param autoTargetingEnabled Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
  * @param name Name of targeting template.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class TargetingTemplateCreate(
  autoTargetingEnabled: Option[Boolean],
  keywords: Option[List[TargetingTemplateKeyword]],
  name: String,
  placementGroup: Option[PlacementGroupType],
  targetingAttributes: TargetingSpec,
  trackingUrls: Option[TrackingUrls]
  additionalProperties: 
)

object TargetingTemplateCreate {
  implicit lazy val targetingTemplateCreateJsonFormat: Format[TargetingTemplateCreate] = {
    val realJsonFormat = Json.format[TargetingTemplateCreate]
    val declaredPropNames = Set("autoTargetingEnabled", "keywords", "name", "placementGroup", "targetingAttributes", "trackingUrls")
    
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

