package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ConversionTag.
  * @param codeSnippet Tag code snippet.
  * @param enhancedMatchStatus The enhanced match status of the tag
  * @param id Tag ID.
  * @param lastFiredTimeMs Time for the last event fired.
  * @param name Conversion tag name.
  * @param version Version number.
  * @param adAccountId Ad account ID.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ConversionTag(
  codeSnippet: Option[String],
  configs: Option[ConversionTagConfigs],
  enhancedMatchStatus: Option[EnhancedMatchStatusType],
  id: Option[String],
  lastFiredTimeMs: Option[BigDecimal],
  name: String,
  version: Option[String],
  adAccountId: String,
  status: Option[EntityStatus]
  additionalProperties: 
)

object ConversionTag {
  implicit lazy val conversionTagJsonFormat: Format[ConversionTag] = {
    val realJsonFormat = Json.format[ConversionTag]
    val declaredPropNames = Set("codeSnippet", "configs", "enhancedMatchStatus", "id", "lastFiredTimeMs", "name", "version", "adAccountId", "status")
    
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
      Writes { conversionTag =>
        val jsObj = realJsonFormat.writes(conversionTag)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

