
# AdPreviewShopping


## Properties

Name | Type
------------ | -------------
`catalogProductGroupId` | string
`creativeType` | string
`customizableCtaType` | [CustomizableCTAType](CustomizableCTAType.md)
`heroImageTitle` | string
`heroImageUrl` | string
`heroPinId` | string
`imageTag` | string
`itemId` | string
`preferredMediaType` | string
`videoTag` | string

## Example

```typescript
import type { AdPreviewShopping } from ''

// TODO: Update the object below with actual values
const example = {
  "catalogProductGroupId": 123456789,
  "creativeType": SHOPPING,
  "customizableCtaType": null,
  "heroImageTitle": My Preview Image,
  "heroImageUrl": https://somewebsite.com/someimage.jpg,
  "heroPinId": 987654321,
  "imageTag": Christmas Sale,
  "itemId": 111111111,
  "preferredMediaType": IMAGE,
  "videoTag": Black Friday Sale,
} satisfies AdPreviewShopping

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AdPreviewShopping
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


