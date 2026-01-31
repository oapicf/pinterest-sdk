
# FeaturedTrend

Featured trending topics for a specific interest and market

## Properties

Name | Type
------------ | -------------
`interest` | [InterestsEnum](InterestsEnum.md)
`market` | [ProductCategoryRegion](ProductCategoryRegion.md)
`trends` | [Array&lt;TrendingTopic&gt;](TrendingTopic.md)

## Example

```typescript
import type { FeaturedTrend } from ''

// TODO: Update the object below with actual values
const example = {
  "interest": null,
  "market": null,
  "trends": null,
} satisfies FeaturedTrend

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as FeaturedTrend
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


