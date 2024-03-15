package model

import play.api.libs.json._

/**
  * Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class AdGroupCommonOptimizationGoalMetadata(
  conversionTagV3GoalMetadata: Option[OptimizationGoalMetadataConversionTagV3GoalMetadata],
  frequencyGoalMetadata: Option[OptimizationGoalMetadataFrequencyGoalMetadata],
  scrollupGoalMetadata: Option[OptimizationGoalMetadataScrollupGoalMetadata]
  additionalProperties: 
)

object AdGroupCommonOptimizationGoalMetadata {
  implicit lazy val adGroupCommonOptimizationGoalMetadataJsonFormat: Format[AdGroupCommonOptimizationGoalMetadata] = {
    val realJsonFormat = Json.format[AdGroupCommonOptimizationGoalMetadata]
    val declaredPropNames = Set("conversionTagV3GoalMetadata", "frequencyGoalMetadata", "scrollupGoalMetadata")
    
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
      Writes { adGroupCommonOptimizationGoalMetadata =>
        val jsObj = realJsonFormat.writes(adGroupCommonOptimizationGoalMetadata)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

