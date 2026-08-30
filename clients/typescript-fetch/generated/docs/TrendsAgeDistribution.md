
# TrendsAgeDistribution

This represents a mapping from age bucket to distribution of search volume for a keyword. The sum of all values in this object should approximately be 1.

## Properties

Name | Type
------------ | -------------
`ageDistribution` | [TrendsAgeBucket](TrendsAgeBucket.md)

## Example

```typescript
import type { TrendsAgeDistribution } from ''

// TODO: Update the object below with actual values
const example = {
  "ageDistribution": null,
} satisfies TrendsAgeDistribution

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as TrendsAgeDistribution
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


