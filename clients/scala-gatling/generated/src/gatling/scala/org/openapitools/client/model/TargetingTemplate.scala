
package org.openapitools.client.model


case class TargetingTemplate (
    /* The ID of the advertiser that this targeting template belongs to. */
    _adAccountId: Option[String],
    /* Enable auto-targeting for ad group. Also known as [\"expanded targeting\"](https://help.pinterest.com/en/business/article/expanded-targeting). */
    _autoTargetingEnabled: Option[Boolean],
    /* Targeting template created time. Unix timestamp in seconds. */
    _createdTime: Option[Integer],
    /* Targeting template ID. */
    _id: Option[String],
    _keywords: Option[List[TargetingTemplateKeyword]],
    /* targeting template name */
    _name: String,
    _placementGroup: Option[PlacementGroupType],
    _sizing: Option[TargetingTemplateAudienceSizing],
    /* Indicate targeting template is active or Deleted */
    _status: Option[TargetingTemplateStatus],
    /* targeting profile attributes */
    _targetingAttributes: TargetingSpecOptimal,
    _trackingUrls: Option[TrackingUrls],
    /* Targeting template updated time.Unix timestamp in seconds. */
    _updatedTime: Option[Integer],
    /* Inform if the targeting template is valid (ex. would be false if has revoked audience) */
    _valid: Option[Boolean]
)
object TargetingTemplate {
    def toStringBody(var_adAccountId: Object, var_autoTargetingEnabled: Object, var_createdTime: Object, var_id: Object, var_keywords: Object, var_name: Object, var_placementGroup: Object, var_sizing: Object, var_status: Object, var_targetingAttributes: Object, var_trackingUrls: Object, var_updatedTime: Object, var_valid: Object) =
        s"""
        | {
        | "adAccountId":$var_adAccountId,"autoTargetingEnabled":$var_autoTargetingEnabled,"createdTime":$var_createdTime,"id":$var_id,"keywords":$var_keywords,"name":$var_name,"placementGroup":$var_placementGroup,"sizing":$var_sizing,"status":$var_status,"targetingAttributes":$var_targetingAttributes,"trackingUrls":$var_trackingUrls,"updatedTime":$var_updatedTime,"valid":$var_valid
        | }
        """.stripMargin
}
