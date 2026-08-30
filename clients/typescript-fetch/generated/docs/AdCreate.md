
# AdCreate

Resource create operation model.

## Properties

Name | Type
------------ | -------------
`adGroupId` | string
`androidDeepLink` | string
`carouselAndroidDeepLinks` | Array&lt;string&gt;
`carouselDestinationUrls` | Array&lt;string&gt;
`carouselIosDeepLinks` | Array&lt;string&gt;
`clickTrackingUrl` | string
`collectionItemsDestinationUrlTemplate` | string
`collectionsHeaderType` | [AdCollectionsHeaderType](AdCollectionsHeaderType.md)
`creativeType` | [CreativeType](CreativeType.md)
`customizableCtaType` | [CustomizableCTAType](CustomizableCTAType.md)
`destinationUrl` | string
`disclosureType` | [DisclosureType](DisclosureType.md)
`disclosureUrl` | string
`gridClickType` | [GridClickType](GridClickType.md)
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
`status` | [EntityStatus](EntityStatus.md)
`trackingUrls` | [TrackingUrls](TrackingUrls.md)
`viewTrackingUrl` | string

## Example

```typescript
import type { AdCreate } from ''

// TODO: Update the object below with actual values
const example = {
  "adGroupId": null,
  "androidDeepLink": null,
  "carouselAndroidDeepLinks": null,
  "carouselDestinationUrls": null,
  "carouselIosDeepLinks": null,
  "clickTrackingUrl": null,
  "collectionItemsDestinationUrlTemplate": null,
  "collectionsHeaderType": null,
  "creativeType": null,
  "customizableCtaType": null,
  "destinationUrl": null,
  "disclosureType": null,
  "disclosureUrl": null,
  "gridClickType": null,
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
  "status": null,
  "trackingUrls": null,
  "viewTrackingUrl": null,
} satisfies AdCreate

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AdCreate
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


