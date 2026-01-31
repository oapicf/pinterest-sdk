package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AudienceCreateRequest.
  * @param adAccountId Ad account ID.
  * @param name Audience name.
  * @param audienceType <a href=\"/docs/reference/glossary/#Audience Types\">Audience types</a>: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR. Values are case-sensitive.
  * @param description Audience description.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AudienceCreateRequest(
  adAccountId: Option[String],
  name: String,
  rule: AudienceRule,
  audienceType: AudienceType,
  description: Option[String]
  additionalProperties: 
)

object AudienceCreateRequest {
  implicit lazy val audienceCreateRequestJsonFormat: Format[AudienceCreateRequest] = {
    val realJsonFormat = Json.format[AudienceCreateRequest]
    val declaredPropNames = Set("adAccountId", "name", "rule", "audienceType", "description")
    
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

