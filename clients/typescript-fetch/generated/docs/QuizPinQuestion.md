
# QuizPinQuestion

A specific quiz inquiry.

## Properties

Name | Type
------------ | -------------
`questionId` | number
`questionText` | string
`options` | [Array&lt;QuizPinOption&gt;](QuizPinOption.md)

## Example

```typescript
import type { QuizPinQuestion } from ''

// TODO: Update the object below with actual values
const example = {
  "questionId": null,
  "questionText": null,
  "options": null,
} satisfies QuizPinQuestion

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as QuizPinQuestion
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


