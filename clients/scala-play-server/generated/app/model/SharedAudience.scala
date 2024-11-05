package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for SharedAudience.
  * @param audienceId Unique identifier of an audience
  * @param recipientAccountIds List of ad account IDs to share with or revoke from.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class SharedAudience(
  audienceId: String,
  operationType: OperationType,
  recipientAccountIds: List[String]
  additionalProperties: 
)

object SharedAudience {
  implicit lazy val sharedAudienceJsonFormat: Format[SharedAudience] = {
    val realJsonFormat = Json.format[SharedAudience]
    val declaredPropNames = Set("audienceId", "operationType", "recipientAccountIds")
    
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
      Writes { sharedAudience =>
        val jsObj = realJsonFormat.writes(sharedAudience)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

