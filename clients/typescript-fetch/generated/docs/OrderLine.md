
# OrderLine


## Properties

Name | Type
------------ | -------------
`id` | string
`type` | string
`adAccountId` | string
`purchaseOrderId` | string
`startTime` | number
`endTime` | number
`budget` | number
`paidBudget` | number
`status` | [OrderLineStatus](OrderLineStatus.md)
`name` | string
`paidType` | [OrderLinePaidType](OrderLinePaidType.md)
`campaignIds` | Array&lt;string&gt;

## Example

```typescript
import type { OrderLine } from ''

// TODO: Update the object below with actual values
const example = {
  "id": 2680059592705,
  "type": orderline,
  "adAccountId": 549755885175,
  "purchaseOrderId": PO12345,
  "startTime": 1452208622,
  "endTime": 1461269616,
  "budget": 5000000,
  "paidBudget": 5000000,
  "status": null,
  "name": Order Line Name 1,
  "paidType": null,
  "campaignIds": ["626735565838"],
} satisfies OrderLine

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as OrderLine
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


