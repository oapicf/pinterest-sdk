
# CatalogsRetailReportAllItemsFilter

ALL_ITEMS filter for retail catalogs. Optional product_group_id scopes the report to items in that product group. If omitted, all items are included.

## Properties

Name | Type
------------ | -------------
`catalogId` | string
`productGroupId` | string
`reportType` | string

## Example

```typescript
import type { CatalogsRetailReportAllItemsFilter } from ''

// TODO: Update the object below with actual values
const example = {
  "catalogId": null,
  "productGroupId": null,
  "reportType": null,
} satisfies CatalogsRetailReportAllItemsFilter

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsRetailReportAllItemsFilter
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


