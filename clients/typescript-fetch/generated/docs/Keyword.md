
# Keyword


## Properties

Name | Type
------------ | -------------
`archived` | boolean
`bid` | number
`id` | string
`matchType` | [MatchType](MatchType.md)
`parentId` | string
`parentType` | string
`type` | string
`value` | string

## Example

```typescript
import type { Keyword } from ''

// TODO: Update the object below with actual values
const example = {
  "archived": false,
  "bid": null,
  "id": 383791336903426391,
  "matchType": null,
  "parentId": 383791336903426391,
  "parentType": campaign,
  "type": keyword,
  "value": null,
} satisfies Keyword

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as Keyword
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


