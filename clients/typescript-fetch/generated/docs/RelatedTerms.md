
# RelatedTerms


## Properties

Name | Type
------------ | -------------
`id` | string
`relatedTermCount` | number
`relatedTermsList` | [Array&lt;RelatedTermsRelatedTermsListInner&gt;](RelatedTermsRelatedTermsListInner.md)

## Example

```typescript
import type { RelatedTerms } from ''

// TODO: Update the object below with actual values
const example = {
  "id": clothes,
  "relatedTermCount": 2,
  "relatedTermsList": null,
} satisfies RelatedTerms

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as RelatedTerms
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


