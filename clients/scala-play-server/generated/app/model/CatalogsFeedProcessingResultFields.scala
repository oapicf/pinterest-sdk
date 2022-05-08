package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for catalogs_feed_processing_result_fields.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-08T00:41:34.847921Z[Etc/UTC]")
case class CatalogsFeedProcessingResultFields(
  ingestionDetails: CatalogsFeedIngestionDetails,
  status: CatalogsFeedProcessingStatus,
  productCounts: CatalogsFeedProductCounts,
  validationDetails: CatalogsFeedValidationDetails
  additionalProperties: 
)

object CatalogsFeedProcessingResultFields {
  implicit lazy val catalogsFeedProcessingResultFieldsJsonFormat: Format[CatalogsFeedProcessingResultFields] = {
    val realJsonFormat = Json.format[CatalogsFeedProcessingResultFields]
    val declaredPropNames = Set("ingestionDetails", "status", "productCounts", "validationDetails")
    
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
      Writes { catalogsFeedProcessingResultFields =>
        val jsObj = realJsonFormat.writes(catalogsFeedProcessingResultFields)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

