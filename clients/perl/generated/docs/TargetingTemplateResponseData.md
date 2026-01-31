# WWW::OpenAPIClient::Object::TargetingTemplateResponseData

## Load the model package
```perl
use WWW::OpenAPIClient::Object::TargetingTemplateResponseData;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**auto_targeting_enabled** | **boolean** | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;. | [optional] [default to true]
**keywords** | [**ARRAY[TargetingTemplateKeyword]**](TargetingTemplateKeyword.md) |  | [optional] 
**name** | **string** | targeting template name | [optional] 
**placement_group** | [**PlacementGroupType**](PlacementGroupType.md) |  | [optional] 
**targeting_attributes** | [**TargetingSpec**](TargetingSpec.md) |  | [optional] 
**tracking_urls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] 
**ad_account_id** | **string** | The ID of the advertiser that this targeting template belongs to. | [optional] 
**created_time** | **int** | Targeting template created time. Unix timestamp in seconds. | [optional] 
**id** | **string** | Targeting template ID. | [optional] 
**sizing** | [**TargetingTemplateAudienceSizing**](TargetingTemplateAudienceSizing.md) |  | [optional] 
**status** | **string** | Indicate targeting template is active or Deleted | [optional] [default to &#39;ACTIVE&#39;]
**updated_time** | **int** | Targeting template updated time.Unix timestamp in seconds. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


