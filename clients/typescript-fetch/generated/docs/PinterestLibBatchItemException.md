
# PinterestLibBatchItemException

Exception details for a batch operation item.

## Properties

Name | Type
------------ | -------------
`code` | number
`message` | string

## Example

```typescript
import type { PinterestLibBatchItemException } from ''

// TODO: Update the object below with actual values
const example = {
  "code": 2,
  "message": Advertiser not found.,
} satisfies PinterestLibBatchItemException

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as PinterestLibBatchItemException
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


