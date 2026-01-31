
# ConversionEventsDataInner


## Properties

Name | Type
------------ | -------------
`eventName` | string
`actionSource` | string
`eventTime` | number
`eventId` | string
`eventSourceUrl` | string
`optOut` | boolean
`partnerName` | string
`userData` | [ConversionEventsUserData](ConversionEventsUserData.md)
`customData` | [ConversionEventsDataInnerCustomData](ConversionEventsDataInnerCustomData.md)
`appId` | string
`appName` | string
`appVersion` | string
`deviceBrand` | string
`deviceCarrier` | string
`deviceModel` | string
`deviceType` | string
`osVersion` | string
`wifi` | boolean
`language` | string

## Example

```typescript
import type { ConversionEventsDataInner } from ''

// TODO: Update the object below with actual values
const example = {
  "eventName": checkout,
  "actionSource": app_ios,
  "eventTime": 1451431341,
  "eventId": eventId0001,
  "eventSourceUrl": https://www.my-clothing-shop.org/,
  "optOut": false,
  "partnerName": ss-partnername,
  "userData": null,
  "customData": null,
  "appId": 429047995,
  "appName": Pinterest,
  "appVersion": 7.9,
  "deviceBrand": Apple,
  "deviceCarrier": T-Mobile,
  "deviceModel": iPhone X,
  "deviceType": iPhone,
  "osVersion": 12.1.4,
  "wifi": false,
  "language": en,
} satisfies ConversionEventsDataInner

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ConversionEventsDataInner
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


