
# CatalogsHotelProductGroup


## Properties

Name | Type
------------ | -------------
`catalogId` | string
`catalogType` | string
`createdAt` | number
`description` | string
`filters` | [CatalogsHotelProductGroupFilters](CatalogsHotelProductGroupFilters.md)
`id` | string
`name` | string
`type` | [CatalogsHotelProductGroupType](CatalogsHotelProductGroupType.md)
`updatedAt` | number

## Example

```typescript
import type { CatalogsHotelProductGroup } from ''

// TODO: Update the object below with actual values
const example = {
  "catalogId": null,
  "catalogType": null,
  "createdAt": 1621350033000,
  "description": null,
  "filters": null,
  "id": 443727193917,
  "name": Most Popular,
  "type": null,
  "updatedAt": 1622742155000,
} satisfies CatalogsHotelProductGroup

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsHotelProductGroup
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


