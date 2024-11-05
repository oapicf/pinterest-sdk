package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for SharedAudienceResponse.
  * @param audienceId Audience ID that was shared
  * @param recipientAccountIds Account IDs that received the audience
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class SharedAudienceResponse(
  audienceId: Option[String],
  permissions: Option[List[Role]],
  recipientAccountIds: Option[List[String]]
  additionalProperties: 
)

object SharedAudienceResponse {
  implicit lazy val sharedAudienceResponseJsonFormat: Format[SharedAudienceResponse] = {
    val realJsonFormat = Json.format[SharedAudienceResponse]
    val declaredPropNames = Set("audienceId", "permissions", "recipientAccountIds")
    
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
      Writes { sharedAudienceResponse =>
        val jsObj = realJsonFormat.writes(sharedAudienceResponse)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

