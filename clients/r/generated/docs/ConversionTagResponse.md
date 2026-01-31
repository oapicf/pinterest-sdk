# openapi::ConversionTagResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code_snippet** | **character** | Tag code snippet. | [optional] [readonly] 
**configs** | [**ConversionTagConfigs**](ConversionTagConfigs.md) |  | [optional] [readonly] 
**enhanced_match_status** | [**EnhancedMatchStatusType**](EnhancedMatchStatusType.md) | The enhanced match status of the tag | [optional] [readonly] [Enum: ] 
**id** | **character** | Tag ID. | [optional] [readonly] 
**last_fired_time_ms** | **numeric** | Time for the last event fired. | [optional] [readonly] 
**name** | **character** | Conversion tag name. | 
**version** | **character** | Version number. | [optional] [readonly] 
**ad_account_id** | **character** | Ad account ID. | [readonly] 
**status** | [**EntityStatus**](EntityStatus.md) |  | [optional] [readonly] [Enum: ] 


