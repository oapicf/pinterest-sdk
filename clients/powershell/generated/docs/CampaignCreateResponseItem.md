# CampaignCreateResponseItem
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VarData** | [**CampaignCreateResponseData**](CampaignCreateResponseData.md) |  | [optional] 
**Exceptions** | [**Exception[]**](Exception.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$CampaignCreateResponseItem = Initialize-PSOpenAPIToolsCampaignCreateResponseItem  -VarData null `
 -Exceptions null
```

- Convert the resource to JSON
```powershell
$CampaignCreateResponseItem | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

