
# BillingProfilesResponse


## Properties

Name | Type
------------ | -------------
`advertiserId` | string
`billingType` | string
`cardType` | string
`id` | string
`paymentMethodBrand` | string
`status` | string

## Example

```typescript
import type { BillingProfilesResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "advertiserId": 12312451231,
  "billingType": CREDIT_CARD,
  "cardType": VISA,
  "id": 12312451231,
  "paymentMethodBrand": VISA,
  "status": INVALID,
} satisfies BillingProfilesResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as BillingProfilesResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


