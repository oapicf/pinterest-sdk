
# Keyword


## Properties

Name | Type
------------ | -------------
`bid` | number
`matchType` | [MatchTypeResponse](MatchTypeResponse.md)
`value` | string
`archived` | boolean
`id` | string
`parentId` | string
`parentType` | string
`type` | string

## Example

```typescript
import type { Keyword } from ''

// TODO: Update the object below with actual values
const example = {
  "bid": null,
  "matchType": null,
  "value": null,
  "archived": false,
  "id": 383791336903426391,
  "parentId": 383791336903426391,
  "parentType": campaign,
  "type": keyword,
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


