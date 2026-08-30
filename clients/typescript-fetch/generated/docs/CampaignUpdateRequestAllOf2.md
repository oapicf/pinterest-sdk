
# CampaignUpdateRequestAllOf2


## Properties

Name | Type
------------ | -------------
`bidOptions` | [CampaignBidOptionsUpdate](CampaignBidOptionsUpdate.md)
`intendedPromotionType` | [IntendedPromotionType](IntendedPromotionType.md)
`isLtvOptimized` | boolean
`isPerformancePlus` | boolean
`isTopOfSearch` | boolean
`objectiveType` | [ObjectiveType](ObjectiveType.md)

## Example

```typescript
import type { CampaignUpdateRequestAllOf2 } from ''

// TODO: Update the object below with actual values
const example = {
  "bidOptions": null,
  "intendedPromotionType": null,
  "isLtvOptimized": null,
  "isPerformancePlus": null,
  "isTopOfSearch": null,
  "objectiveType": null,
} satisfies CampaignUpdateRequestAllOf2

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CampaignUpdateRequestAllOf2
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


