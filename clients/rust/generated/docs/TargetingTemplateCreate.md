# TargetingTemplateCreate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of targeting template. | 
**auto_targeting_enabled** | Option<**bool**> | Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>. | [optional][default to true]
**targeting_attributes** | [**models::TargetingSpec**](TargetingSpec.md) |  | 
**placement_group** | Option<[**models::PlacementGroupType**](PlacementGroupType.md)> |  | [optional]
**keywords** | Option<[**Vec<models::TargetingTemplateKeyword>**](TargetingTemplateKeyword.md)> |  | [optional]
**tracking_urls** | Option<[**models::TrackingUrls**](TrackingUrls.md)> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


