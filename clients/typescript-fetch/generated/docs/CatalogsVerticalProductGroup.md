
# CatalogsVerticalProductGroup


## Properties

Name | Type
------------ | -------------
`catalogId` | string
`catalogType` | string
`country` | string
`createdAt` | number
`description` | string
`feedId` | string
`filters` | [CatalogsCreativeAssetsProductGroupFilters](CatalogsCreativeAssetsProductGroupFilters.md)
`id` | string
`isFeatured` | boolean
`locale` | string
`name` | string
`status` | [CatalogsProductGroupStatus](CatalogsProductGroupStatus.md)
`type` | [CatalogsHotelProductGroupType](CatalogsHotelProductGroupType.md)
`updatedAt` | number

## Example

```typescript
import type { CatalogsVerticalProductGroup } from ''

// TODO: Update the object below with actual values
const example = {
  "catalogId": null,
  "catalogType": null,
  "country": null,
  "createdAt": 1621350033000,
  "description": null,
  "feedId": 2680059592705,
  "filters": null,
  "id": 443727193917,
  "isFeatured": null,
  "locale": null,
  "name": Most Popular,
  "status": null,
  "type": null,
  "updatedAt": 1622742155000,
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


