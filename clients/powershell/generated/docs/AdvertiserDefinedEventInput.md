# AdvertiserDefinedEventInput
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MappedConversionType** | [**AdvertiserDefinedEventMappingType**](AdvertiserDefinedEventMappingType.md) | Pinterest standard event type to map this custom event to for campaign optimization and reporting | 
**Name** | **String** | Raw string name of the event | 

## Examples

- Prepare the resource
```powershell
$AdvertiserDefinedEventInput = Initialize-PSOpenAPIToolsAdvertiserDefinedEventInput  -MappedConversionType SIGNUP `
 -Name newsletter_signup
```

- Convert the resource to JSON
```powershell
$AdvertiserDefinedEventInput | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

