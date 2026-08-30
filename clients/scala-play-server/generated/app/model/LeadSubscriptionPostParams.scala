package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for LeadSubscriptionPostParams.
  * @param adAccountId The Ad Account ID that this lead form belongs to.
  * @param apiVersion API version.
  * @param createdTime Subscription creation time. Unix timestamp in milliseconds.
  * @param cryptographicAlgorithm Lead data encryption algorithm.
  * @param cryptographicKey Base64 encoded key for client to decrypt lead data.
  * @param id Subscription ID.
  * @param leadFormId Lead form ID.
  * @param userAccountId User account used to subscribe lead data.
  * @param webhookUrl Standard HTTPS webhook URL.
  * @param partnerAccessToken Partner access token. Only for clients that requires authentication. We recommend to avoid this param.
  * @param partnerMetadata Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.
  * @param partnerRefreshToken Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class LeadSubscriptionPostParams(
  adAccountId: Option[String],
  apiVersion: Option[String],
  createdTime: Option[Int],
  cryptographicAlgorithm: Option[String],
  cryptographicKey: Option[String],
  id: Option[String],
  leadFormId: Option[String],
  userAccountId: Option[String],
  webhookUrl: Option[String],
  partnerAccessToken: Option[String],
  partnerMetadata: Option[PartnerMetadata],
  partnerRefreshToken: Option[String]
  additionalProperties: 
)

object LeadSubscriptionPostParams {
  implicit lazy val leadSubscriptionPostParamsJsonFormat: Format[LeadSubscriptionPostParams] = {
    val realJsonFormat = Json.format[LeadSubscriptionPostParams]
    val declaredPropNames = Set("adAccountId", "apiVersion", "createdTime", "cryptographicAlgorithm", "cryptographicKey", "id", "leadFormId", "userAccountId", "webhookUrl", "partnerAccessToken", "partnerMetadata", "partnerRefreshToken")
    
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
      Writes { leadSubscriptionPostParams =>
        val jsObj = realJsonFormat.writes(leadSubscriptionPostParams)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

