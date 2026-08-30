
# SSIOInsertionOrderStatusResponse

SSIO insertion order status response for a single pin order id lookup.

## Properties

Name | Type
------------ | -------------
`creationTime` | string
`pinOrderId` | string
`status` | string

## Example

```typescript
import type { SSIOInsertionOrderStatusResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "creationTime": 2017-06-21T23:11:11.000Z,
  "pinOrderId": 0Q01N0000015hekSAB,
  "status": Approved,
} satisfies SSIOInsertionOrderStatusResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as SSIOInsertionOrderStatusResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


