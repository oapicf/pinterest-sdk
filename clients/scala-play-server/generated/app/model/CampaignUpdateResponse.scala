package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CampaignUpdateResponse.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CampaignUpdateResponse(
  items: Option[List[CampaignCreateResponseItem]]
  additionalProperties: 
)

object CampaignUpdateResponse {
  implicit lazy val campaignUpdateResponseJsonFormat: Format[CampaignUpdateResponse] = {
    val realJsonFormat = Json.format[CampaignUpdateResponse]
    val declaredPropNames = Set("items")
    
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
      Writes { campaignUpdateResponse =>
        val jsObj = realJsonFormat.writes(campaignUpdateResponse)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

