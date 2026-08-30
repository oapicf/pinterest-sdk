# CampaignBatchItem
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VarData** | [**CampaignBatchResponseData**](CampaignBatchResponseData.md) | Campaign data on success. | [optional] 
**Exceptions** | [**Exception[]**](Exception.md) | Exceptions on failure. | [optional] 

## Examples

- Prepare the resource
```powershell
$CampaignBatchItem = Initialize-PSOpenAPIToolsCampaignBatchItem  -VarData null `
 -Exceptions null
```

- Convert the resource to JSON
```powershell
$CampaignBatchItem | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

