package model

import play.api.libs.json._

/**
  * Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"https://developers.pinterest.com/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class AdGroupCommonTrackingUrls(
  impression: Option[List[String]],
  click: Option[List[String]],
  engagement: Option[List[String]],
  buyableButton: Option[List[String]],
  audienceVerification: Option[List[String]]
  additionalProperties: 
)

object AdGroupCommonTrackingUrls {
  implicit lazy val adGroupCommonTrackingUrlsJsonFormat: Format[AdGroupCommonTrackingUrls] = {
    val realJsonFormat = Json.format[AdGroupCommonTrackingUrls]
    val declaredPropNames = Set("impression", "click", "engagement", "buyableButton", "audienceVerification")
    
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
      Writes { adGroupCommonTrackingUrls =>
        val jsObj = realJsonFormat.writes(adGroupCommonTrackingUrls)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

