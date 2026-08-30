
# TargetingTemplateAudienceSizing

Gets an audience size estimate for a set of given targeting spec data. **Returns:** An object containing an audience size estimate that has a reach estimate (number of unique users) against the given targeting template. This by default provides a monthly estimate.

## Properties

Name | Type
------------ | -------------
`reachEstimate` | [TargetingTemplateAudienceSizingReachEstimate](TargetingTemplateAudienceSizingReachEstimate.md)

## Example

```typescript
import type { TargetingTemplateAudienceSizing } from ''

// TODO: Update the object below with actual values
const example = {
  "reachEstimate": null,
} satisfies TargetingTemplateAudienceSizing

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as TargetingTemplateAudienceSizing
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


