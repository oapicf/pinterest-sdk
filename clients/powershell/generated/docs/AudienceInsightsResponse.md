# AudienceInsightsResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Categories** | [**AudienceCategory[]**](AudienceCategory.md) | Category interest distribution | [optional] 
**Demographics** | [**AudienceDemographics**](AudienceDemographics.md) |  | [optional] 
**Type** | [**AudienceInsightType**](AudienceInsightType.md) |  | [optional] 
**Date** | **String** | Generation date | [optional] 
**Size** | **Int32** | Population count. | [optional] 
**SizeIsUpperBound** | **Boolean** | Indicates whether the audience size has been rounded up to the next highest upper boundary. | [optional] 

## Examples

- Prepare the resource
```powershell
$AudienceInsightsResponse = Initialize-PSOpenAPIToolsAudienceInsightsResponse  -Categories null `
 -Demographics null `
 -Type null `
 -Date 2022-10-09 `
 -Size 10000 `
 -SizeIsUpperBound true
```

- Convert the resource to JSON
```powershell
$AudienceInsightsResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

