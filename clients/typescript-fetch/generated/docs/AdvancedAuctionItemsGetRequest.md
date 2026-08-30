
# AdvancedAuctionItemsGetRequest

Request object used to get bid options values for a batch of retail catalog items

## Properties

Name | Type
------------ | -------------
`catalogId` | string
`items` | [Array&lt;AdvancedAuctionKey&gt;](AdvancedAuctionKey.md)

## Example

```typescript
import type { AdvancedAuctionItemsGetRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "catalogId": 2680059592705,
  "items": null,
} satisfies AdvancedAuctionItemsGetRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AdvancedAuctionItemsGetRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


