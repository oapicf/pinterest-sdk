
# TargetingTemplate


## Properties

Name | Type
------------ | -------------
`adAccountId` | string
`autoTargetingEnabled` | boolean
`createdTime` | number
`id` | string
`keywords` | [Array&lt;TargetingTemplateKeyword&gt;](TargetingTemplateKeyword.md)
`name` | string
`placementGroup` | [PlacementGroupType](PlacementGroupType.md)
`sizing` | [TargetingTemplateAudienceSizing](TargetingTemplateAudienceSizing.md)
`status` | [TargetingTemplateStatus](TargetingTemplateStatus.md)
`targetingAttributes` | [TargetingSpecOptimal](TargetingSpecOptimal.md)
`trackingUrls` | [TrackingUrls](TrackingUrls.md)
`updatedTime` | number
`valid` | boolean

## Example

```typescript
import type { TargetingTemplate } from ''

// TODO: Update the object below with actual values
const example = {
  "adAccountId": null,
  "autoTargetingEnabled": null,
  "createdTime": null,
  "id": null,
  "keywords": null,
  "name": null,
  "placementGroup": null,
  "sizing": null,
  "status": null,
  "targetingAttributes": null,
  "trackingUrls": null,
  "updatedTime": null,
  "valid": null,
} satisfies TargetingTemplate

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as TargetingTemplate
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


