package model

import play.api.libs.json._

/**
  * Third-party tracking URLs. Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-07-01T12:06:32.599878Z[Etc/UTC]")
case class TrackingUrls(
  impression: Option[List[String]],
  click: Option[List[String]],
  engagement: Option[List[String]],
  buyableButton: Option[List[String]],
  audienceVerification: Option[List[String]]
  additionalProperties: 
)

object TrackingUrls {
  implicit lazy val trackingUrlsJsonFormat: Format[TrackingUrls] = {
    val realJsonFormat = Json.format[TrackingUrls]
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
      Writes { trackingUrls =>
        val jsObj = realJsonFormat.writes(trackingUrls)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

