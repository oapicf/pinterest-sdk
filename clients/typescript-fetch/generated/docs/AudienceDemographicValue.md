
# AudienceDemographicValue

Demographic detail for a single audience demographic

## Properties

Name | Type
------------ | -------------
`key` | string
`name` | string
`ratio` | number

## Example

```typescript
import type { AudienceDemographicValue } from ''

// TODO: Update the object below with actual values
const example = {
  "key": us,
  "name": United States,
  "ratio": 0.551,
} satisfies AudienceDemographicValue

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AudienceDemographicValue
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


