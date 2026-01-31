
# TargetingTemplateCreate


## Properties

Name | Type
------------ | -------------
`autoTargetingEnabled` | boolean
`keywords` | [Array&lt;TargetingTemplateKeyword&gt;](TargetingTemplateKeyword.md)
`name` | string
`placementGroup` | [PlacementGroupType](PlacementGroupType.md)
`targetingAttributes` | [TargetingSpec](TargetingSpec.md)
`trackingUrls` | [TrackingUrls](TrackingUrls.md)

## Example

```typescript
import type { TargetingTemplateCreate } from ''

// TODO: Update the object below with actual values
const example = {
  "autoTargetingEnabled": null,
  "keywords": [{value=cats, match_type=EXACT_NEGATIVE}],
  "name": Gaming,
  "placementGroup": null,
  "targetingAttributes": null,
  "trackingUrls": null,
} satisfies TargetingTemplateCreate

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as TargetingTemplateCreate
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


