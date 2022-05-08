package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CampaignResponse_allOf_1.
  * @param createdTime Campaign creation time. Unix timestamp in seconds.
  * @param updatedTime UTC timestamp. Last update time.
  * @param `type` Always \"campaign\".
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-08T00:41:34.847921Z[Etc/UTC]")
case class CampaignResponseAllOf1(
  objectiveType: Option[ObjectiveType],
  createdTime: Option[Int],
  updatedTime: Option[Int],
  `type`: Option[String]
  additionalProperties: 
)

object CampaignResponseAllOf1 {
  implicit lazy val campaignResponseAllOf1JsonFormat: Format[CampaignResponseAllOf1] = {
    val realJsonFormat = Json.format[CampaignResponseAllOf1]
    val declaredPropNames = Set("objectiveType", "createdTime", "updatedTime", "`type`")
    
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
      Writes { campaignResponseAllOf1 =>
        val jsObj = realJsonFormat.writes(campaignResponseAllOf1)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

