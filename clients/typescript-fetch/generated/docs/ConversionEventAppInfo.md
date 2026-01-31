
# ConversionEventAppInfo

Object containing information about the application where event occurred.

## Properties

Name | Type
------------ | -------------
`appId` | string
`appName` | string
`appPackageName` | string
`appStore` | string
`appVersion` | string
`installTime` | number
`userAgent` | string
`windowHeight` | number
`windowWidth` | number

## Example

```typescript
import type { ConversionEventAppInfo } from ''

// TODO: Update the object below with actual values
const example = {
  "appId": 429047995,
  "appName": MyAwesomeApp,
  "appPackageName": com.company.myawesomeapp,
  "appStore": Google Play Store,
  "appVersion": 7.9,
  "installTime": 1739222269,
  "userAgent": Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36,
  "windowHeight": 900,
  "windowWidth": 1678,
} satisfies ConversionEventAppInfo

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ConversionEventAppInfo
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


