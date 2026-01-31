
# ConversionEventsUserDataAnyOf1


## Properties

Name | Type
------------ | -------------
`em` | Array&lt;string&gt;
`hashedMaids` | Array&lt;string&gt;
`clientIpAddress` | string
`clientUserAgent` | string

## Example

```typescript
import type { ConversionEventsUserDataAnyOf1 } from ''

// TODO: Update the object below with actual values
const example = {
  "em": ["411e44ce1261728ffd2c0686e44e3fffe413c0e2c5adc498bc7da883d476b9c8","09831ea51bd1b7b32a836683a00a9ccaf3d05f59499f42d9883412ed79289969"],
  "hashedMaids": ["0192518eb84137ccfe82c8b6322d29631dae7e28ed9d0f6dd5f245d73a58c5f1","837b850ac46d62b2272a71de73c27801ff011ac1e36c5432620c8755cf90db46"],
  "clientIpAddress": 216.3.128.12,
  "clientUserAgent": Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/67.0.3396.87 Safari/537.36,
} satisfies ConversionEventsUserDataAnyOf1

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ConversionEventsUserDataAnyOf1
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


