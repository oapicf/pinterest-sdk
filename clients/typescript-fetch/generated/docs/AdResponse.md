
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
`customizableCtaType` | [CustomizableCTAType](CustomizableCTAType.md)
`destinationUrl` | string
`disclosureType` | [DisclosureType](DisclosureType.md)
`disclosureUrl` | string
`gridClickType` | [GridClickType](GridClickType.md)
`iosDeepLink` | string
`isPinDeleted` | boolean
`isRemovable` | boolean
`leadFormId` | string
`name` | string
`quizPinData` | [QuizPinData](QuizPinData.md)
`status` | [EntityStatus](EntityStatus.md)
`trackingUrls` | [TrackingUrls](TrackingUrls.md)
`viewTrackingUrl` | string
`pinId` | string
`adAccountId` | string
`campaignId` | string
`collectionItemsDestinationUrlTemplate` | string
`createdTime` | number
`id` | string
`rejectedReasons` | Array&lt;string&gt;
`rejectionLabels` | Array&lt;string&gt;
`reviewStatus` | string
`summaryStatus` | [PinPromotionSummaryStatus](PinPromotionSummaryStatus.md)
`type` | string
`updatedTime` | number

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
  "customizableCtaType": null,
  "destinationUrl": null,
  "disclosureType": null,
  "disclosureUrl": null,
  "gridClickType": null,
  "iosDeepLink": null,
  "isPinDeleted": false,
  "isRemovable": false,
  "leadFormId": null,
  "name": null,
  "quizPinData": null,
  "status": null,
  "trackingUrls": null,
  "viewTrackingUrl": null,
  "pinId": 394205773611545468,
  "adAccountId": 549755885175,
  "campaignId": 626735565838,
  "collectionItemsDestinationUrlTemplate": null,
  "createdTime": 1451431341,
  "id": 687195134316,
  "rejectedReasons": null,
  "rejectionLabels": null,
  "reviewStatus": PENDING,
  "summaryStatus": null,
  "type": pinpromotion,
  "updatedTime": 1451431341,
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


