
# ConversionEventsDataInner


## Properties

Name | Type
------------ | -------------
`actionSource` | string
`appId` | string
`appInfo` | [ConversionEventAppInfo](ConversionEventAppInfo.md)
`appName` | string
`appVersion` | string
`customData` | [ConversionEventsDataInnerCustomData](ConversionEventsDataInnerCustomData.md)
`deviceBrand` | string
`deviceCarrier` | string
`deviceInfo` | [ConversionEventDeviceInfo](ConversionEventDeviceInfo.md)
`deviceModel` | string
`deviceType` | string
`eventId` | string
`eventName` | string
`eventSourceUrl` | string
`eventTime` | number
`language` | string
`optOut` | boolean
`osVersion` | string
`partnerName` | string
`userData` | [ConversionEventsUserData](ConversionEventsUserData.md)
`wifi` | boolean

## Example

```typescript
import type { ConversionEventsDataInner } from ''

// TODO: Update the object below with actual values
const example = {
  "actionSource": app_ios,
  "appId": 429047995,
  "appInfo": null,
  "appName": Pinterest,
  "appVersion": 7.9,
  "customData": null,
  "deviceBrand": Apple,
  "deviceCarrier": T-Mobile,
  "deviceInfo": null,
  "deviceModel": iPhone X,
  "deviceType": iPhone,
  "eventId": eventId0001,
  "eventName": checkout,
  "eventSourceUrl": https://www.my-clothing-shop.org/,
  "eventTime": 1451431341,
  "language": en,
  "optOut": false,
  "osVersion": 12.1.4,
  "partnerName": ss-partnername,
  "userData": null,
  "wifi": false,
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


