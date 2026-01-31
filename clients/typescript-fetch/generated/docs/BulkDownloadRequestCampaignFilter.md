
# BulkDownloadRequestCampaignFilter


## Properties

Name | Type
------------ | -------------
`startTime` | string
`endTime` | string
`name` | string
`campaignStatus` | [Array&lt;CampaignSummaryStatus&gt;](CampaignSummaryStatus.md)
`objectiveType` | [Array&lt;ObjectiveType&gt;](ObjectiveType.md)

## Example

```typescript
import type { BulkDownloadRequestCampaignFilter } from ''

// TODO: Update the object below with actual values
const example = {
  "startTime": 1622848072,
  "endTime": 1622848072,
  "name": campaign name,
  "campaignStatus": null,
  "objectiveType": null,
} satisfies BulkDownloadRequestCampaignFilter

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as BulkDownloadRequestCampaignFilter
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


