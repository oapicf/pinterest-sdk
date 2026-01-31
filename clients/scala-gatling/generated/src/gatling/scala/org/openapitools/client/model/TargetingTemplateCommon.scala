
package org.openapitools.client.model


case class TargetingTemplateCommon (
    /* Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>. */
    _autoTargetingEnabled: Option[Boolean],
    _keywords: Option[List[TargetingTemplateKeyword]],
    /* targeting template name */
    _name: Option[String],
    _placementGroup: Option[PlacementGroupType],
    _targetingAttributes: Option[TargetingSpec],
    _trackingUrls: Option[TrackingUrls]
)
object TargetingTemplateCommon {
    def toStringBody(var_autoTargetingEnabled: Object, var_keywords: Object, var_name: Object, var_placementGroup: Object, var_targetingAttributes: Object, var_trackingUrls: Object) =
        s"""
        | {
        | "autoTargetingEnabled":$var_autoTargetingEnabled,"keywords":$var_keywords,"name":$var_name,"placementGroup":$var_placementGroup,"targetingAttributes":$var_targetingAttributes,"trackingUrls":$var_trackingUrls
        | }
        """.stripMargin
}
