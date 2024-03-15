package model

import play.api.libs.json._
import java.time.LocalDate

/**
  * Represents the Swagger definition for AdAccountAnalyticsResponse_inner.
  * @param AD_ACCOUNT_ID The ID of the advertiser that this metrics belongs to.
  * @param DATE Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class AdAccountAnalyticsResponseInner(
  AD_ACCOUNT_ID: String,
  DATE: Option[LocalDate]
  additionalProperties: Map[String, OasAnyTypeNotMapped]
)

object AdAccountAnalyticsResponseInner {
  implicit lazy val adAccountAnalyticsResponseInnerJsonFormat: Format[AdAccountAnalyticsResponseInner] = {
    val realJsonFormat = Json.format[AdAccountAnalyticsResponseInner]
    val declaredPropNames = Set("AD_ACCOUNT_ID", "DATE")
    
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
      Writes { adAccountAnalyticsResponseInner =>
        val jsObj = realJsonFormat.writes(adAccountAnalyticsResponseInner)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

