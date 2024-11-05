package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdAccountGetSubscriptionResponse.
  * @param leadFormId Lead form ID.
  * @param webhookUrl Standard HTTPS webhook URL.
  * @param id Subscription ID.
  * @param userAccountId User account used to subscribe lead data.
  * @param adAccountId The Ad Account ID that this lead form belongs to.
  * @param apiVersion API version.
  * @param cryptographicKey Base64 encoded key for client to decrypt lead data.
  * @param cryptographicAlgorithm Lead data encryption algorithm.
  * @param createdTime Lead form creation time. Unix timestamp in milliseconds.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class AdAccountGetSubscriptionResponse(
  leadFormId: Option[String],
  webhookUrl: Option[String],
  id: Option[String],
  userAccountId: Option[String],
  adAccountId: Option[String],
  apiVersion: Option[String],
  cryptographicKey: Option[String],
  cryptographicAlgorithm: Option[String],
  createdTime: Option[Int]
  additionalProperties: 
)

object AdAccountGetSubscriptionResponse {
  implicit lazy val adAccountGetSubscriptionResponseJsonFormat: Format[AdAccountGetSubscriptionResponse] = {
    val realJsonFormat = Json.format[AdAccountGetSubscriptionResponse]
    val declaredPropNames = Set("leadFormId", "webhookUrl", "id", "userAccountId", "adAccountId", "apiVersion", "cryptographicKey", "cryptographicAlgorithm", "createdTime")
    
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
      Writes { adAccountGetSubscriptionResponse =>
        val jsObj = realJsonFormat.writes(adAccountGetSubscriptionResponse)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

