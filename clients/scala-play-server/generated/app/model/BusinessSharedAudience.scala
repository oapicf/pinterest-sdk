package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for BusinessSharedAudience.
  * @param audienceId Unique identifier of an audience
  * @param recipientBusinessIds List of business IDs to share with or revoke from.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class BusinessSharedAudience(
  audienceId: String,
  operationType: OperationType,
  recipientBusinessIds: List[String]
  additionalProperties: 
)

object BusinessSharedAudience {
  implicit lazy val businessSharedAudienceJsonFormat: Format[BusinessSharedAudience] = {
    val realJsonFormat = Json.format[BusinessSharedAudience]
    val declaredPropNames = Set("audienceId", "operationType", "recipientBusinessIds")
    
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
      Writes { businessSharedAudience =>
        val jsObj = realJsonFormat.writes(businessSharedAudience)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

