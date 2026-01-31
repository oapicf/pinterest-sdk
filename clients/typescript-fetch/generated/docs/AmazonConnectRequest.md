
# AmazonConnectRequest

Request containing OTP and Amazon storefront info called by Amazon

## Properties

Name | Type
------------ | -------------
`amazonStorefrontId` | string
`amazonStorefrontName` | string
`amazonStorefrontUrl` | string
`amazonUserId` | string
`isAmazonAccountLinked` | boolean
`oneTimePasscode` | string
`pinterestUserId` | string

## Example

```typescript
import type { AmazonConnectRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "amazonStorefrontId": null,
  "amazonStorefrontName": null,
  "amazonStorefrontUrl": null,
  "amazonUserId": null,
  "isAmazonAccountLinked": null,
  "oneTimePasscode": 089aee0d-92d3-4f8f-a947-6dc016d85bf0,
  "pinterestUserId": 902057137772013006,
} satisfies AmazonConnectRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AmazonConnectRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


