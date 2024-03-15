# BulkUpsertRequestCreate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Campaigns** | [**CampaignCreateRequest[]**](CampaignCreateRequest.md) |  | [optional] 
**AdGroups** | [**AdGroupCreateRequest[]**](AdGroupCreateRequest.md) |  | [optional] 
**Ads** | [**AdCreateRequest[]**](AdCreateRequest.md) |  | [optional] 
**ProductGroups** | [**ProductGroupPromotionCreateRequest[]**](ProductGroupPromotionCreateRequest.md) |  | [optional] 
**Keywords** | [**KeywordsRequest[]**](KeywordsRequest.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$BulkUpsertRequestCreate = Initialize-PSOpenAPIToolsBulkUpsertRequestCreate  -Campaigns null `
 -AdGroups null `
 -Ads null `
 -ProductGroups null `
 -Keywords null
```

- Convert the resource to JSON
```powershell
$BulkUpsertRequestCreate | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

