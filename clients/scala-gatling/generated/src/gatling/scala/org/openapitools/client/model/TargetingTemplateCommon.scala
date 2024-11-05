
package org.openapitools.client.model


case class TargetingTemplateCommon (
    /* targeting template name */
    _name: Option[String],
    /* Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>. */
    _autoTargetingEnabled: Option[Boolean],
    _targetingAttributes: Option[TargetingSpec],
    _placementGroup: Option[PlacementGroupType],
    _keywords: Option[List[TargetingTemplateKeyword]],
    _trackingUrls: Option[TrackingUrls]
)
object TargetingTemplateCommon {
    def toStringBody(var_name: Object, var_autoTargetingEnabled: Object, var_targetingAttributes: Object, var_placementGroup: Object, var_keywords: Object, var_trackingUrls: Object) =
        s"""
        | {
        | "name":$var_name,"autoTargetingEnabled":$var_autoTargetingEnabled,"targetingAttributes":$var_targetingAttributes,"placementGroup":$var_placementGroup,"keywords":$var_keywords,"trackingUrls":$var_trackingUrls
        | }
        """.stripMargin
}
