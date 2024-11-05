package model

import play.api.libs.json._
import java.time.LocalDate

/**
  * Represents the Swagger definition for AdGroupsAnalyticsResponse_inner.
  * @param AD_GROUP_ID The ID of the ad group that this metrics belongs to.
  * @param DATE Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class AdGroupsAnalyticsResponseInner(
  AD_GROUP_ID: String,
  DATE: Option[LocalDate]
  additionalProperties: Map[String, OasAnyTypeNotMapped]
)

object AdGroupsAnalyticsResponseInner {
  implicit lazy val adGroupsAnalyticsResponseInnerJsonFormat: Format[AdGroupsAnalyticsResponseInner] = {
    val realJsonFormat = Json.format[AdGroupsAnalyticsResponseInner]
    val declaredPropNames = Set("AD_GROUP_ID", "DATE")
    
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
      Writes { adGroupsAnalyticsResponseInner =>
        val jsObj = realJsonFormat.writes(adGroupsAnalyticsResponseInner)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

