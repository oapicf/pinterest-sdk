
# OrderLines

Order Line

## Properties

Name | Type
------------ | -------------
`adAccountId` | string
`budget` | number
`endTime` | number
`id` | string
`name` | string
`paidBudget` | number
`paidType` | [OrderLinePaidType](OrderLinePaidType.md)
`purchaseOrderId` | string
`startTime` | number
`status` | [OrderLineStatus](OrderLineStatus.md)
`type` | string

## Example

```typescript
import type { OrderLines } from ''

// TODO: Update the object below with actual values
const example = {
  "adAccountId": 549755885175,
  "budget": 5000000,
  "endTime": 1461269616,
  "id": 2680059592705,
  "name": Order Line Name 1,
  "paidBudget": 5000000,
  "paidType": null,
  "purchaseOrderId": PO12345,
  "startTime": 1452208622,
  "status": null,
  "type": orderline,
} satisfies OrderLines

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as OrderLines
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


