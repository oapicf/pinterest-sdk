# AdCommonQuizPinData
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Questions** | [**QuizPinQuestion[]**](QuizPinQuestion.md) |  | [optional] 
**Results** | [**QuizPinResult[]**](QuizPinResult.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$AdCommonQuizPinData = Initialize-PSOpenAPIToolsAdCommonQuizPinData  -Questions null `
 -Results null
```

- Convert the resource to JSON
```powershell
$AdCommonQuizPinData | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

