# CampaignsList200Response
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**CampaignResponse[]**](CampaignResponse.md) |  | 
**Bookmark** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CampaignsList200Response = Initialize-PSOpenAPIToolsCampaignsList200Response  -Items null `
 -Bookmark null
```

- Convert the resource to JSON
```powershell
$CampaignsList200Response | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

