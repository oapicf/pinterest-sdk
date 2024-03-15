# RelatedTerms
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | First input term. For example, if you pass &quot;&quot;?terms&#x3D;clothes,workout&quot;&quot;, then id will be &quot;&quot;clothes&quot;&quot; | [optional] 
**RelatedTermCount** | **Int32** | Total number of related terms returned | [optional] 
**RelatedTermsList** | [**RelatedTermsRelatedTermsListInner[]**](RelatedTermsRelatedTermsListInner.md) | The id of the advertiser. | [optional] 

## Examples

- Prepare the resource
```powershell
$RelatedTerms = Initialize-PSOpenAPIToolsRelatedTerms  -Id clothes `
 -RelatedTermCount 2 `
 -RelatedTermsList null
```

- Convert the resource to JSON
```powershell
$RelatedTerms | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

