package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for BusinessSharedAudienceResponse.
  * @param audienceId Audience ID that was shared
  * @param recipientBusinessIds Business IDs that received the audience
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class BusinessSharedAudienceResponse(
  audienceId: Option[String],
  permissions: Option[List[Role]],
  recipientBusinessIds: Option[List[String]]
  additionalProperties: 
)

object BusinessSharedAudienceResponse {
  implicit lazy val businessSharedAudienceResponseJsonFormat: Format[BusinessSharedAudienceResponse] = {
    val realJsonFormat = Json.format[BusinessSharedAudienceResponse]
    val declaredPropNames = Set("audienceId", "permissions", "recipientBusinessIds")
    
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
      Writes { businessSharedAudienceResponse =>
        val jsObj = realJsonFormat.writes(businessSharedAudienceResponse)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

