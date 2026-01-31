
# AdsCreditDiscountsResponse


## Properties

Name | Type
------------ | -------------
`active` | boolean
`advertiserId` | string
`discountType` | string
`discountInMicroCurrency` | number
`discountCurrency` | string
`title` | string
`remainingDiscountInMicroCurrency` | number

## Example

```typescript
import type { AdsCreditDiscountsResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "active": true,
  "advertiserId": 12312451231,
  "discountType": null,
  "discountInMicroCurrency": 125000000,
  "discountCurrency": USD,
  "title": Ads Credits,
  "remainingDiscountInMicroCurrency": 125000000,
} satisfies AdsCreditDiscountsResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AdsCreditDiscountsResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


