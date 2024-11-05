package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AudienceCreateRequest.
  * @param adAccountId Ad account ID.
  * @param name Audience name.
  * @param description Audience description.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class AudienceCreateRequest(
  adAccountId: Option[String],
  name: String,
  rule: AudienceRule,
  description: Option[String],
  audienceType: AudienceCreateRequest1AudienceType
  additionalProperties: 
)

object AudienceCreateRequest {
  implicit lazy val audienceCreateRequestJsonFormat: Format[AudienceCreateRequest] = {
    val realJsonFormat = Json.format[AudienceCreateRequest]
    val declaredPropNames = Set("adAccountId", "name", "rule", "description", "audienceType")
    
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
      Writes { audienceCreateRequest =>
        val jsObj = realJsonFormat.writes(audienceCreateRequest)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

