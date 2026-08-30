
# AdsCreditRedeem

Ads credit redemption

## Properties

Name | Type
------------ | -------------
`errorCode` | number
`errorMessage` | string
`success` | boolean

## Example

```typescript
import type { AdsCreditRedeem } from ''

// TODO: Update the object below with actual values
const example = {
  "errorCode": 2708,
  "errorMessage": The offer has already been redeemed by this advertiser,
  "success": false,
} satisfies AdsCreditRedeem

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AdsCreditRedeem
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


