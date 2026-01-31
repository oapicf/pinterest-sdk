
# AudienceInsightsResponse

Audience interests and demographics.

## Properties

Name | Type
------------ | -------------
`categories` | [Array&lt;AudienceCategory&gt;](AudienceCategory.md)
`demographics` | [AudienceDemographics](AudienceDemographics.md)
`type` | [AudienceInsightType](AudienceInsightType.md)
`date` | string
`size` | number
`sizeIsUpperBound` | boolean

## Example

```typescript
import type { AudienceInsightsResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "categories": null,
  "demographics": null,
  "type": null,
  "date": 2022-10-09,
  "size": 10000,
  "sizeIsUpperBound": true,
} satisfies AudienceInsightsResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AudienceInsightsResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


