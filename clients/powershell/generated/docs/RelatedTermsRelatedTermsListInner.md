# RelatedTermsRelatedTermsListInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RelatedTerms** | **String[]** |  | [optional] 
**Term** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$RelatedTermsRelatedTermsListInner = Initialize-PSOpenAPIToolsRelatedTermsRelatedTermsListInner  -RelatedTerms [&quot;shoes&quot;,&quot;cute clothes&quot;] `
 -Term clothes
```

- Convert the resource to JSON
```powershell
$RelatedTermsRelatedTermsListInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

