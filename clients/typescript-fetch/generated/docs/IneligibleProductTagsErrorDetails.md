
# IneligibleProductTagsErrorDetails

Details about ineligible product tags in the request.

## Properties

Name | Type
------------ | -------------
`productTags` | [Array&lt;IneligibleProductTagErrorItem&gt;](IneligibleProductTagErrorItem.md)

## Example

```typescript
import type { IneligibleProductTagsErrorDetails } from ''

// TODO: Update the object below with actual values
const example = {
  "productTags": null,
} satisfies IneligibleProductTagsErrorDetails

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as IneligibleProductTagsErrorDetails
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


