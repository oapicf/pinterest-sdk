# CampaignPlanningResponseError
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | [**CampaignPlanningResponseErrorCode**](CampaignPlanningResponseErrorCode.md) |  | [optional] 
**Message** | **String** | Human-readable error message. | [optional] 

## Examples

- Prepare the resource
```powershell
$CampaignPlanningResponseError = Initialize-PSOpenAPIToolsCampaignPlanningResponseError  -Code null `
 -Message null
```

- Convert the resource to JSON
```powershell
$CampaignPlanningResponseError | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

