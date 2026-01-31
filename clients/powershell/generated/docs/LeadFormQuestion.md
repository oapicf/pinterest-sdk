# LeadFormQuestion
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CustomQuestionFieldType** | [**LeadFormQuestionFieldType**](LeadFormQuestionFieldType.md) |  | [optional] 
**CustomQuestionLabel** | **String** | Question label for a custom question. | [optional] 
**CustomQuestionOptions** | **String[]** | Question options for a custom question. | [optional] 
**QuestionType** | [**LeadFormQuestionType**](LeadFormQuestionType.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$LeadFormQuestion = Initialize-PSOpenAPIToolsLeadFormQuestion  -CustomQuestionFieldType null `
 -CustomQuestionLabel null `
 -CustomQuestionOptions null `
 -QuestionType null
```

- Convert the resource to JSON
```powershell
$LeadFormQuestion | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

