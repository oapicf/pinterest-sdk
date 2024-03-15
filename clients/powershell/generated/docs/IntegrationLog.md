# IntegrationLog
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ClientTimestamp** | **Int32** | Timestamp in milliseconds of when the log was executed at the client. | 
**EventType** | **String** | Log event type | 
**LogLevel** | **String** | Log level type | 
**ExternalBusinessId** | **String** |  | [optional] 
**AdvertiserId** | **String** |  | [optional] 
**MerchantId** | **String** |  | [optional] 
**TagId** | **String** |  | [optional] 
**FeedProfileId** | **String** |  | [optional] 
**Message** | **String** | Explanation of the event that occured. | [optional] 
**AppVersionNumber** | **String** | Version number of the integration application. | [optional] 
**PlatformVersionNumber** | **String** | Version number of the platform the integration application is running on. | [optional] 
**VarError** | [**IntegrationLogClientError**](IntegrationLogClientError.md) |  | [optional] 
**Request** | [**IntegrationLogClientRequest**](IntegrationLogClientRequest.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$IntegrationLog = Initialize-PSOpenAPIToolsIntegrationLog  -ClientTimestamp null `
 -EventType null `
 -LogLevel null `
 -ExternalBusinessId null `
 -AdvertiserId null `
 -MerchantId null `
 -TagId null `
 -FeedProfileId null `
 -Message null `
 -AppVersionNumber null `
 -PlatformVersionNumber null `
 -VarError null `
 -Request null
```

- Convert the resource to JSON
```powershell
$IntegrationLog | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

