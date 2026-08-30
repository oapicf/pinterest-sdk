
# CatalogsAiContentDisclosure

AI content disclosure for a single asset of a catalog item.

## Properties

Name | Type
------------ | -------------
`disclosure` | [Array&lt;CatalogsAiContentDisclosureLabel&gt;](CatalogsAiContentDisclosureLabel.md)
`url` | string

## Example

```typescript
import type { CatalogsAiContentDisclosure } from ''

// TODO: Update the object below with actual values
const example = {
  "disclosure": ["ai_modified"],
  "url": https://scene.example.com/image/image_v2.jpg,
} satisfies CatalogsAiContentDisclosure

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsAiContentDisclosure
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


