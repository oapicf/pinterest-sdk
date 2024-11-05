
package org.openapitools.client.model


case class TargetingTemplateResponseData (
    /* targeting template name */
    _name: Option[String],
    /* Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>. */
    _autoTargetingEnabled: Option[Boolean],
    _targetingAttributes: Option[TargetingSpec],
    _placementGroup: Option[PlacementGroupType],
    _keywords: Option[List[TargetingTemplateKeyword]],
    _trackingUrls: Option[TrackingUrls],
    /* Targeting template ID. */
    _id: Option[String],
    /* Targeting template created time. Unix timestamp in seconds. */
    _createdTime: Option[Integer],
    /* Targeting template updated time.Unix timestamp in seconds. */
    _updatedTime: Option[Integer],
    /* The ID of the advertiser that this targeting template belongs to. */
    _adAccountId: Option[String],
    /* Indicate targeting template is active or Deleted */
    _status: Option[String],
    _sizing: Option[TargetingTemplateAudienceSizing]
)
object TargetingTemplateResponseData {
    def toStringBody(var_name: Object, var_autoTargetingEnabled: Object, var_targetingAttributes: Object, var_placementGroup: Object, var_keywords: Object, var_trackingUrls: Object, var_id: Object, var_createdTime: Object, var_updatedTime: Object, var_adAccountId: Object, var_status: Object, var_sizing: Object) =
        s"""
        | {
        | "name":$var_name,"autoTargetingEnabled":$var_autoTargetingEnabled,"targetingAttributes":$var_targetingAttributes,"placementGroup":$var_placementGroup,"keywords":$var_keywords,"trackingUrls":$var_trackingUrls,"id":$var_id,"createdTime":$var_createdTime,"updatedTime":$var_updatedTime,"adAccountId":$var_adAccountId,"status":$var_status,"sizing":$var_sizing
        | }
        """.stripMargin
}
