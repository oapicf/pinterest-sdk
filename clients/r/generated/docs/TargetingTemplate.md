# openapi::TargetingTemplate


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **character** | The ID of the advertiser that this targeting template belongs to. | [optional] [readonly] [Pattern: ^\\d+$] 
**auto_targeting_enabled** | **character** | Enable auto-targeting for ad group. Also known as [\&quot;expanded targeting\&quot;](https://help.pinterest.com/en/business/article/expanded-targeting). | [optional] [default to TRUE] 
**created_time** | **integer** | Targeting template created time. Unix timestamp in seconds. | [optional] [readonly] 
**id** | **character** | Targeting template ID. | [optional] [readonly] [Pattern: ^\\d+$] 
**keywords** | [**array[TargetingTemplateKeyword]**](TargetingTemplateKeyword.md) |  | [optional] 
**name** | **character** | targeting template name | 
**placement_group** | [**PlacementGroupType**](PlacementGroupType.md) |  | [optional] [Enum: ] 
**sizing** | [**TargetingTemplateAudienceSizing**](TargetingTemplateAudienceSizing.md) |  | [optional] [readonly] 
**status** | [**TargetingTemplateStatus**](TargetingTemplateStatus.md) | Indicate targeting template is active or Deleted | [optional] [readonly] [Enum: ] 
**targeting_attributes** | [**TargetingSpecOptimal**](TargetingSpecOptimal.md) | targeting profile attributes | 
**tracking_urls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] 
**updated_time** | **integer** | Targeting template updated time.Unix timestamp in seconds. | [optional] [readonly] 
**valid** | **character** | Inform if the targeting template is valid (ex. would be false if has revoked audience) | [optional] [readonly] 


