package model

import play.api.libs.json._
import java.time.LocalDate

/**
  * Represents the Swagger definition for CampaignsAnalyticsResponse_inner.
  * @param CAMPAIGN_ID The ID of the campaing that this metrics belongs to. Returned as long as aggregate_report_rows is not true.
  * @param DATE Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CampaignsAnalyticsResponseInner(
  CAMPAIGN_ID: Option[String],
  DATE: Option[LocalDate]
  additionalProperties: Map[String, OasAnyTypeNotMapped]
)

object CampaignsAnalyticsResponseInner {
  implicit lazy val campaignsAnalyticsResponseInnerJsonFormat: Format[CampaignsAnalyticsResponseInner] = {
    val realJsonFormat = Json.format[CampaignsAnalyticsResponseInner]
    val declaredPropNames = Set("CAMPAIGN_ID", "DATE")
    
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
      Writes { campaignsAnalyticsResponseInner =>
        val jsObj = realJsonFormat.writes(campaignsAnalyticsResponseInner)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

