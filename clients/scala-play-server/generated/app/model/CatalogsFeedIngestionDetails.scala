package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsFeedIngestionDetails.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-07T10:47:31.836531Z[Etc/UTC]")
case class CatalogsFeedIngestionDetails(
  errors: CatalogsFeedIngestionErrors,
  info: CatalogsFeedIngestionInfo
  additionalProperties: 
)

object CatalogsFeedIngestionDetails {
  implicit lazy val catalogsFeedIngestionDetailsJsonFormat: Format[CatalogsFeedIngestionDetails] = {
    val realJsonFormat = Json.format[CatalogsFeedIngestionDetails]
    val declaredPropNames = Set("errors", "info")
    
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
      Writes { catalogsFeedIngestionDetails =>
        val jsObj = realJsonFormat.writes(catalogsFeedIngestionDetails)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

