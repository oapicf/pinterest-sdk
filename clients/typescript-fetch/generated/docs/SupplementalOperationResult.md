
# SupplementalOperationResult

Result of a supplemental item operation, discriminated by supplemental_type

## Properties

Name | Type
------------ | -------------
`errors` | [Array&lt;SupplementalItemValidationEvent&gt;](SupplementalItemValidationEvent.md)
`itemId` | string
`status` | [SupplementalItemProcessingStatus](SupplementalItemProcessingStatus.md)
`storeCode` | string
`supplementalType` | string
`warnings` | [Array&lt;SupplementalItemValidationEvent&gt;](SupplementalItemValidationEvent.md)

## Example

```typescript
import type { SupplementalOperationResult } from ''

// TODO: Update the object below with actual values
const example = {
  "errors": null,
  "itemId": item_id_1,
  "status": null,
  "storeCode": store_1,
  "supplementalType": null,
  "warnings": null,
} satisfies SupplementalOperationResult

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as SupplementalOperationResult
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


