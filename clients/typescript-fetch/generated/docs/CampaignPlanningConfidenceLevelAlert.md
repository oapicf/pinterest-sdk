
# CampaignPlanningConfidenceLevelAlert

A confidence level alert for the delivery estimates provided in the response.

## Properties

Name | Type
------------ | -------------
`description` | string
`reason` | [CampaignPlanningConfidenceLevelAlertReason](CampaignPlanningConfidenceLevelAlertReason.md)
`severity` | [CampaignPlanningConfidenceLevelAlertSeverity](CampaignPlanningConfidenceLevelAlertSeverity.md)

## Example

```typescript
import type { CampaignPlanningConfidenceLevelAlert } from ''

// TODO: Update the object below with actual values
const example = {
  "description": null,
  "reason": null,
  "severity": null,
} satisfies CampaignPlanningConfidenceLevelAlert

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CampaignPlanningConfidenceLevelAlert
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


