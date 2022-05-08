package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TargetingTypeFilter.
  * @param targetingTypes List of targeting types
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-08T00:41:34.847921Z[Etc/UTC]")
case class TargetingTypeFilter(
  targetingTypes: Option[List[AdsAnalyticsTargetingType]]
  additionalProperties: 
)

object TargetingTypeFilter {
  implicit lazy val targetingTypeFilterJsonFormat: Format[TargetingTypeFilter] = {
    val realJsonFormat = Json.format[TargetingTypeFilter]
    val declaredPropNames = Set("targetingTypes")
    
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
      Writes { targetingTypeFilter =>
        val jsObj = realJsonFormat.writes(targetingTypeFilter)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

