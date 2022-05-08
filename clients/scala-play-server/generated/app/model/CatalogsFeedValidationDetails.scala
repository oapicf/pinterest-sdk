package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsFeedValidationDetails.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-08T00:41:34.847921Z[Etc/UTC]")
case class CatalogsFeedValidationDetails(
  errors: CatalogsFeedValidationErrors,
  warnings: CatalogsFeedValidationWarnings
  additionalProperties: 
)

object CatalogsFeedValidationDetails {
  implicit lazy val catalogsFeedValidationDetailsJsonFormat: Format[CatalogsFeedValidationDetails] = {
    val realJsonFormat = Json.format[CatalogsFeedValidationDetails]
    val declaredPropNames = Set("errors", "warnings")
    
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
      Writes { catalogsFeedValidationDetails =>
        val jsObj = realJsonFormat.writes(catalogsFeedValidationDetails)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

