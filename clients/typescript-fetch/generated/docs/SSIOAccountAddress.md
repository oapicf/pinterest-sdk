
# SSIOAccountAddress

Salesforce address information.

## Properties

Name | Type
------------ | -------------
`addressId` | string
`display` | string
`orderLegalEntity` | string
`purpose` | string

## Example

```typescript
import type { SSIOAccountAddress } from ''

// TODO: Update the object below with actual values
const example = {
  "addressId": a1C1N000004MUrLUAW,
  "display": 475 Brannan Street, San Francisco, CA 94103,
  "orderLegalEntity": PIN US OU,
  "purpose": Billing,
} satisfies SSIOAccountAddress

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as SSIOAccountAddress
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


