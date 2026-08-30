
# OrderLine


## Properties

Name | Type
------------ | -------------
`adAccountId` | string
`budget` | number
`campaignIds` | Array&lt;string&gt;
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
import type { OrderLine } from ''

// TODO: Update the object below with actual values
const example = {
  "adAccountId": null,
  "budget": null,
  "campaignIds": ["626735565838"],
  "endTime": null,
  "id": null,
  "name": null,
  "paidBudget": null,
  "paidType": null,
  "purchaseOrderId": null,
  "startTime": null,
  "status": null,
  "type": null,
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


