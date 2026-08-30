# openapi::CustomerSegment


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **character** | The ID of the ad account that this customer segment belongs to. | [optional] [readonly] [Pattern: ^\\d+$] 
**audience_ids** | **array[character]** | Audience IDs included in the customer segment. | 
**created_time** | **integer** | Customer segment created time. Unix timestamp in seconds. | [optional] [readonly] 
**id** | **character** | Customer segment ID. | [optional] [readonly] [Pattern: ^\\d+$] 
**name** | **character** | Customer segment name. | 
**status** | [**TargetingTemplateStatus**](TargetingTemplateStatus.md) | Indicates whether the customer segment is active or deleted. | [optional] [readonly] [Enum: ] 
**updated_time** | **integer** | Customer segment updated time. Unix timestamp in seconds. | [optional] [readonly] 


