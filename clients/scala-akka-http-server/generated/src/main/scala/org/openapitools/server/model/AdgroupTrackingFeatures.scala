package org.openapitools.server.model


/**
 * @param enabled Tracking features. To clear this field, set to null. for example: ''null''
*/
final case class AdgroupTrackingFeatures (
  enabled: Option[Seq[AdgroupTrackingFeatureType]] = None
)

