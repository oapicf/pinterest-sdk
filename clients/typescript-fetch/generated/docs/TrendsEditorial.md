
# TrendsEditorial

Information of the published editorial article.

## Properties

Name | Type
------------ | -------------
`boardUrl` | string
`description` | string
`interests` | Array&lt;string&gt;
`pinsUrl` | Array&lt;string&gt;
`relatedKeywords` | [Array&lt;KeywordInfo&gt;](KeywordInfo.md)
`title` | string

## Example

```typescript
import type { TrendsEditorial } from ''

// TODO: Update the object below with actual values
const example = {
  "boardUrl": null,
  "description": null,
  "interests": null,
  "pinsUrl": null,
  "relatedKeywords": null,
  "title": null,
} satisfies TrendsEditorial

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as TrendsEditorial
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


