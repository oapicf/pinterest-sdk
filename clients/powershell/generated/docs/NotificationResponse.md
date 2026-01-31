# NotificationResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Success** | **Boolean** | Returns true if the notification accepted. | [optional] 
**ReceivedAt** | **Int32** | Received time. Unix timestamp in seconds. | [optional] 
**ErrorMsg** | **String** | error message when success is false | [optional] 

## Examples

- Prepare the resource
```powershell
$NotificationResponse = Initialize-PSOpenAPIToolsNotificationResponse  -Success false `
 -ReceivedAt 1677003860 `
 -ErrorMsg null
```

- Convert the resource to JSON
```powershell
$NotificationResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

