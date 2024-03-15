# QuizPinQuestion
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**QuestionId** | **Decimal** |  | [optional] 
**QuestionText** | **String** |  | [optional] 
**Options** | [**QuizPinOption[]**](QuizPinOption.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$QuizPinQuestion = Initialize-PSOpenAPIToolsQuizPinQuestion  -QuestionId null `
 -QuestionText null `
 -Options null
```

- Convert the resource to JSON
```powershell
$QuizPinQuestion | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

