# KeywordsRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Keywords** | [**KeywordsCommon[]**](KeywordsCommon.md) | Keyword JSON array. Each array element has 3 fields | 
**ParentId** | **String** | Keyword parent entity ID (advertiser, campaign, ad group). | 

## Examples

- Prepare the resource
```powershell
$KeywordsRequest = Initialize-PSOpenAPIToolsKeywordsRequest  -Keywords null `
 -ParentId 383791336903426391
```

- Convert the resource to JSON
```powershell
$KeywordsRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

