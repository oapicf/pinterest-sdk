# AdvertiserDefinedEvent
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MappedConversionType** | [**ConversionTagTypeOptimal**](ConversionTagTypeOptimal.md) | Standard type mapped to ADE for optimization | [optional] 
**Name** | **String** | Raw string name of the event, usually logged as raw_event_name in our dataset | [optional] 

## Examples

- Prepare the resource
```powershell
$AdvertiserDefinedEvent = Initialize-PSOpenAPIToolsAdvertiserDefinedEvent  -MappedConversionType SIGNUP `
 -Name newsletter_signup
```

- Convert the resource to JSON
```powershell
$AdvertiserDefinedEvent | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

