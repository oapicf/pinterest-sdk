
# AdCreateRequest


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
`isCarting` | boolean
`isPinDeleted` | boolean
`isRemovable` | boolean
`leadFormId` | string
`name` | string
`pinId` | string
`quizPinData` | object
`status` | [EntityStatus](EntityStatus.md)
`trackingUrls` | object
`viewTrackingUrl` | string

## Example

```typescript
import type { AdCreateRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "adGroupId": null,
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
  "isCarting": null,
  "isPinDeleted": false,
  "isRemovable": false,
  "leadFormId": null,
  "name": null,
  "pinId": 394205773611545468,
  "quizPinData": null,
  "status": null,
  "trackingUrls": null,
  "viewTrackingUrl": null,
} satisfies AdCreateRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AdCreateRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


