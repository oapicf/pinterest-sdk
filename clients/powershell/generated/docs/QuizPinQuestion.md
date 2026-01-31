# QuizPinQuestion
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Options** | [**QuizPinOption[]**](QuizPinOption.md) |  | [optional] 
**QuestionId** | **Decimal** |  | [optional] 
**QuestionText** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$QuizPinQuestion = Initialize-PSOpenAPIToolsQuizPinQuestion  -Options null `
 -QuestionId null `
 -QuestionText null
```

- Convert the resource to JSON
```powershell
$QuizPinQuestion | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

