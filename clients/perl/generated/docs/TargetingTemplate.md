# WWW::OpenAPIClient::Object::TargetingTemplate

## Load the model package
```perl
use WWW::OpenAPIClient::Object::TargetingTemplate;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **string** | The ID of the advertiser that this targeting template belongs to. | [optional] [readonly] 
**auto_targeting_enabled** | **boolean** | Enable auto-targeting for ad group. Also known as [\&quot;expanded targeting\&quot;](https://help.pinterest.com/en/business/article/expanded-targeting). | [optional] [default to true]
**created_time** | **int** | Targeting template created time. Unix timestamp in seconds. | [optional] [readonly] 
**id** | **string** | Targeting template ID. | [optional] [readonly] 
**keywords** | [**ARRAY[TargetingTemplateKeyword]**](TargetingTemplateKeyword.md) |  | [optional] 
**name** | **string** | targeting template name | 
**placement_group** | [**PlacementGroupType**](PlacementGroupType.md) |  | [optional] 
**sizing** | [**TargetingTemplateAudienceSizing**](TargetingTemplateAudienceSizing.md) |  | [optional] [readonly] 
**status** | [**TargetingTemplateStatus**](TargetingTemplateStatus.md) | Indicate targeting template is active or Deleted | [optional] [readonly] 
**targeting_attributes** | [**TargetingSpecOptimal**](TargetingSpecOptimal.md) | targeting profile attributes | 
**tracking_urls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] 
**updated_time** | **int** | Targeting template updated time.Unix timestamp in seconds. | [optional] [readonly] 
**valid** | **boolean** | Inform if the targeting template is valid (ex. would be false if has revoked audience) | [optional] [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


