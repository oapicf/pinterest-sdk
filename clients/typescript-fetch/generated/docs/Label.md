
# Label


## Properties

Name | Type
------------ | -------------
`id` | string
`labelType` | [NullableLabelType](NullableLabelType.md)
`status` | [NullableLabelStatus](NullableLabelStatus.md)
`value` | string

## Example

```typescript
import type { Label } from ''

// TODO: Update the object below with actual values
const example = {
  "id": 1106385754497,
  "labelType": null,
  "status": null,
  "value": null,
} satisfies Label

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as Label
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


