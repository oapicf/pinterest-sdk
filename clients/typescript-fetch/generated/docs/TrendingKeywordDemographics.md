
# TrendingKeywordDemographics

A mapping of demographic dimensions (e.g. \"gender\", \"age\") to their category distributions. For each dimension: Key: The category (e.g., \"female\", \"18-24\"). Value: The proportion of search volume (e.g., 0.12 for 12%). Values less than 0.05 are set to 0.04 for privacy. The sum for all categories in a dimension will approximately equal 1. Only applicable when `include_demographics` query parameter is set to `true`.

## Properties

Name | Type
------------ | -------------
`ageDistribution` | [TrendsAgeDistribution](TrendsAgeDistribution.md)
`genderDistribution` | [TrendsGenderDistribution](TrendsGenderDistribution.md)

## Example

```typescript
import type { TrendingKeywordDemographics } from ''

// TODO: Update the object below with actual values
const example = {
  "ageDistribution": null,
  "genderDistribution": null,
} satisfies TrendingKeywordDemographics

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as TrendingKeywordDemographics
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


