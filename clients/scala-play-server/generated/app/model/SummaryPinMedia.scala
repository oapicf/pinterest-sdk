package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for SummaryPin_media.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class SummaryPinMedia(
  mediaType: Option[String]
  additionalProperties: PinMedia
)

object SummaryPinMedia {
  implicit lazy val summaryPinMediaJsonFormat: Format[SummaryPinMedia] = {
    val realJsonFormat = Json.format[SummaryPinMedia]
    val declaredPropNames = Set("mediaType")
    
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
      Writes { summaryPinMedia =>
        val jsObj = realJsonFormat.writes(summaryPinMedia)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

