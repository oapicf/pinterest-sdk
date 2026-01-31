
# LabelUpdateRequestLabelsInner


## Properties

Name | Type
------------ | -------------
`id` | string
`status` | [LabelStatus](LabelStatus.md)
`value` | string

## Example

```typescript
import type { LabelUpdateRequestLabelsInner } from ''

// TODO: Update the object below with actual values
const example = {
  "id": 1106385754497,
  "status": null,
  "value": null,
} satisfies LabelUpdateRequestLabelsInner

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as LabelUpdateRequestLabelsInner
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


