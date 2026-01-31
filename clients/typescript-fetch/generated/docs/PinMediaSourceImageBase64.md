
# PinMediaSourceImageBase64

Image Base64-based media source.

## Properties

Name | Type
------------ | -------------
`contentType` | [ContentType](ContentType.md)
`data` | string
`isStandard` | boolean
`sourceType` | string

## Example

```typescript
import type { PinMediaSourceImageBase64 } from ''

// TODO: Update the object below with actual values
const example = {
  "contentType": null,
  "data": null,
  "isStandard": null,
  "sourceType": null,
} satisfies PinMediaSourceImageBase64

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as PinMediaSourceImageBase64
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


