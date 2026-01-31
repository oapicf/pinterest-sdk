
# CatalogsCreativeAssetsProductGroup


## Properties

Name | Type
------------ | -------------
`catalogType` | string
`id` | string
`name` | string
`description` | string
`filters` | [CatalogsCreativeAssetsProductGroupFilters](CatalogsCreativeAssetsProductGroupFilters.md)
`createdAt` | number
`updatedAt` | number
`catalogId` | string

## Example

```typescript
import type { CatalogsCreativeAssetsProductGroup } from ''

// TODO: Update the object below with actual values
const example = {
  "catalogType": null,
  "id": 443727193917,
  "name": Most Popular,
  "description": null,
  "filters": null,
  "createdAt": 1621350033000,
  "updatedAt": 1622742155000,
  "catalogId": null,
} satisfies CatalogsCreativeAssetsProductGroup

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsCreativeAssetsProductGroup
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


