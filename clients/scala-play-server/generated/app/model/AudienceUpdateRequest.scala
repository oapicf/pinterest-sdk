package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AudienceUpdateRequest.
  * @param adAccountId Ad account ID.
  * @param name Audience name.
  * @param description Audience description.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class AudienceUpdateRequest(
  adAccountId: Option[String],
  name: Option[String],
  rule: Option[AudienceRule],
  description: Option[String],
  operationType: Option[AudienceUpdateOperationType]
  additionalProperties: 
)

object AudienceUpdateRequest {
  implicit lazy val audienceUpdateRequestJsonFormat: Format[AudienceUpdateRequest] = {
    val realJsonFormat = Json.format[AudienceUpdateRequest]
    val declaredPropNames = Set("adAccountId", "name", "rule", "description", "operationType")
    
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
      Writes { audienceUpdateRequest =>
        val jsObj = realJsonFormat.writes(audienceUpdateRequest)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

