# WWW::OpenAPIClient::Object::TargetingTemplateCreate

## Load the model package
```perl
use WWW::OpenAPIClient::Object::TargetingTemplateCreate;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**auto_targeting_enabled** | **boolean** | Enable auto-targeting for ad group. Also known as [\&quot;expanded targeting\&quot;](https://help.pinterest.com/en/business/article/expanded-targeting). | [optional] [default to true]
**keywords** | [**ARRAY[TargetingTemplateKeyword]**](TargetingTemplateKeyword.md) |  | [optional] 
**name** | **string** | targeting template name | 
**placement_group** | [**PlacementGroupType**](PlacementGroupType.md) |  | [optional] 
**targeting_attributes** | [**TargetingSpecOptimal**](TargetingSpecOptimal.md) | targeting profile attributes | 
**tracking_urls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


