
# AudienceCategory


## Properties

Name | Type
------------ | -------------
`key` | string
`name` | string
`ratio` | number
`index` | number
`id` | string
`subcategories` | [Array&lt;AudienceSubcategory&gt;](AudienceSubcategory.md)

## Example

```typescript
import type { AudienceCategory } from ''

// TODO: Update the object below with actual values
const example = {
  "key": 1234567,
  "name": travel,
  "ratio": 0.551,
  "index": 1.2,
  "id": 1234567,
  "subcategories": null,
} satisfies AudienceCategory

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AudienceCategory
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


