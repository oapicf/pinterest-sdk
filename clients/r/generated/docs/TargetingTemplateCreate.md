# openapi::TargetingTemplateCreate


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**auto_targeting_enabled** | **character** | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;. | [optional] [default to TRUE] 
**keywords** | [**array[TargetingTemplateKeyword]**](TargetingTemplateKeyword.md) |  | [optional] 
**name** | **character** | Name of targeting template. | 
**placement_group** | [**PlacementGroupType**](PlacementGroupType.md) |  | [optional] [Enum: ] 
**targeting_attributes** | [**TargetingSpec**](TargetingSpec.md) |  | 
**tracking_urls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] 


