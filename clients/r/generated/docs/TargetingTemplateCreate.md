# openapi::TargetingTemplateCreate

Resource create operation model.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**auto_targeting_enabled** | **character** | Enable auto-targeting for ad group. Also known as [\&quot;expanded targeting\&quot;](https://help.pinterest.com/en/business/article/expanded-targeting). | [optional] [default to TRUE] 
**keywords** | [**array[TargetingTemplateKeyword]**](TargetingTemplateKeyword.md) |  | [optional] 
**name** | **character** | targeting template name | 
**placement_group** | [**PlacementGroupType**](PlacementGroupType.md) |  | [optional] [Enum: ] 
**targeting_attributes** | [**TargetingSpecOptimal**](TargetingSpecOptimal.md) | targeting profile attributes | 
**tracking_urls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] 


