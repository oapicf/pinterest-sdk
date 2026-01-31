
package org.openapitools.client.model


case class TargetingTemplateCreate (
    /* Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>. */
    _autoTargetingEnabled: Option[Boolean],
    _keywords: Option[List[TargetingTemplateKeyword]],
    /* Name of targeting template. */
    _name: String,
    _placementGroup: Option[PlacementGroupType],
    _targetingAttributes: TargetingSpec,
    _trackingUrls: Option[TrackingUrls]
)
object TargetingTemplateCreate {
    def toStringBody(var_autoTargetingEnabled: Object, var_keywords: Object, var_name: Object, var_placementGroup: Object, var_targetingAttributes: Object, var_trackingUrls: Object) =
        s"""
        | {
        | "autoTargetingEnabled":$var_autoTargetingEnabled,"keywords":$var_keywords,"name":$var_name,"placementGroup":$var_placementGroup,"targetingAttributes":$var_targetingAttributes,"trackingUrls":$var_trackingUrls
        | }
        """.stripMargin
}
