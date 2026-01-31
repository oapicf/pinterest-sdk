
# CreativeAssetsProcessingRecord

Object describing an item processing record

## Properties

Name | Type
------------ | -------------
`creativeAssetsId` | string
`errors` | [Array&lt;ItemValidationEvent&gt;](ItemValidationEvent.md)
`status` | [ItemProcessingStatus](ItemProcessingStatus.md)
`warnings` | [Array&lt;ItemValidationEvent&gt;](ItemValidationEvent.md)

## Example

```typescript
import type { CreativeAssetsProcessingRecord } from ''

// TODO: Update the object below with actual values
const example = {
  "creativeAssetsId": DS0294-M,
  "errors": null,
  "status": null,
  "warnings": null,
} satisfies CreativeAssetsProcessingRecord

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CreativeAssetsProcessingRecord
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


