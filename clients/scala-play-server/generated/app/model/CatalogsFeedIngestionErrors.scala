package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsFeedIngestionErrors.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-08T00:41:34.847921Z[Etc/UTC]")
case class CatalogsFeedIngestionErrors(
  imageDownloadError: Option[Int],
  imageDownloadConnectionTimeout: Option[Int],
  imageFormatUnrecognize: Option[Int],
  lineLevelInternalError: Option[Int],
  largeProductCountDecrease: Option[CatalogsFeedIngestionErrors.LargeProductCountDecrease.Value]
  additionalProperties: 
)

object CatalogsFeedIngestionErrors {
  implicit lazy val catalogsFeedIngestionErrorsJsonFormat: Format[CatalogsFeedIngestionErrors] = {
    val realJsonFormat = Json.format[CatalogsFeedIngestionErrors]
    val declaredPropNames = Set("imageDownloadError", "imageDownloadConnectionTimeout", "imageFormatUnrecognize", "lineLevelInternalError", "largeProductCountDecrease")
    
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
      Writes { catalogsFeedIngestionErrors =>
        val jsObj = realJsonFormat.writes(catalogsFeedIngestionErrors)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }

  // noinspection TypeAnnotation
  object LargeProductCountDecrease extends Enumeration {
    val _1 = Value("1")

    type LargeProductCountDecrease = Value
    implicit lazy val LargeProductCountDecreaseJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

