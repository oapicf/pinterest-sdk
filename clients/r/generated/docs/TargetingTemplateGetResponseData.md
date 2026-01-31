# openapi::TargetingTemplateGetResponseData


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**auto_targeting_enabled** | **character** | Enable auto-targeting for ad group. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/expanded-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;expanded targeting\&quot;&lt;/a&gt;. | [optional] [default to TRUE] 
**keywords** | [**array[TargetingTemplateKeyword]**](TargetingTemplateKeyword.md) |  | [optional] 
**name** | **character** | targeting template name | [optional] 
**placement_group** | [**PlacementGroupType**](PlacementGroupType.md) |  | [optional] [Enum: ] 
**targeting_attributes** | [**TargetingSpec**](TargetingSpec.md) |  | [optional] 
**tracking_urls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] 
**ad_account_id** | **character** | The ID of the advertiser that this targeting template belongs to. | [optional] [Pattern: ^\\d+$] 
**created_time** | **integer** | Targeting template created time. Unix timestamp in seconds. | [optional] 
**id** | **character** | Targeting template ID. | [optional] [Pattern: ^\\d+$] 
**sizing** | [**TargetingTemplateAudienceSizing**](TargetingTemplateAudienceSizing.md) |  | [optional] 
**status** | **character** | Indicate targeting template is active or Deleted | [optional] [default to &quot;ACTIVE&quot;] [Enum: [ACTIVE, DELETED]] 
**updated_time** | **integer** | Targeting template updated time.Unix timestamp in seconds. | [optional] 
**valid** | **character** | Inform if the targeting template is valid (ex. would be false if has revoked audience) | [optional] 


