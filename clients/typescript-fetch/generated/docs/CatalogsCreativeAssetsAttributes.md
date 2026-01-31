
# CatalogsCreativeAssetsAttributes


## Properties

Name | Type
------------ | -------------
`title` | string
`description` | string
`link` | string
`iosDeepLink` | string
`androidDeepLink` | string
`googleProductCategory` | string
`customLabel0` | string
`customLabel1` | string
`customLabel2` | string
`customLabel3` | string
`customLabel4` | string
`visibility` | string
`imageLink` | string
`videoLink` | string

## Example

```typescript
import type { CatalogsCreativeAssetsAttributes } from ''

// TODO: Update the object below with actual values
const example = {
  "title": null,
  "description": null,
  "link": null,
  "iosDeepLink": null,
  "androidDeepLink": null,
  "googleProductCategory": null,
  "customLabel0": null,
  "customLabel1": null,
  "customLabel2": null,
  "customLabel3": null,
  "customLabel4": null,
  "visibility": null,
  "imageLink": https://scene.example.com/image/image_v2.jpg,
  "videoLink": https://scene.example.com/image/image_v2.mp4,
} satisfies CatalogsCreativeAssetsAttributes

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsCreativeAssetsAttributes
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


