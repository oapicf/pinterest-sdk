# QuizPinData
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Questions** | [**QuizPinQuestion[]**](QuizPinQuestion.md) |  | [optional] 
**Results** | [**QuizPinResult[]**](QuizPinResult.md) |  | [optional] 
**TieBreakerCustomResult** | [**QuizPinResult**](QuizPinResult.md) |  | [optional] 
**TieBreakerType** | **String** | Quiz ad tie breaker type, default is RANDOM | [optional] 

## Examples

- Prepare the resource
```powershell
$QuizPinData = Initialize-PSOpenAPIToolsQuizPinData  -Questions null `
 -Results null `
 -TieBreakerCustomResult null `
 -TieBreakerType null
```

- Convert the resource to JSON
```powershell
$QuizPinData | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

