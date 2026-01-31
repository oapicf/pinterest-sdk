# TargetingTemplateResponseData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**auto_targeting_enabled** | Option<**bool**> | Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>. | [optional][default to true]
**keywords** | Option<[**Vec<models::TargetingTemplateKeyword>**](TargetingTemplateKeyword.md)> |  | [optional]
**name** | Option<**String**> | targeting template name | [optional]
**placement_group** | Option<[**models::PlacementGroupType**](PlacementGroupType.md)> |  | [optional]
**targeting_attributes** | Option<[**models::TargetingSpec**](TargetingSpec.md)> |  | [optional]
**tracking_urls** | Option<[**models::TrackingUrls**](TrackingUrls.md)> |  | [optional]
**ad_account_id** | Option<**String**> | The ID of the advertiser that this targeting template belongs to. | [optional]
**created_time** | Option<**i32**> | Targeting template created time. Unix timestamp in seconds. | [optional]
**id** | Option<**String**> | Targeting template ID. | [optional]
**sizing** | Option<[**models::TargetingTemplateAudienceSizing**](TargetingTemplateAudienceSizing.md)> |  | [optional]
**status** | Option<**String**> | Indicate targeting template is active or Deleted | [optional][default to Active]
**updated_time** | Option<**i32**> | Targeting template updated time.Unix timestamp in seconds. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


