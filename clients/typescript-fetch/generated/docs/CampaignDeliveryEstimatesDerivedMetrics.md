
# CampaignDeliveryEstimatesDerivedMetrics

Derived metrics for an ad campaign.

## Properties

Name | Type
------------ | -------------
`cpc` | number
`cpcLower` | number
`cpcUpper` | number
`cpm` | number
`cpmLower` | number
`cpmUpper` | number
`lifetimeFrequency` | number
`lifetimeFrequencyLower` | number
`lifetimeFrequencyUpper` | number
`lifetimeImpression` | number
`lifetimeImpressionLower` | number
`lifetimeImpressionUpper` | number
`lifetimeReach` | number
`lifetimeReachLower` | number
`lifetimeReachUpper` | number
`weeklyClick` | number
`weeklyClickLower` | number
`weeklyClickUpper` | number
`weeklyFrequency` | number
`weeklyFrequencyLower` | number
`weeklyFrequencyUpper` | number
`weeklyImpression` | number
`weeklyImpressionLower` | number
`weeklyImpressionUpper` | number
`weeklyReach` | number
`weeklyReachLower` | number
`weeklyReachUpper` | number

## Example

```typescript
import type { CampaignDeliveryEstimatesDerivedMetrics } from ''

// TODO: Update the object below with actual values
const example = {
  "cpc": 0.56,
  "cpcLower": 0.47,
  "cpcUpper": 0.65,
  "cpm": 10,
  "cpmLower": 8,
  "cpmUpper": 12,
  "lifetimeFrequency": null,
  "lifetimeFrequencyLower": null,
  "lifetimeFrequencyUpper": null,
  "lifetimeImpression": null,
  "lifetimeImpressionLower": null,
  "lifetimeImpressionUpper": null,
  "lifetimeReach": null,
  "lifetimeReachLower": null,
  "lifetimeReachUpper": null,
  "weeklyClick": 1000,
  "weeklyClickLower": 800,
  "weeklyClickUpper": 1200,
  "weeklyFrequency": 3,
  "weeklyFrequencyLower": 2.5,
  "weeklyFrequencyUpper": 3.5,
  "weeklyImpression": 400000,
  "weeklyImpressionLower": 350000,
  "weeklyImpressionUpper": 450000,
  "weeklyReach": 102074.85050444445,
  "weeklyReachLower": 90000,
  "weeklyReachUpper": 150000,
} satisfies CampaignDeliveryEstimatesDerivedMetrics

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CampaignDeliveryEstimatesDerivedMetrics
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


