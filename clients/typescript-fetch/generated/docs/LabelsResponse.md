
# LabelsResponse


## Properties

Name | Type
------------ | -------------
`errors` | [Array&lt;LabelError&gt;](LabelError.md)
`labels` | [Array&lt;Label&gt;](Label.md)

## Example

```typescript
import type { LabelsResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "errors": null,
  "labels": null,
} satisfies LabelsResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as LabelsResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


