
# BulkDownloadRequestCampaignFilter


## Properties

Name | Type
------------ | -------------
`campaignStatus` | [Array&lt;CampaignSummaryStatus&gt;](CampaignSummaryStatus.md)
`endTime` | string
`name` | string
`objectiveType` | [Array&lt;ObjectiveType&gt;](ObjectiveType.md)
`startTime` | string

## Example

```typescript
import type { BulkDownloadRequestCampaignFilter } from ''

// TODO: Update the object below with actual values
const example = {
  "campaignStatus": null,
  "endTime": 1622848072,
  "name": campaign name,
  "objectiveType": null,
  "startTime": 1622848072,
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


