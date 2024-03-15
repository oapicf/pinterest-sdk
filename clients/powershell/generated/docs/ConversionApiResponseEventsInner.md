# ConversionApiResponseEventsInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | **String** | Whether the event was processed successfully. | 
**ErrorMessage** | **String** | Error message containing more information about why the event failed to be processed. | [optional] 
**WarningMessage** | **String** | Warning messages about any fields in the event which are not standard. These are not critical to event processing. | [optional] 

## Examples

- Prepare the resource
```powershell
$ConversionApiResponseEventsInner = Initialize-PSOpenAPIToolsConversionApiResponseEventsInner  -Status processed `
 -ErrorMessage null `
 -WarningMessage null
```

- Convert the resource to JSON
```powershell
$ConversionApiResponseEventsInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

