
# BulkDownloadCreate

Resource create operation model.

## Properties

Name | Type
------------ | -------------
`campaignFilter` | [BulkDownloadCampaignFilter](BulkDownloadCampaignFilter.md)
`entityIds` | Array&lt;string&gt;
`entityTypes` | [Array&lt;BulkEntityType&gt;](BulkEntityType.md)
`outputFormat` | [BulkOutputFormat](BulkOutputFormat.md)
`updatedSince` | string

## Example

```typescript
import type { BulkDownloadCreate } from ''

// TODO: Update the object below with actual values
const example = {
  "campaignFilter": null,
  "entityIds": null,
  "entityTypes": ["CAMPAIGN","AD_GROUP"],
  "outputFormat": null,
  "updatedSince": 1622848072,
} satisfies BulkDownloadCreate

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as BulkDownloadCreate
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


