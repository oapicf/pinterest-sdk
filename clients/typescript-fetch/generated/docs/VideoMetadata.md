
# VideoMetadata


## Properties

Name | Type
------------ | -------------
`itemType` | string
`coverImageUrl` | string
`videoUrl` | string
`duration` | number
`height` | number
`width` | number

## Example

```typescript
import type { VideoMetadata } from ''

// TODO: Update the object below with actual values
const example = {
  "itemType": null,
  "coverImageUrl": null,
  "videoUrl": null,
  "duration": null,
  "height": null,
  "width": null,
} satisfies VideoMetadata

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as VideoMetadata
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


