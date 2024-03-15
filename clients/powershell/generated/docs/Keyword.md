# Keyword
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Archived** | **Boolean** |  | [optional] 
**Id** | **String** | Keyword ID . | [optional] 
**ParentId** | **String** | Keyword parent entity ID (advertiser, campaign, ad group). | [optional] 
**ParentType** | **String** | Parent entity type | [optional] 
**Type** | **String** | Always keyword | [optional] 
**Bid** | **Int32** | Keyword custom bid in microcurrency - null if inherited from parent ad group. | [optional] 
**MatchType** | [**MatchTypeResponse**](MatchTypeResponse.md) |  | 
**Value** | **String** | Keyword value (120 chars max). | 

## Examples

- Prepare the resource
```powershell
$Keyword = Initialize-PSOpenAPIToolsKeyword  -Archived false `
 -Id 383791336903426391 `
 -ParentId 383791336903426391 `
 -ParentType campaign `
 -Type keyword `
 -Bid 200000 `
 -MatchType null `
 -Value null
```

- Convert the resource to JSON
```powershell
$Keyword | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

