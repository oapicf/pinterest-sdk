# QuizPinResult
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AndroidDeepLink** | **String** |  | [optional] 
**DestinationUrl** | **String** |  | [optional] 
**IosDeepLink** | **String** |  | [optional] 
**OrganicPinId** | **String** |  | [optional] 
**ResultId** | **Decimal** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$QuizPinResult = Initialize-PSOpenAPIToolsQuizPinResult  -AndroidDeepLink null `
 -DestinationUrl null `
 -IosDeepLink null `
 -OrganicPinId null `
 -ResultId null
```

- Convert the resource to JSON
```powershell
$QuizPinResult | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

