
# SSIOInsertionOrderStatus


## Properties

Name | Type
------------ | -------------
`pinOrderId` | string
`status` | string
`creationTime` | string

## Example

```typescript
import type { SSIOInsertionOrderStatus } from ''

// TODO: Update the object below with actual values
const example = {
  "pinOrderId": 0Q01N0000015hekSAB,
  "status": Approved,
  "creationTime": 2017-06-21T23:11:11.000Z,
} satisfies SSIOInsertionOrderStatus

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as SSIOInsertionOrderStatus
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


