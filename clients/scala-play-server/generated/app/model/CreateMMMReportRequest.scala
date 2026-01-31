package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateMMMReportRequest.
  * @param countries A List of countries for filtering
  * @param columns Metric and entity columns
  * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD
  * @param granularity DAY - metrics are broken down daily.<br> WEEK - metrics are broken down weekly.
  * @param level Level of the report
  * @param reportName Name of the Marketing Mix Modeling (MMM) report
  * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD
  * @param targetingTypes List of targeting types
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateMMMReportRequest(
  countries: Option[List[TargetingAdvertiserCountry]],
  columns: List[MMMReportingColumn],
  endDate: String,
  granularity: CreateMMMReportRequest.Granularity.Value,
  level: CreateMMMReportRequest.Level.Value,
  reportName: String,
  startDate: String,
  targetingTypes: List[MMMReportingTargetingType]
  additionalProperties: 
)

object CreateMMMReportRequest {
  implicit lazy val createMMMReportRequestJsonFormat: Format[CreateMMMReportRequest] = {
    val realJsonFormat = Json.format[CreateMMMReportRequest]
    val declaredPropNames = Set("countries", "columns", "endDate", "granularity", "level", "reportName", "startDate", "targetingTypes")
    
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
      Writes { createMMMReportRequest =>
        val jsObj = realJsonFormat.writes(createMMMReportRequest)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }

  // noinspection TypeAnnotation
  object Granularity extends Enumeration {
    val DAY = Value("DAY")
    val WEEK = Value("WEEK")

    type Granularity = Value
    implicit lazy val GranularityJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object Level extends Enumeration {
    val CAMPAIGNTARGETING = Value("CAMPAIGN_TARGETING")
    val ADGROUPTARGETING = Value("AD_GROUP_TARGETING")

    type Level = Value
    implicit lazy val LevelJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

