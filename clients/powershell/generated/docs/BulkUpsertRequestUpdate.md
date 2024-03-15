# BulkUpsertRequestUpdate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Campaigns** | [**CampaignUpdateRequest[]**](CampaignUpdateRequest.md) |  | [optional] 
**AdGroups** | [**AdGroupUpdateRequest[]**](AdGroupUpdateRequest.md) |  | [optional] 
**Ads** | [**AdUpdateRequest[]**](AdUpdateRequest.md) |  | [optional] 
**ProductGroups** | [**ProductGroupPromotionUpdateRequest[]**](ProductGroupPromotionUpdateRequest.md) |  | [optional] 
**Keywords** | [**KeywordUpdate[]**](KeywordUpdate.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$BulkUpsertRequestUpdate = Initialize-PSOpenAPIToolsBulkUpsertRequestUpdate  -Campaigns null `
 -AdGroups null `
 -Ads null `
 -ProductGroups null `
 -Keywords null
```

- Convert the resource to JSON
```powershell
$BulkUpsertRequestUpdate | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

