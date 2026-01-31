
# LeadFormQuestion


## Properties

Name | Type
------------ | -------------
`questionType` | [LeadFormQuestionType](LeadFormQuestionType.md)
`customQuestionFieldType` | [LeadFormQuestionFieldType](LeadFormQuestionFieldType.md)
`customQuestionLabel` | string
`customQuestionOptions` | Array&lt;string&gt;

## Example

```typescript
import type { LeadFormQuestion } from ''

// TODO: Update the object below with actual values
const example = {
  "questionType": null,
  "customQuestionFieldType": null,
  "customQuestionLabel": null,
  "customQuestionOptions": null,
} satisfies LeadFormQuestion

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as LeadFormQuestion
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


