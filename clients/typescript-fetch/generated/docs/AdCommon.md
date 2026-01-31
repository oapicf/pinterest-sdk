
# AdCommon

Creation fields

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

## Example

```typescript
import type { AdCommon } from ''

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
} satisfies AdCommon

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AdCommon
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


