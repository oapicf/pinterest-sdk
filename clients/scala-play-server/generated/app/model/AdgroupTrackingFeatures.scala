package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdgroupTrackingFeatures.
  * @param enabled Tracking features. To clear this field, set to null.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AdgroupTrackingFeatures(
  enabled: Option[List[AdgroupTrackingFeatureType]]
)

object AdgroupTrackingFeatures {
  implicit lazy val adgroupTrackingFeaturesJsonFormat: Format[AdgroupTrackingFeatures] = Json.format[AdgroupTrackingFeatures]
}

