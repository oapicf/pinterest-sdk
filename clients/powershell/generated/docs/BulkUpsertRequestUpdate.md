# BulkUpsertRequestUpdate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdGroups** | [**AdGroupUpdateRequest[]**](AdGroupUpdateRequest.md) |  | [optional] 
**Ads** | [**AdUpdateRequest[]**](AdUpdateRequest.md) |  | [optional] 
**Campaigns** | [**CampaignUpdateRequest[]**](CampaignUpdateRequest.md) |  | [optional] 
**CatalogProductGroups** | [**CatalogsProductGroupsUpdateRequest[]**](CatalogsProductGroupsUpdateRequest.md) |  | [optional] 
**Keywords** | [**KeywordUpdate[]**](KeywordUpdate.md) |  | [optional] 
**Labels** | [**LabelBulkUpdateRequest[]**](LabelBulkUpdateRequest.md) |  | [optional] 
**ProductGroups** | [**ProductGroupPromotionUpdateRequest[]**](ProductGroupPromotionUpdateRequest.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$BulkUpsertRequestUpdate = Initialize-PSOpenAPIToolsBulkUpsertRequestUpdate  -AdGroups null `
 -Ads null `
 -Campaigns null `
 -CatalogProductGroups null `
 -Keywords null `
 -Labels null `
 -ProductGroups null
```

- Convert the resource to JSON
```powershell
$BulkUpsertRequestUpdate | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

