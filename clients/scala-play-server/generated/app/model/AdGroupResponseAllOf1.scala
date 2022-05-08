package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdGroupResponse_allOf_1.
  * @param campaignId Campaign ID of the ad group.
  * @param id Ad group ID.
  * @param `type` Always \"adgroup\".
  * @param adAccountId Advertiser ID.
  * @param createdTime Ad group creation time. Unix timestamp in seconds.
  * @param updatedTime Ad group last update time. Unix timestamp in seconds.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-08T00:41:34.847921Z[Etc/UTC]")
case class AdGroupResponseAllOf1(
  campaignId: Option[String],
  billableEvent: Option[ActionType],
  id: Option[String],
  `type`: Option[String],
  adAccountId: Option[String],
  createdTime: Option[Int],
  updatedTime: Option[Int]
  additionalProperties: 
)

object AdGroupResponseAllOf1 {
  implicit lazy val adGroupResponseAllOf1JsonFormat: Format[AdGroupResponseAllOf1] = {
    val realJsonFormat = Json.format[AdGroupResponseAllOf1]
    val declaredPropNames = Set("campaignId", "billableEvent", "id", "`type`", "adAccountId", "createdTime", "updatedTime")
    
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
      Writes { adGroupResponseAllOf1 =>
        val jsObj = realJsonFormat.writes(adGroupResponseAllOf1)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

