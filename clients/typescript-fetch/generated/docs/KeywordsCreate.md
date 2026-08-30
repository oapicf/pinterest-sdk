
# KeywordsCreate

Resource create operation model.

## Properties

Name | Type
------------ | -------------
`keywords` | [Array&lt;KeywordCreateItem&gt;](KeywordCreateItem.md)
`parentId` | string

## Example

```typescript
import type { KeywordsCreate } from ''

// TODO: Update the object below with actual values
const example = {
  "keywords": null,
  "parentId": null,
} satisfies KeywordsCreate

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as KeywordsCreate
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


