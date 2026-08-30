
# VideoMetadataWithItemType


## Properties

Name | Type
------------ | -------------
`coverImageUrl` | string
`duration` | number
`height` | number
`itemType` | string
`videoUrl` | string
`videoUrlHls` | string
`width` | number

## Example

```typescript
import type { VideoMetadataWithItemType } from ''

// TODO: Update the object below with actual values
const example = {
  "coverImageUrl": null,
  "duration": null,
  "height": null,
  "itemType": null,
  "videoUrl": null,
  "videoUrlHls": null,
  "width": null,
} satisfies VideoMetadataWithItemType

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as VideoMetadataWithItemType
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


