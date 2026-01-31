# IntegrationLog
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdvertiserId** | **String** |  | [optional] 
**AppVersionNumber** | **String** | Version number of the integration application. | [optional] 
**ClientTimestamp** | **Int32** | Timestamp in milliseconds of when the log was executed at the client. | 
**VarError** | [**IntegrationLogClientError**](IntegrationLogClientError.md) |  | [optional] 
**EventType** | **String** | Log event type | 
**ExternalBusinessId** | **String** |  | [optional] 
**FeedProfileId** | **String** |  | [optional] 
**LogLevel** | **String** | Log level type | 
**MerchantId** | **String** |  | [optional] 
**Message** | **String** | Explanation of the event that occured. | [optional] 
**PlatformVersionNumber** | **String** | Version number of the platform the integration application is running on. | [optional] 
**Request** | [**IntegrationLogClientRequest**](IntegrationLogClientRequest.md) |  | [optional] 
**TagId** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$IntegrationLog = Initialize-PSOpenAPIToolsIntegrationLog  -AdvertiserId null `
 -AppVersionNumber null `
 -ClientTimestamp null `
 -VarError null `
 -EventType null `
 -ExternalBusinessId null `
 -FeedProfileId null `
 -LogLevel null `
 -MerchantId null `
 -Message null `
 -PlatformVersionNumber null `
 -Request null `
 -TagId null
```

- Convert the resource to JSON
```powershell
$IntegrationLog | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

