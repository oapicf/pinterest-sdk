package model

import play.api.libs.json._
import java.time.LocalDate

/**
  * Represents the Swagger definition for ProductGroupAnalyticsResponse_inner.
  * @param DATE Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
  * @param PRODUCT_GROUP_ID The ID of the product group that this metrics belongs to.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ProductGroupAnalyticsResponseInner(
  DATE: Option[LocalDate],
  PRODUCT_GROUP_ID: String
  additionalProperties: Map[String, OasAnyTypeNotMapped]
)

object ProductGroupAnalyticsResponseInner {
  implicit lazy val productGroupAnalyticsResponseInnerJsonFormat: Format[ProductGroupAnalyticsResponseInner] = {
    val realJsonFormat = Json.format[ProductGroupAnalyticsResponseInner]
    val declaredPropNames = Set("DATE", "PRODUCT_GROUP_ID")
    
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
      Writes { productGroupAnalyticsResponseInner =>
        val jsObj = realJsonFormat.writes(productGroupAnalyticsResponseInner)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

