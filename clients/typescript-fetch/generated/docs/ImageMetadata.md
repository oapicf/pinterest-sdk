
# ImageMetadata


## Properties

Name | Type
------------ | -------------
`itemType` | string
`title` | string
`description` | string
`link` | string
`images` | [ImageMetadataImages](ImageMetadataImages.md)

## Example

```typescript
import type { ImageMetadata } from ''

// TODO: Update the object below with actual values
const example = {
  "itemType": null,
  "title": null,
  "description": null,
  "link": null,
  "images": null,
} satisfies ImageMetadata

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ImageMetadata
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


