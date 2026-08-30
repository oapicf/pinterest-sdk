
# BulkUpsertRequestCreate

Request for creation of entities in bulk.

## Properties

Name | Type
------------ | -------------
`adGroups` | [Array&lt;AdGroupCreateRequest&gt;](AdGroupCreateRequest.md)
`ads` | [Array&lt;AdCreateRequest&gt;](AdCreateRequest.md)
`campaigns` | [Array&lt;CampaignCreateRequest&gt;](CampaignCreateRequest.md)
`catalogProductGroups` | [Array&lt;BulkUpsertRequestCreateCatalogProductGroupsItems&gt;](BulkUpsertRequestCreateCatalogProductGroupsItems.md)
`keywords` | [Array&lt;KeywordsRequest&gt;](KeywordsRequest.md)
`labels` | [Array&lt;LabelBulkCreateRequest&gt;](LabelBulkCreateRequest.md)
`productGroups` | [Array&lt;ProductGroupPromotionCreateRequest&gt;](ProductGroupPromotionCreateRequest.md)
`schedules` | [Array&lt;ScheduleCreateRequest&gt;](ScheduleCreateRequest.md)

## Example

```typescript
import type { BulkUpsertRequestCreate } from ''

// TODO: Update the object below with actual values
const example = {
  "adGroups": null,
  "ads": null,
  "campaigns": null,
  "catalogProductGroups": null,
  "keywords": null,
  "labels": null,
  "productGroups": null,
  "schedules": null,
} satisfies BulkUpsertRequestCreate

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as BulkUpsertRequestCreate
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


