package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CampaignResponse_allOf.
  * @param id Campaign ID.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-07-01T12:06:32.599878Z[Etc/UTC]")
case class CampaignResponseAllOf(
  id: String
  additionalProperties: 
)

object CampaignResponseAllOf {
  implicit lazy val campaignResponseAllOfJsonFormat: Format[CampaignResponseAllOf] = {
    val realJsonFormat = Json.format[CampaignResponseAllOf]
    val declaredPropNames = Set("id")
    
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
      Writes { campaignResponseAllOf =>
        val jsObj = realJsonFormat.writes(campaignResponseAllOf)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

