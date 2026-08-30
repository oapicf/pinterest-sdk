
# QuizPinData

This field includes all quiz data including questions, options, and results.

## Properties

Name | Type
------------ | -------------
`questions` | [Array&lt;QuizPinQuestion&gt;](QuizPinQuestion.md)
`results` | [Array&lt;QuizPinResult&gt;](QuizPinResult.md)
`tieBreakerCustomResult` | [QuizPinResult](QuizPinResult.md)
`tieBreakerType` | [TieBreakerType](TieBreakerType.md)

## Example

```typescript
import type { QuizPinData } from ''

// TODO: Update the object below with actual values
const example = {
  "questions": null,
  "results": null,
  "tieBreakerCustomResult": null,
  "tieBreakerType": null,
} satisfies QuizPinData

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as QuizPinData
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


