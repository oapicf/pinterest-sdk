# AdvertiserDefinedEventsCreateRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**AdvertiserDefinedEventInput[]**](AdvertiserDefinedEventInput.md) | List of advertiser defined events to create or update | 

## Examples

- Prepare the resource
```powershell
$AdvertiserDefinedEventsCreateRequest = Initialize-PSOpenAPIToolsAdvertiserDefinedEventsCreateRequest  -Items null
```

- Convert the resource to JSON
```powershell
$AdvertiserDefinedEventsCreateRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

