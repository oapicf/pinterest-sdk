
# MultipleProductGroupsInner


## Properties

Name | Type
------------ | -------------
`name` | string
`description` | string
`isFeatured` | boolean
`filters` | [CatalogsProductGroupFiltersRequest](CatalogsProductGroupFiltersRequest.md)
`feedId` | string

## Example

```typescript
import type { MultipleProductGroupsInner } from ''

// TODO: Update the object below with actual values
const example = {
  "name": null,
  "description": null,
  "isFeatured": null,
  "filters": null,
  "feedId": 2680059592705,
} satisfies MultipleProductGroupsInner

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as MultipleProductGroupsInner
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


