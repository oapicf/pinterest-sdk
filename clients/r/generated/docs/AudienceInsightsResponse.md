# openapi::AudienceInsightsResponse

Audience interests and demographics.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**categories** | [**array[AudienceCategory]**](AudienceCategory.md) | Category interest distribution | [optional] 
**demographics** | [**AudienceDemographics**](AudienceDemographics.md) |  | [optional] 
**type** | [**AudienceInsightType**](AudienceInsightType.md) |  | [optional] [Enum: ] 
**date** | **character** | Generation date | [optional] [Pattern: ^\\d{4}-\\d{2}-\\d{2}$] 
**size** | **integer** | Population count. | [optional] 
**size_is_upper_bound** | **character** | Indicates whether the audience size has been rounded up to the next highest upper boundary. | [optional] 


