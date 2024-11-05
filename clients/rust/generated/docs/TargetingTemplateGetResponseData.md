# TargetingTemplateGetResponseData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | Option<**String**> | targeting template name | [optional]
**auto_targeting_enabled** | Option<**bool**> | Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>. | [optional][default to true]
**targeting_attributes** | Option<[**models::TargetingSpec**](TargetingSpec.md)> |  | [optional]
**placement_group** | Option<[**models::PlacementGroupType**](PlacementGroupType.md)> |  | [optional]
**keywords** | Option<[**Vec<models::TargetingTemplateKeyword>**](TargetingTemplateKeyword.md)> |  | [optional]
**tracking_urls** | Option<[**models::TrackingUrls**](TrackingUrls.md)> |  | [optional]
**id** | Option<**String**> | Targeting template ID. | [optional]
**created_time** | Option<**i32**> | Targeting template created time. Unix timestamp in seconds. | [optional]
**updated_time** | Option<**i32**> | Targeting template updated time.Unix timestamp in seconds. | [optional]
**ad_account_id** | Option<**String**> | The ID of the advertiser that this targeting template belongs to. | [optional]
**status** | Option<**String**> | Indicate targeting template is active or Deleted | [optional][default to Active]
**sizing** | Option<[**models::TargetingTemplateAudienceSizing**](TargetingTemplateAudienceSizing.md)> |  | [optional]
**valid** | Option<**bool**> | Inform if the targeting template is valid (ex. would be false if has revoked audience) | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


