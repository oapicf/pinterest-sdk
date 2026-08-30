# AdvertiserDefinedEventProcessingRecord
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Exceptions** | **String[]** | List of exception messages if the operation failed | [optional] 
**Name** | **String** | Name of the advertiser defined event | 
**Status** | **String** | Processing status (success or failure) | 

## Examples

- Prepare the resource
```powershell
$AdvertiserDefinedEventProcessingRecord = Initialize-PSOpenAPIToolsAdvertiserDefinedEventProcessingRecord  -Exceptions null `
 -Name newsletter_signup `
 -Status success
```

- Convert the resource to JSON
```powershell
$AdvertiserDefinedEventProcessingRecord | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

