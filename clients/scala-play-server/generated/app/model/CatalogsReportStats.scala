package model

import play.api.libs.json._

/**
  * Diagnostics aggregated numbers
  * @param catalogId ID of the catalog entity.
  * @param code The event code that a diagnostics aggregated number references
  * @param codeLabel A human-friendly label for the event code (e.g, 'SPAM')
  * @param message Title message describing the diagnostic issue
  * @param occurrences Number of occurrences of the issue
  * @param severity An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue
  * @param ineligibleForAds Indicates if issue makes items ineligible for ads distribution
  * @param ineligibleForOrganic Indicates if issue makes items ineligible for organic distribution
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsReportStats(
  catalogId: Option[String],
  code: Option[Int],
  codeLabel: Option[String],
  message: Option[String],
  occurrences: Option[Int],
  reportType: Option[CatalogsReportStats.ReportType.Value],
  severity: Option[CatalogsReportStats.Severity.Value],
  ineligibleForAds: Option[Boolean],
  ineligibleForOrganic: Option[Boolean]
  additionalProperties: 
)

object CatalogsReportStats {
  implicit lazy val catalogsReportStatsJsonFormat: Format[CatalogsReportStats] = {
    val realJsonFormat = Json.format[CatalogsReportStats]
    val declaredPropNames = Set("catalogId", "code", "codeLabel", "message", "occurrences", "reportType", "severity", "ineligibleForAds", "ineligibleForOrganic")
    
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
      Writes { catalogsReportStats =>
        val jsObj = realJsonFormat.writes(catalogsReportStats)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }

  // noinspection TypeAnnotation
  object ReportType extends Enumeration {
    val DISTRIBUTIONISSUES = Value("DISTRIBUTION_ISSUES")

    type ReportType = Value
    implicit lazy val ReportTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object Severity extends Enumeration {
    val WARN = Value("WARN")
    val ERROR = Value("ERROR")

    type Severity = Value
    implicit lazy val SeverityJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

