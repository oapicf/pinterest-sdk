
# CatalogsItemsFilters


## Properties

Name | Type
------------ | -------------
`catalogType` | [CatalogsType](CatalogsType.md)
`itemIds` | Array&lt;string&gt;
`catalogId` | string
`hotelIds` | Array&lt;string&gt;
`creativeAssetsIds` | Array&lt;string&gt;

## Example

```typescript
import type { CatalogsItemsFilters } from ''

// TODO: Update the object below with actual values
const example = {
  "catalogType": null,
  "itemIds": null,
  "catalogId": null,
  "hotelIds": null,
  "creativeAssetsIds": null,
} satisfies CatalogsItemsFilters

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsItemsFilters
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


