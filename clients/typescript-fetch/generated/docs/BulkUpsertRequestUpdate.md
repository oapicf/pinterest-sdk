
# BulkUpsertRequestUpdate

Request for creation of entities in bulk.

## Properties

Name | Type
------------ | -------------
`campaigns` | [Array&lt;CampaignUpdateRequest&gt;](CampaignUpdateRequest.md)
`adGroups` | [Array&lt;AdGroupUpdateRequest&gt;](AdGroupUpdateRequest.md)
`ads` | [Array&lt;AdUpdateRequest&gt;](AdUpdateRequest.md)
`productGroups` | [Array&lt;ProductGroupPromotionUpdateRequest&gt;](ProductGroupPromotionUpdateRequest.md)
`keywords` | [Array&lt;KeywordUpdate&gt;](KeywordUpdate.md)

## Example

```typescript
import type { BulkUpsertRequestUpdate } from ''

// TODO: Update the object below with actual values
const example = {
  "campaigns": null,
  "adGroups": null,
  "ads": null,
  "productGroups": null,
  "keywords": null,
} satisfies BulkUpsertRequestUpdate

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as BulkUpsertRequestUpdate
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


