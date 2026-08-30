# AdGroupTrackingURLs
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AudienceVerification** | **String[]** |  | [optional] 
**BuyableButton** | **String[]** |  | [optional] 
**Click** | **String[]** |  | [optional] 
**Engagement** | **String[]** |  | [optional] 
**Impression** | **String[]** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$AdGroupTrackingURLs = Initialize-PSOpenAPIToolsAdGroupTrackingURLs  -AudienceVerification null `
 -BuyableButton null `
 -Click null `
 -Engagement null `
 -Impression null
```

- Convert the resource to JSON
```powershell
$AdGroupTrackingURLs | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

