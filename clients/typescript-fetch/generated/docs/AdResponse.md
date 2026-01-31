
# AdResponse


## Properties

Name | Type
------------ | -------------
`adGroupId` | string
`androidDeepLink` | string
`carouselAndroidDeepLinks` | Array&lt;string&gt;
`carouselDestinationUrls` | Array&lt;string&gt;
`carouselIosDeepLinks` | Array&lt;string&gt;
`clickTrackingUrl` | string
`creativeType` | [CreativeType](CreativeType.md)
`destinationUrl` | string
`iosDeepLink` | string
`isPinDeleted` | boolean
`isRemovable` | boolean
`name` | string
`status` | [EntityStatus](EntityStatus.md)
`trackingUrls` | [TrackingUrls](TrackingUrls.md)
`viewTrackingUrl` | string
`leadFormId` | string
`gridClickType` | [GridClickType](GridClickType.md)
`customizableCtaType` | string
`quizPinData` | [QuizPinData](QuizPinData.md)
`pinId` | string
`adAccountId` | string
`campaignId` | string
`collectionItemsDestinationUrlTemplate` | string
`createdTime` | number
`id` | string
`rejectedReasons` | Array&lt;string&gt;
`rejectionLabels` | Array&lt;string&gt;
`reviewStatus` | string
`type` | string
`updatedTime` | number
`summaryStatus` | [PinPromotionSummaryStatus](PinPromotionSummaryStatus.md)

## Example

```typescript
import type { AdResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "adGroupId": 2680059592705,
  "androidDeepLink": null,
  "carouselAndroidDeepLinks": null,
  "carouselDestinationUrls": null,
  "carouselIosDeepLinks": null,
  "clickTrackingUrl": null,
  "creativeType": null,
  "destinationUrl": null,
  "iosDeepLink": null,
  "isPinDeleted": false,
  "isRemovable": false,
  "name": null,
  "status": null,
  "trackingUrls": null,
  "viewTrackingUrl": null,
  "leadFormId": null,
  "gridClickType": null,
  "customizableCtaType": LEARN_MORE,
  "quizPinData": null,
  "pinId": 394205773611545468,
  "adAccountId": 549755885175,
  "campaignId": 626735565838,
  "collectionItemsDestinationUrlTemplate": null,
  "createdTime": 1451431341,
  "id": 687195134316,
  "rejectedReasons": null,
  "rejectionLabels": null,
  "reviewStatus": PENDING,
  "type": pinpromotion,
  "updatedTime": 1451431341,
  "summaryStatus": null,
} satisfies AdResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AdResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


