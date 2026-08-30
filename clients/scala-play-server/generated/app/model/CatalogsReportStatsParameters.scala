package model

import play.api.libs.json._

/**
  * Report stats parameters
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsReportStatsParameters(
  catalogType: CatalogsReportStatsParameters.CatalogType.Value,
  report: CatalogsHotelReportStatsParametersReport
  additionalProperties: 
)

object CatalogsReportStatsParameters {
  implicit lazy val catalogsReportStatsParametersJsonFormat: Format[CatalogsReportStatsParameters] = {
    val realJsonFormat = Json.format[CatalogsReportStatsParameters]
    val declaredPropNames = Set("catalogType", "report")
    
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
      Writes { catalogsReportStatsParameters =>
        val jsObj = realJsonFormat.writes(catalogsReportStatsParameters)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val HOTEL = Value("HOTEL")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

