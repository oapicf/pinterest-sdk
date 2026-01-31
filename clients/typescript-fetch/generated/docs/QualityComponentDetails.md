
# QualityComponentDetails

Metrics for a specific event type within a quality component.

## Properties

Name | Type
------------ | -------------
`coverage` | number
`issues` | [Array&lt;QualityComponentIssue&gt;](QualityComponentIssue.md)
`overlap` | number

## Example

```typescript
import type { QualityComponentDetails } from ''

// TODO: Update the object below with actual values
const example = {
  "coverage": null,
  "issues": null,
  "overlap": null,
} satisfies QualityComponentDetails

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as QualityComponentDetails
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


