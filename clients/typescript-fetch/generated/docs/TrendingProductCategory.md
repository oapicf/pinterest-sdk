
# TrendingProductCategory

Trending shopping product category

## Properties

Name | Type
------------ | -------------
`engagementType` | [ProductCategoriesEngagementType](ProductCategoriesEngagementType.md)
`pctChangeMom` | number
`percentRelativeVolume` | number
`productCategory` | string
`verticals` | [Array&lt;VerticalProductCategory&gt;](VerticalProductCategory.md)

## Example

```typescript
import type { TrendingProductCategory } from ''

// TODO: Update the object below with actual values
const example = {
  "engagementType": null,
  "pctChangeMom": null,
  "percentRelativeVolume": null,
  "productCategory": null,
  "verticals": null,
} satisfies TrendingProductCategory

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as TrendingProductCategory
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


