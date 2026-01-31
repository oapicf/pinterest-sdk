
# CatalogsVerticalProductGroup


## Properties

Name | Type
------------ | -------------
`catalogType` | string
`id` | string
`name` | string
`description` | string
`filters` | [CatalogsCreativeAssetsProductGroupFilters](CatalogsCreativeAssetsProductGroupFilters.md)
`isFeatured` | boolean
`type` | [CatalogsProductGroupType](CatalogsProductGroupType.md)
`status` | [CatalogsProductGroupStatus](CatalogsProductGroupStatus.md)
`createdAt` | number
`updatedAt` | number
`catalogId` | string
`feedId` | string
`country` | string
`locale` | string

## Example

```typescript
import type { CatalogsVerticalProductGroup } from ''

// TODO: Update the object below with actual values
const example = {
  "catalogType": null,
  "id": 443727193917,
  "name": Most Popular,
  "description": null,
  "filters": null,
  "isFeatured": null,
  "type": null,
  "status": null,
  "createdAt": 1621350033000,
  "updatedAt": 1622742155000,
  "catalogId": null,
  "feedId": 2680059592705,
  "country": null,
  "locale": null,
} satisfies CatalogsVerticalProductGroup

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsVerticalProductGroup
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


