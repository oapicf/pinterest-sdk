package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsRetailReportStatsParametersReport.
  * @param feedId ID of the feed entity.
  * @param processingResultId Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.
  * @param catalogId Unique identifier of a catalog. If not given, oldest catalog will be used
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsRetailReportStatsParametersReport(
  feedId: String,
  processingResultId: Option[String],
  reportType: CatalogsRetailReportStatsParametersReport.ReportType.Value,
  catalogId: Option[String]
  additionalProperties: 
)

object CatalogsRetailReportStatsParametersReport {
  implicit lazy val catalogsRetailReportStatsParametersReportJsonFormat: Format[CatalogsRetailReportStatsParametersReport] = {
    val realJsonFormat = Json.format[CatalogsRetailReportStatsParametersReport]
    val declaredPropNames = Set("feedId", "processingResultId", "reportType", "catalogId")
    
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
      Writes { catalogsRetailReportStatsParametersReport =>
        val jsObj = realJsonFormat.writes(catalogsRetailReportStatsParametersReport)
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
}

