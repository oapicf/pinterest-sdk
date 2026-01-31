# BulkUpsertRequestCreate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdGroups** | [**AdGroupCreateRequest[]**](AdGroupCreateRequest.md) |  | [optional] 
**Ads** | [**AdCreateRequest[]**](AdCreateRequest.md) |  | [optional] 
**Campaigns** | [**CampaignCreateRequest[]**](CampaignCreateRequest.md) |  | [optional] 
**CatalogProductGroups** | [**MultipleProductGroupsInner[]**](MultipleProductGroupsInner.md) |  | [optional] 
**Keywords** | [**KeywordsRequest[]**](KeywordsRequest.md) |  | [optional] 
**Labels** | [**LabelCreateRequest[]**](LabelCreateRequest.md) |  | [optional] 
**ProductGroups** | [**ProductGroupPromotionCreateRequest[]**](ProductGroupPromotionCreateRequest.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$BulkUpsertRequestCreate = Initialize-PSOpenAPIToolsBulkUpsertRequestCreate  -AdGroups null `
 -Ads null `
 -Campaigns null `
 -CatalogProductGroups null `
 -Keywords null `
 -Labels null `
 -ProductGroups null
```

- Convert the resource to JSON
```powershell
$BulkUpsertRequestCreate | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

