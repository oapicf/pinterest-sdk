package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ConversionTagResponse.
  * @param adAccountId Ad account ID.
  * @param codeSnippet Tag code snippet.
  * @param id Tag ID.
  * @param lastFiredTimeMs Time for the last event fired.
  * @param name Conversion tag name.
  * @param version Version number.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class ConversionTagResponse(
  adAccountId: Option[String],
  codeSnippet: Option[String],
  enhancedMatchStatus: Option[EnhancedMatchStatusType],
  id: Option[String],
  lastFiredTimeMs: Option[BigDecimal],
  name: Option[String],
  status: Option[EntityStatus],
  version: Option[String],
  configs: Option[ConversionTagConfigs]
  additionalProperties: 
)

object ConversionTagResponse {
  implicit lazy val conversionTagResponseJsonFormat: Format[ConversionTagResponse] = {
    val realJsonFormat = Json.format[ConversionTagResponse]
    val declaredPropNames = Set("adAccountId", "codeSnippet", "enhancedMatchStatus", "id", "lastFiredTimeMs", "name", "status", "version", "configs")
    
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
      Writes { conversionTagResponse =>
        val jsObj = realJsonFormat.writes(conversionTagResponse)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

