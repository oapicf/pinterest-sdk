package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdgroupTrackingFeatures.
  * @param enabled Tracking features. To clear this field, set to null.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AdgroupTrackingFeatures(
  enabled: Option[List[AdgroupTrackingFeatureType]]
)

object AdgroupTrackingFeatures {
  implicit lazy val adgroupTrackingFeaturesJsonFormat: Format[AdgroupTrackingFeatures] = Json.format[AdgroupTrackingFeatures]
}

