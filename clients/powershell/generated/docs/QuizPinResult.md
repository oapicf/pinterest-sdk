# QuizPinResult
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OrganicPinId** | **String** |  | [optional] 
**AndroidDeepLink** | **String** |  | [optional] 
**IosDeepLink** | **String** |  | [optional] 
**DestinationUrl** | **String** |  | [optional] 
**ResultId** | **Decimal** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$QuizPinResult = Initialize-PSOpenAPIToolsQuizPinResult  -OrganicPinId null `
 -AndroidDeepLink null `
 -IosDeepLink null `
 -DestinationUrl null `
 -ResultId null
```

- Convert the resource to JSON
```powershell
$QuizPinResult | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

