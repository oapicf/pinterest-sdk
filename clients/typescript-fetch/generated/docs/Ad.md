
# Ad


## Properties

Name | Type
------------ | -------------
`adAccountId` | string
`adGroupId` | string
`androidDeepLink` | string
`campaignId` | string
`carouselAndroidDeepLinks` | Array&lt;string&gt;
`carouselDestinationUrls` | Array&lt;string&gt;
`carouselIosDeepLinks` | Array&lt;string&gt;
`cartingPlatformType` | number
`cartingProducts` | [Array&lt;CartingProduct&gt;](CartingProduct.md)
`clickTrackingUrl` | string
`collectionItemsDestinationUrlTemplate` | string
`collectionsHeaderType` | [AdCollectionsHeaderType](AdCollectionsHeaderType.md)
`createdTime` | number
`creativeType` | [CreativeType](CreativeType.md)
`customizableCtaType` | [CustomizableCTAType](CustomizableCTAType.md)
`destinationUrl` | string
`disclosureType` | [DisclosureType](DisclosureType.md)
`disclosureUrl` | string
`gridClickType` | [GridClickType](GridClickType.md)
`id` | string
`iosDeepLink` | string
`isCarting` | boolean
`isCollageAcceptedTerms` | boolean
`isCollageSingleDestination` | boolean
`isPinDeleted` | boolean
`isRemovable` | boolean
`leadFormId` | string
`name` | string
`pinId` | string
`quizPinData` | [QuizPinData](QuizPinData.md)
`rejectedReasons` | [Array&lt;AdDisapprovalReasons&gt;](AdDisapprovalReasons.md)
`rejectionLabels` | Array&lt;string&gt;
`reviewStatus` | [AdReviewStatus](AdReviewStatus.md)
`status` | [EntityStatus](EntityStatus.md)
`summaryStatus` | [PinPromotionSummaryStatus](PinPromotionSummaryStatus.md)
`trackingUrls` | [TrackingUrls](TrackingUrls.md)
`type` | string
`updatedTime` | number
`viewTrackingUrl` | string

## Example

```typescript
import type { Ad } from ''

// TODO: Update the object below with actual values
const example = {
  "adAccountId": null,
  "adGroupId": null,
  "androidDeepLink": null,
  "campaignId": null,
  "carouselAndroidDeepLinks": null,
  "carouselDestinationUrls": null,
  "carouselIosDeepLinks": null,
  "cartingPlatformType": null,
  "cartingProducts": null,
  "clickTrackingUrl": null,
  "collectionItemsDestinationUrlTemplate": null,
  "collectionsHeaderType": null,
  "createdTime": null,
  "creativeType": null,
  "customizableCtaType": null,
  "destinationUrl": null,
  "disclosureType": null,
  "disclosureUrl": null,
  "gridClickType": null,
  "id": null,
  "iosDeepLink": null,
  "isCarting": null,
  "isCollageAcceptedTerms": null,
  "isCollageSingleDestination": null,
  "isPinDeleted": null,
  "isRemovable": null,
  "leadFormId": null,
  "name": null,
  "pinId": null,
  "quizPinData": null,
  "rejectedReasons": null,
  "rejectionLabels": null,
  "reviewStatus": null,
  "status": null,
  "summaryStatus": null,
  "trackingUrls": null,
  "type": null,
  "updatedTime": null,
  "viewTrackingUrl": null,
} satisfies Ad

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as Ad
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


