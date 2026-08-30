
# CampaignBatchItem

Item in a batch campaign response.

## Properties

Name | Type
------------ | -------------
`data` | [CampaignBatchResponseData](CampaignBatchResponseData.md)
`exceptions` | [Array&lt;Exception&gt;](Exception.md)

## Example

```typescript
import type { CampaignBatchItem } from ''

// TODO: Update the object below with actual values
const example = {
  "data": null,
  "exceptions": null,
} satisfies CampaignBatchItem

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CampaignBatchItem
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


