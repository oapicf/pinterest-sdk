
# ImageMetadata


## Properties

Name | Type
------------ | -------------
`description` | string
`images` | [ImageSize](ImageSize.md)
`itemType` | string
`link` | string
`title` | string

## Example

```typescript
import type { ImageMetadata } from ''

// TODO: Update the object below with actual values
const example = {
  "description": null,
  "images": null,
  "itemType": null,
  "link": null,
  "title": null,
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


