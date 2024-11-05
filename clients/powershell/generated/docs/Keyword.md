# Keyword
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Bid** | **Int32** | &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. | [optional] 
**MatchType** | [**MatchTypeResponse**](MatchTypeResponse.md) |  | 
**Value** | **String** | Keyword value (120 chars max). | 
**Archived** | **Boolean** |  | [optional] 
**Id** | **String** | Keyword ID . | [optional] 
**ParentId** | **String** | Keyword parent entity ID (advertiser, campaign, ad group). | [optional] 
**ParentType** | **String** | Parent entity type | [optional] 
**Type** | **String** | Always keyword | [optional] 

## Examples

- Prepare the resource
```powershell
$Keyword = Initialize-PSOpenAPIToolsKeyword  -Bid null `
 -MatchType null `
 -Value null `
 -Archived false `
 -Id 383791336903426391 `
 -ParentId 383791336903426391 `
 -ParentType campaign `
 -Type keyword
```

- Convert the resource to JSON
```powershell
$Keyword | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

