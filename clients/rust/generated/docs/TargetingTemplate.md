# TargetingTemplate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | Option<**String**> | The ID of the advertiser that this targeting template belongs to. | [optional][readonly]
**auto_targeting_enabled** | Option<**bool**> | Enable auto-targeting for ad group. Also known as [\"expanded targeting\"](https://help.pinterest.com/en/business/article/expanded-targeting). | [optional][default to true]
**created_time** | Option<**i32**> | Targeting template created time. Unix timestamp in seconds. | [optional][readonly]
**id** | Option<**String**> | Targeting template ID. | [optional][readonly]
**keywords** | Option<[**Vec<models::TargetingTemplateKeyword>**](TargetingTemplateKeyword.md)> |  | [optional]
**name** | **String** | targeting template name | 
**placement_group** | Option<[**models::PlacementGroupType**](PlacementGroupType.md)> |  | [optional]
**sizing** | Option<[**models::TargetingTemplateAudienceSizing**](TargetingTemplateAudienceSizing.md)> |  | [optional][readonly]
**status** | Option<[**models::TargetingTemplateStatus**](TargetingTemplateStatus.md)> | Indicate targeting template is active or Deleted | [optional][readonly]
**targeting_attributes** | [**models::TargetingSpecOptimal**](TargetingSpecOptimal.md) | targeting profile attributes | 
**tracking_urls** | Option<[**models::TrackingUrls**](TrackingUrls.md)> |  | [optional]
**updated_time** | Option<**i32**> | Targeting template updated time.Unix timestamp in seconds. | [optional][readonly]
**valid** | Option<**bool**> | Inform if the targeting template is valid (ex. would be false if has revoked audience) | [optional][readonly]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


