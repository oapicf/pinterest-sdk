
# CatalogsProductGroupsCreateRequestSchema


## Properties

Name | Type
------------ | -------------
`description` | string
`feedId` | string
`filters` | [CatalogsProductGroupFiltersRequest](CatalogsProductGroupFiltersRequest.md)
`isFeatured` | boolean
`name` | string

## Example

```typescript
import type { CatalogsProductGroupsCreateRequestSchema } from ''

// TODO: Update the object below with actual values
const example = {
  "description": null,
  "feedId": 2680059592705,
  "filters": null,
  "isFeatured": null,
  "name": null,
} satisfies CatalogsProductGroupsCreateRequestSchema

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsProductGroupsCreateRequestSchema
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


