
# ProductCategoryDetails

Product category details

## Properties

Name | Type
------------ | -------------
`demographics` | [ProductCategoriesDemographic](ProductCategoriesDemographic.md)
`hasPrediction` | boolean
`metricsHighlights` | [ProductCategoriesMetricsHighlights](ProductCategoriesMetricsHighlights.md)
`predictedTimeSeries` | { [key: string]: number; }
`productCategory` | [ProductCategoryEnum](ProductCategoryEnum.md)
`relatedSearches` | Array&lt;string&gt;
`timeSeries` | { [key: string]: number; }

## Example

```typescript
import type { ProductCategoryDetails } from ''

// TODO: Update the object below with actual values
const example = {
  "demographics": null,
  "hasPrediction": null,
  "metricsHighlights": null,
  "predictedTimeSeries": null,
  "productCategory": null,
  "relatedSearches": null,
  "timeSeries": null,
} satisfies ProductCategoryDetails

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ProductCategoryDetails
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


