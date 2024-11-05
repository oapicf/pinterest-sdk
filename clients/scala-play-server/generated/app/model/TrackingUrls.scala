package model

import play.api.libs.json._

/**
  * Third-party tracking URLs. Up to three tracking URLs - with a max length of 2,000 - are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class TrackingUrls(
  impression: Option[List[String]],
  click: Option[List[String]],
  engagement: Option[List[String]],
  buyableButton: Option[List[String]],
  audienceVerification: Option[List[String]]
)

object TrackingUrls {
  implicit lazy val trackingUrlsJsonFormat: Format[TrackingUrls] = Json.format[TrackingUrls]
}

