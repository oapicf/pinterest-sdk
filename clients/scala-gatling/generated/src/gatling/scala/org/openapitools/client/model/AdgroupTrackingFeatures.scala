
package org.openapitools.client.model


case class AdgroupTrackingFeatures (
    /* Tracking features. To clear this field, set to null. */
    _enabled: Option[List[AdgroupTrackingFeatureType]]
)
object AdgroupTrackingFeatures {
    def toStringBody(var_enabled: Object) =
        s"""
        | {
        | "enabled":$var_enabled
        | }
        """.stripMargin
}
