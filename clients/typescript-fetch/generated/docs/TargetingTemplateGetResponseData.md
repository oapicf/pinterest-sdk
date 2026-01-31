
# TargetingTemplateGetResponseData


## Properties

Name | Type
------------ | -------------
`name` | string
`autoTargetingEnabled` | boolean
`targetingAttributes` | [TargetingSpec](TargetingSpec.md)
`placementGroup` | [PlacementGroupType](PlacementGroupType.md)
`keywords` | [Array&lt;TargetingTemplateKeyword&gt;](TargetingTemplateKeyword.md)
`trackingUrls` | [TrackingUrls](TrackingUrls.md)
`id` | string
`createdTime` | number
`updatedTime` | number
`adAccountId` | string
`status` | string
`sizing` | [TargetingTemplateAudienceSizing](TargetingTemplateAudienceSizing.md)
`valid` | boolean

## Example

```typescript
import type { TargetingTemplateGetResponseData } from ''

// TODO: Update the object below with actual values
const example = {
  "name": Gaming,
  "autoTargetingEnabled": null,
  "targetingAttributes": null,
  "placementGroup": null,
  "keywords": [{value=cats, match_type=EXACT_NEGATIVE}],
  "trackingUrls": null,
  "id": 643,
  "createdTime": 1432744744,
  "updatedTime": 1432744744,
  "adAccountId": 549755885175,
  "status": ACTIVE,
  "sizing": null,
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


