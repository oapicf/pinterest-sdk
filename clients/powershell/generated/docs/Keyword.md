# Keyword
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Archived** | **Boolean** |  | [optional] 
**Bid** | **Int32** | **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. | [optional] 
**Id** | **String** | Keyword ID . | 
**MatchType** | [**MatchType**](MatchType.md) | Keyword [match type](/docs/api-features/targeting-overview/) | 
**ParentId** | **String** | Keyword parent entity ID (advertiser, campaign, ad group). | [readonly] 
**ParentType** | **String** | Parent entity type (advertiser, campaign, ad group). | [optional] [readonly] 
**Type** | **String** | Always keyword | [optional] [readonly] 
**Value** | **String** | Keyword value (120 chars max). | 

## Examples

- Prepare the resource
```powershell
$Keyword = Initialize-PSOpenAPIToolsKeyword  -Archived false `
 -Bid null `
 -Id 383791336903426391 `
 -MatchType null `
 -ParentId 383791336903426391 `
 -ParentType campaign `
 -Type keyword `
 -Value null
```

- Convert the resource to JSON
```powershell
$Keyword | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

