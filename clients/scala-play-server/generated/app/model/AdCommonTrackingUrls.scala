package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdCommon_tracking_urls.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class AdCommonTrackingUrls(
  impression: Option[List[String]],
  click: Option[List[String]],
  engagement: Option[List[String]],
  buyableButton: Option[List[String]],
  audienceVerification: Option[List[String]]
  additionalProperties: 
)

object AdCommonTrackingUrls {
  implicit lazy val adCommonTrackingUrlsJsonFormat: Format[AdCommonTrackingUrls] = {
    val realJsonFormat = Json.format[AdCommonTrackingUrls]
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
      Writes { adCommonTrackingUrls =>
        val jsObj = realJsonFormat.writes(adCommonTrackingUrls)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

