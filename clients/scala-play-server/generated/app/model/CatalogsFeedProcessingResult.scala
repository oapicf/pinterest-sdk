package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Represents the Swagger definition for CatalogsFeedProcessingResult.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CatalogsFeedProcessingResult(
  createdAt: OffsetDateTime,
  id: String,
  updatedAt: OffsetDateTime,
  ingestionDetails: CatalogsFeedIngestionDetails,
  status: CatalogsFeedProcessingStatus,
  productCounts: CatalogsFeedProductCounts,
  validationDetails: CatalogsFeedValidationDetails
  additionalProperties: 
)

object CatalogsFeedProcessingResult {
  implicit lazy val catalogsFeedProcessingResultJsonFormat: Format[CatalogsFeedProcessingResult] = {
    val realJsonFormat = Json.format[CatalogsFeedProcessingResult]
    val declaredPropNames = Set("createdAt", "id", "updatedAt", "ingestionDetails", "status", "productCounts", "validationDetails")
    
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
      Writes { catalogsFeedProcessingResult =>
        val jsObj = realJsonFormat.writes(catalogsFeedProcessingResult)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

