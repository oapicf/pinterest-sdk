
# AdvancedAuctionItems

Response object containing item bid options

## Properties

Name | Type
------------ | -------------
`catalogId` | string
`items` | [Array&lt;AdvancedAuctionItem&gt;](AdvancedAuctionItem.md)

## Example

```typescript
import type { AdvancedAuctionItems } from ''

// TODO: Update the object below with actual values
const example = {
  "catalogId": 2680059592705,
  "items": null,
} satisfies AdvancedAuctionItems

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AdvancedAuctionItems
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


