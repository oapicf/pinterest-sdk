# CampaignPlanningAdGroupAudienceSize
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CountLower** | **Int32** | Lower bound of the audience size estimate. | [optional] 
**CountUpper** | **Int32** | Upper bound of the audience size estimate. | [optional] 

## Examples

- Prepare the resource
```powershell
$CampaignPlanningAdGroupAudienceSize = Initialize-PSOpenAPIToolsCampaignPlanningAdGroupAudienceSize  -CountLower 1000000 `
 -CountUpper 2000000
```

- Convert the resource to JSON
```powershell
$CampaignPlanningAdGroupAudienceSize | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

