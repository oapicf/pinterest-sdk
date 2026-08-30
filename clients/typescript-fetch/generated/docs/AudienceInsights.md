
# AudienceInsights

Audience interests and demographics.

## Properties

Name | Type
------------ | -------------
`categories` | [Array&lt;AudienceCategory&gt;](AudienceCategory.md)
`date` | string
`demographics` | [AudienceDemographics](AudienceDemographics.md)
`size` | number
`sizeIsUpperBound` | boolean
`type` | [AudienceInsightType](AudienceInsightType.md)

## Example

```typescript
import type { AudienceInsights } from ''

// TODO: Update the object below with actual values
const example = {
  "categories": null,
  "date": 2022-10-09,
  "demographics": null,
  "size": 10000,
  "sizeIsUpperBound": true,
  "type": null,
} satisfies AudienceInsights

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AudienceInsights
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


