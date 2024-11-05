# WWW::OpenAPIClient::Object::TargetingTemplateCreate

## Load the model package
```perl
use WWW::OpenAPIClient::Object::TargetingTemplateCreate;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **string** | Name of targeting template. | 
**auto_targeting_enabled** | **boolean** | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;. | [optional] [default to true]
**targeting_attributes** | [**TargetingSpec**](TargetingSpec.md) |  | 
**placement_group** | [**PlacementGroupType**](PlacementGroupType.md) |  | [optional] 
**keywords** | [**ARRAY[TargetingTemplateKeyword]**](TargetingTemplateKeyword.md) |  | [optional] 
**tracking_urls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


