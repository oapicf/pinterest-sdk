
# TargetingTemplateGetResponseData


## Properties

Name | Type
------------ | -------------
`autoTargetingEnabled` | boolean
`keywords` | [Array&lt;TargetingTemplateKeyword&gt;](TargetingTemplateKeyword.md)
`name` | string
`placementGroup` | [PlacementGroupType](PlacementGroupType.md)
`targetingAttributes` | [TargetingSpec](TargetingSpec.md)
`trackingUrls` | [TrackingUrls](TrackingUrls.md)
`adAccountId` | string
`createdTime` | number
`id` | string
`sizing` | [TargetingTemplateAudienceSizing](TargetingTemplateAudienceSizing.md)
`status` | string
`updatedTime` | number
`valid` | boolean

## Example

```typescript
import type { TargetingTemplateGetResponseData } from ''

// TODO: Update the object below with actual values
const example = {
  "autoTargetingEnabled": null,
  "keywords": [{value=cats, match_type=EXACT_NEGATIVE}],
  "name": Gaming,
  "placementGroup": null,
  "targetingAttributes": null,
  "trackingUrls": null,
  "adAccountId": 549755885175,
  "createdTime": 1432744744,
  "id": 643,
  "sizing": null,
  "status": ACTIVE,
  "updatedTime": 1432744744,
  "valid": true,
} satisfies TargetingTemplateGetResponseData

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as TargetingTemplateGetResponseData
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


