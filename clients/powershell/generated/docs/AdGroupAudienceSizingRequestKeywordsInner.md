# AdGroupAudienceSizingRequestKeywordsInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MatchType** | [**MatchTypeResponse**](MatchTypeResponse.md) |  | 
**Value** | **String** | Keyword value (120 chars max). | 

## Examples

- Prepare the resource
```powershell
$AdGroupAudienceSizingRequestKeywordsInner = Initialize-PSOpenAPIToolsAdGroupAudienceSizingRequestKeywordsInner  -MatchType null `
 -Value null
```

- Convert the resource to JSON
```powershell
$AdGroupAudienceSizingRequestKeywordsInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

