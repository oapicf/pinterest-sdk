package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AudienceCreateCustomRequest.
  * @param adAccountId Ad account ID.
  * @param name Audience name.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class AudienceCreateCustomRequest(
  adAccountId: Option[String],
  name: String,
  rule: AudienceRule,
  sharingType: AudienceSharingType,
  dataParty: AudienceDataParty,
  category: Option[String]
  additionalProperties: 
)

object AudienceCreateCustomRequest {
  implicit lazy val audienceCreateCustomRequestJsonFormat: Format[AudienceCreateCustomRequest] = {
    val realJsonFormat = Json.format[AudienceCreateCustomRequest]
    val declaredPropNames = Set("adAccountId", "name", "rule", "sharingType", "dataParty", "category")
    
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
      Writes { audienceCreateCustomRequest =>
        val jsObj = realJsonFormat.writes(audienceCreateCustomRequest)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

