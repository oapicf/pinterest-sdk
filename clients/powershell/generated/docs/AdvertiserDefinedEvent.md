# AdvertiserDefinedEvent
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **String** | raw string name of the event, usually logged as raw_event_name in our dataset | [optional] 
**MappedConversionType** | **String** | standard type mapped to ADE for optimization | [optional] 

## Examples

- Prepare the resource
```powershell
$AdvertiserDefinedEvent = Initialize-PSOpenAPIToolsAdvertiserDefinedEvent  -Name download_picture `
 -MappedConversionType null
```

- Convert the resource to JSON
```powershell
$AdvertiserDefinedEvent | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

