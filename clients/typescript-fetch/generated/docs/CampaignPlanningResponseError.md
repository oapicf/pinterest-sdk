
# CampaignPlanningResponseError

Error encountered while estimating delivery for a campaign.

## Properties

Name | Type
------------ | -------------
`code` | [CampaignPlanningResponseErrorCode](CampaignPlanningResponseErrorCode.md)
`message` | string

## Example

```typescript
import type { CampaignPlanningResponseError } from ''

// TODO: Update the object below with actual values
const example = {
  "code": null,
  "message": null,
} satisfies CampaignPlanningResponseError

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CampaignPlanningResponseError
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


