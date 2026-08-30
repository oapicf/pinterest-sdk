# TargetingTemplate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **String** | The ID of the advertiser that this targeting template belongs to. | [optional] [readonly] [default to None]
**auto_targeting_enabled** | **bool** | Enable auto-targeting for ad group. Also known as [\"expanded targeting\"](https://help.pinterest.com/en/business/article/expanded-targeting). | [optional] [default to Some(true)]
**created_time** | **i32** | Targeting template created time. Unix timestamp in seconds. | [optional] [readonly] [default to None]
**id** | **String** | Targeting template ID. | [optional] [readonly] [default to None]
**keywords** | [**Vec<models::TargetingTemplateKeyword>**](TargetingTemplateKeyword.md) |  | [optional] [default to None]
**name** | **String** | targeting template name | 
**placement_group** | [***models::PlacementGroupType**](PlacementGroupType.md) |  | [optional] [default to None]
**sizing** | [***swagger::Nullable<models::TargetingTemplateAudienceSizing>**](TargetingTemplateAudienceSizing.md) |  | [optional] [readonly] [default to None]
**status** | [***models::TargetingTemplateStatus**](TargetingTemplateStatus.md) | Indicate targeting template is active or Deleted | [optional] [readonly] [default to None]
**targeting_attributes** | [***models::TargetingSpecOptimal**](TargetingSpecOptimal.md) | targeting profile attributes | 
**tracking_urls** | [***swagger::Nullable<models::TrackingUrls>**](TrackingUrls.md) |  | [optional] [default to None]
**updated_time** | **i32** | Targeting template updated time.Unix timestamp in seconds. | [optional] [readonly] [default to None]
**valid** | **swagger::Nullable<bool>** | Inform if the targeting template is valid (ex. would be false if has revoked audience) | [optional] [readonly] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


