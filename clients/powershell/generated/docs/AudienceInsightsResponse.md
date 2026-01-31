# AudienceInsightsResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Categories** | [**AudienceCategory[]**](AudienceCategory.md) | Category interest distribution | [optional] 
**Date** | **String** | Generation date | [optional] 
**Demographics** | [**AudienceDemographics**](AudienceDemographics.md) |  | [optional] 
**Size** | **Int32** | Population count. | [optional] 
**SizeIsUpperBound** | **Boolean** | Indicates whether the audience size has been rounded up to the next highest upper boundary. | [optional] 
**Type** | [**AudienceInsightType**](AudienceInsightType.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$AudienceInsightsResponse = Initialize-PSOpenAPIToolsAudienceInsightsResponse  -Categories null `
 -Date 2022-10-09 `
 -Demographics null `
 -Size 10000 `
 -SizeIsUpperBound true `
 -Type null
```

- Convert the resource to JSON
```powershell
$AudienceInsightsResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

