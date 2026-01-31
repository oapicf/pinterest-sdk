
# ConversionEventDeviceInfo

Object containing information about the device where event occurred.

## Properties

Name | Type
------------ | -------------
`batteryLevel` | number
`brand` | string
`carrier` | string
`cpuCores` | number
`externalStorageFreeSpace` | number
`externalStorageSize` | number
`formFactor` | string
`kernelVersion` | string
`languages` | Array&lt;string&gt;
`locale` | string
`model` | string
`networkType` | string
`osFamily` | string
`osName` | string
`osReleaseName` | string
`osVersion` | string
`screenDensity` | number
`screenHeight` | number
`screenWidth` | number
`storageFreeSpace` | number
`storageSize` | number
`timezone` | string
`timezoneAbbr` | string
`type` | string

## Example

```typescript
import type { ConversionEventDeviceInfo } from ''

// TODO: Update the object below with actual values
const example = {
  "batteryLevel": 78,
  "brand": Apple, Samsung, Motorola,
  "carrier": T-Mobile,
  "cpuCores": 8,
  "externalStorageFreeSpace": 126,
  "externalStorageSize": 512,
  "formFactor": cellphone,
  "kernelVersion": 6.15,
  "languages": ["en","de","lt"],
  "locale": en-us,
  "model": 16 Pro, Galaxy S25 Ultra,
  "networkType": wifi,
  "osFamily": ios,
  "osName": 10,
  "osReleaseName": 18.3,
  "osVersion": 18.3,
  "screenDensity": 460,
  "screenHeight": 2868,
  "screenWidth": 1320,
  "storageFreeSpace": 184,
  "storageSize": 256,
  "timezone": USA/New York,
  "timezoneAbbr": PDT,
  "type": iPhone, Android,
} satisfies ConversionEventDeviceInfo

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ConversionEventDeviceInfo
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


