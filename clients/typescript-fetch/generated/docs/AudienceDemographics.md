
# AudienceDemographics

Audience demographics

## Properties

Name | Type
------------ | -------------
`ages` | [Array&lt;AudienceDemographicValue&gt;](AudienceDemographicValue.md)
`genders` | [Array&lt;AudienceDemographicValue&gt;](AudienceDemographicValue.md)
`devices` | [Array&lt;AudienceDemographicValue&gt;](AudienceDemographicValue.md)
`metros` | [Array&lt;AudienceDemographicValue&gt;](AudienceDemographicValue.md)
`countries` | [Array&lt;AudienceDemographicValue&gt;](AudienceDemographicValue.md)

## Example

```typescript
import type { AudienceDemographics } from ''

// TODO: Update the object below with actual values
const example = {
  "ages": null,
  "genders": null,
  "devices": null,
  "metros": null,
  "countries": null,
} satisfies AudienceDemographics

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AudienceDemographics
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


