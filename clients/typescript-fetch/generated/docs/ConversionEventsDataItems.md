
# ConversionEventsDataItems


## Properties

Name | Type
------------ | -------------
`actionSource` | string
`appId` | string
`appInfo` | [ConversionEventAppInfo](ConversionEventAppInfo.md)
`appName` | string
`appVersion` | string
`customData` | [ConversionEventsDataItemsCustomData](ConversionEventsDataItemsCustomData.md)
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
`userData` | [ConversionEventsUserDataProperties](ConversionEventsUserDataProperties.md)
`wifi` | boolean

## Example

```typescript
import type { ConversionEventsDataItems } from ''

// TODO: Update the object below with actual values
const example = {
  "actionSource": null,
  "appId": null,
  "appInfo": null,
  "appName": null,
  "appVersion": null,
  "customData": null,
  "deviceBrand": null,
  "deviceCarrier": null,
  "deviceInfo": null,
  "deviceModel": null,
  "deviceType": null,
  "eventId": null,
  "eventName": null,
  "eventSourceUrl": null,
  "eventTime": null,
  "language": null,
  "optOut": null,
  "osVersion": null,
  "partnerName": null,
  "userData": null,
  "wifi": null,
} satisfies ConversionEventsDataItems

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ConversionEventsDataItems
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


