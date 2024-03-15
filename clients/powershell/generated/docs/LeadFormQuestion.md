# LeadFormQuestion
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**QuestionType** | [**LeadFormQuestionType**](LeadFormQuestionType.md) |  | [optional] 
**CustomQuestionFieldType** | [**LeadFormQuestionFieldType**](LeadFormQuestionFieldType.md) |  | [optional] 
**CustomQuestionLabel** | **String** | Question label for a custom question. | [optional] 
**CustomQuestionOptions** | **String[]** | Question options for a custom question. | [optional] 

## Examples

- Prepare the resource
```powershell
$LeadFormQuestion = Initialize-PSOpenAPIToolsLeadFormQuestion  -QuestionType null `
 -CustomQuestionFieldType null `
 -CustomQuestionLabel null `
 -CustomQuestionOptions null
```

- Convert the resource to JSON
```powershell
$LeadFormQuestion | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

