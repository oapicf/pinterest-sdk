
package org.openapitools.client.model


case class TargetingTemplateCreate (
    /* Enable auto-targeting for ad group. Also known as [\"expanded targeting\"](https://help.pinterest.com/en/business/article/expanded-targeting). */
    _autoTargetingEnabled: Option[Boolean],
    _keywords: Option[List[TargetingTemplateKeyword]],
    /* targeting template name */
    _name: String,
    _placementGroup: Option[PlacementGroupType],
    /* targeting profile attributes */
    _targetingAttributes: TargetingSpecOptimal,
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
