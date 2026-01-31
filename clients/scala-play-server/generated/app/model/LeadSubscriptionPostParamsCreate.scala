package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LeadSubscriptionPostParamsCreate.
  * @param leadFormId Lead form ID.
  * @param webhookUrl Standard HTTPS webhook URL.
  * @param partnerAccessToken Partner access token. Only for clients that requires authentication. We recommend to avoid this param.
  * @param partnerRefreshToken Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class LeadSubscriptionPostParamsCreate(
  leadFormId: Option[String],
  webhookUrl: String,
  partnerAccessToken: Option[String],
  partnerMetadata: Option[LeadSubscriptionPostParamsCreateAllOfPartnerMetadata],
  partnerRefreshToken: Option[String]
  additionalProperties: 
)

object LeadSubscriptionPostParamsCreate {
  implicit lazy val leadSubscriptionPostParamsCreateJsonFormat: Format[LeadSubscriptionPostParamsCreate] = {
    val realJsonFormat = Json.format[LeadSubscriptionPostParamsCreate]
    val declaredPropNames = Set("leadFormId", "webhookUrl", "partnerAccessToken", "partnerMetadata", "partnerRefreshToken")
    
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
      Writes { leadSubscriptionPostParamsCreate =>
        val jsObj = realJsonFormat.writes(leadSubscriptionPostParamsCreate)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

