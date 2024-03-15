# RelatedTermsRelatedTermsListInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Term** | **String** |  | [optional] 
**RelatedTerms** | **String[]** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$RelatedTermsRelatedTermsListInner = Initialize-PSOpenAPIToolsRelatedTermsRelatedTermsListInner  -Term clothes `
 -RelatedTerms [&quot;shoes&quot;,&quot;cute clothes&quot;]
```

- Convert the resource to JSON
```powershell
$RelatedTermsRelatedTermsListInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

