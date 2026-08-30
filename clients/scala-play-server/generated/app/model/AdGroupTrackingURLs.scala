package model

import play.api.libs.json._

/**
  *   Third-party tracking URLs. Up to three tracking URLs - with a max length of 2,000 - are supported for   each event type. Tracking URLs set at the ad group or ad level can override   those set at the campaign level. For more information, see [Third-party and dynamic tracking](https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking).
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AdGroupTrackingURLs(
  audienceVerification: Option[List[String]],
  buyableButton: Option[List[String]],
  click: Option[List[String]],
  engagement: Option[List[String]],
  impression: Option[List[String]]
)

object AdGroupTrackingURLs {
  implicit lazy val adGroupTrackingURLsJsonFormat: Format[AdGroupTrackingURLs] = Json.format[AdGroupTrackingURLs]
}

