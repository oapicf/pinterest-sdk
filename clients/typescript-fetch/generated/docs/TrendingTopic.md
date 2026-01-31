
# TrendingTopic

Individual trending topic within an interest category

## Properties

Name | Type
------------ | -------------
`description` | string
`percentGrowthMom` | number
`pins` | [Array&lt;TrendingPin&gt;](TrendingPin.md)
`relatedInterests` | Array&lt;string&gt;
`relatedSearches` | Array&lt;string&gt;
`timeSeries` | { [key: string]: number; }
`title` | string

## Example

```typescript
import type { TrendingTopic } from ''

// TODO: Update the object below with actual values
const example = {
  "description": null,
  "percentGrowthMom": null,
  "pins": null,
  "relatedInterests": null,
  "relatedSearches": null,
  "timeSeries": null,
  "title": null,
} satisfies TrendingTopic

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as TrendingTopic
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


