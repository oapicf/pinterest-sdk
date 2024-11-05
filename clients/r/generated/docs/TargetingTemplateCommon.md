# openapi::TargetingTemplateCommon


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **character** | targeting template name | [optional] 
**auto_targeting_enabled** | **character** | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;. | [optional] [default to TRUE] 
**targeting_attributes** | [**TargetingSpec**](TargetingSpec.md) |  | [optional] 
**placement_group** | [**PlacementGroupType**](PlacementGroupType.md) |  | [optional] [Enum: ] 
**keywords** | [**array[TargetingTemplateKeyword]**](TargetingTemplateKeyword.md) |  | [optional] 
**tracking_urls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] 


