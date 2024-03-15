# TrackingUrls
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Impression** | **String[]** |  | [optional] 
**Click** | **String[]** |  | [optional] 
**Engagement** | **String[]** |  | [optional] 
**BuyableButton** | **String[]** |  | [optional] 
**AudienceVerification** | **String[]** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$TrackingUrls = Initialize-PSOpenAPIToolsTrackingUrls  -Impression null `
 -Click null `
 -Engagement null `
 -BuyableButton null `
 -AudienceVerification null
```

- Convert the resource to JSON
```powershell
$TrackingUrls | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

