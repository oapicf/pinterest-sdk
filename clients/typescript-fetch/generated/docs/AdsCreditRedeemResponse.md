
# AdsCreditRedeemResponse


## Properties

Name | Type
------------ | -------------
`success` | boolean
`errorCode` | number
`errorMessage` | string

## Example

```typescript
import type { AdsCreditRedeemResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "success": false,
  "errorCode": 2708,
  "errorMessage": The offer has already been redeemed by this advertiser,
} satisfies AdsCreditRedeemResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AdsCreditRedeemResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


