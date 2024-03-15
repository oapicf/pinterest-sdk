# AdGroupCommonTrackingUrls
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
$AdGroupCommonTrackingUrls = Initialize-PSOpenAPIToolsAdGroupCommonTrackingUrls  -Impression null `
 -Click null `
 -Engagement null `
 -BuyableButton null `
 -AudienceVerification null
```

- Convert the resource to JSON
```powershell
$AdGroupCommonTrackingUrls | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

