
package org.openapitools.client.model


case class TargetingTemplateResponseData (
    /* Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>. */
    _autoTargetingEnabled: Option[Boolean],
    _keywords: Option[List[TargetingTemplateKeyword]],
    /* targeting template name */
    _name: Option[String],
    _placementGroup: Option[PlacementGroupType],
    _targetingAttributes: Option[TargetingSpec],
    _trackingUrls: Option[TrackingUrls],
    /* The ID of the advertiser that this targeting template belongs to. */
    _adAccountId: Option[String],
    /* Targeting template created time. Unix timestamp in seconds. */
    _createdTime: Option[Integer],
    /* Targeting template ID. */
    _id: Option[String],
    _sizing: Option[TargetingTemplateAudienceSizing],
    /* Indicate targeting template is active or Deleted */
    _status: Option[String],
    /* Targeting template updated time.Unix timestamp in seconds. */
    _updatedTime: Option[Integer]
)
object TargetingTemplateResponseData {
    def toStringBody(var_autoTargetingEnabled: Object, var_keywords: Object, var_name: Object, var_placementGroup: Object, var_targetingAttributes: Object, var_trackingUrls: Object, var_adAccountId: Object, var_createdTime: Object, var_id: Object, var_sizing: Object, var_status: Object, var_updatedTime: Object) =
        s"""
        | {
        | "autoTargetingEnabled":$var_autoTargetingEnabled,"keywords":$var_keywords,"name":$var_name,"placementGroup":$var_placementGroup,"targetingAttributes":$var_targetingAttributes,"trackingUrls":$var_trackingUrls,"adAccountId":$var_adAccountId,"createdTime":$var_createdTime,"id":$var_id,"sizing":$var_sizing,"status":$var_status,"updatedTime":$var_updatedTime
        | }
        """.stripMargin
}
