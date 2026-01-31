
# AdPreviewRequest


## Properties

Name | Type
------------ | -------------
`imageUrl` | string
`title` | string
`pinId` | string

## Example

```typescript
import type { AdPreviewRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "imageUrl": https://somewebsite.com/someimage.jpg,
  "title": My Preview Image,
  "pinId": 7389479023,
} satisfies AdPreviewRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AdPreviewRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


