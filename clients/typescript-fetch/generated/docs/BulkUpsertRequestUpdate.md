
# BulkUpsertRequestUpdate

Request for creation of entities in bulk.

## Properties

Name | Type
------------ | -------------
`adGroups` | [Array&lt;AdGroupUpdateRequest&gt;](AdGroupUpdateRequest.md)
`ads` | [Array&lt;AdUpdateRequest&gt;](AdUpdateRequest.md)
`campaigns` | [Array&lt;CampaignUpdateRequest&gt;](CampaignUpdateRequest.md)
`catalogProductGroups` | [Array&lt;CatalogsProductGroupsUpdateRequest&gt;](CatalogsProductGroupsUpdateRequest.md)
`keywords` | [Array&lt;KeywordUpdate&gt;](KeywordUpdate.md)
`labels` | [Array&lt;LabelBulkUpdateRequest&gt;](LabelBulkUpdateRequest.md)
`productGroups` | [Array&lt;ProductGroupPromotionUpdateRequest&gt;](ProductGroupPromotionUpdateRequest.md)

## Example

```typescript
import type { BulkUpsertRequestUpdate } from ''

// TODO: Update the object below with actual values
const example = {
  "adGroups": null,
  "ads": null,
  "campaigns": null,
  "catalogProductGroups": null,
  "keywords": null,
  "labels": null,
  "productGroups": null,
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


