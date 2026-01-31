
# AdGroupAudienceSizingRequest


## Properties

Name | Type
------------ | -------------
`autoTargetingEnabled` | boolean
`placementGroup` | [PlacementGroupType](PlacementGroupType.md)
`creativeTypes` | Array&lt;string&gt;
`targetingSpec` | [TargetingSpec](TargetingSpec.md)
`productGroupIds` | Array&lt;string&gt;
`keywords` | [Array&lt;AdGroupAudienceSizingRequestKeywordsInner&gt;](AdGroupAudienceSizingRequestKeywordsInner.md)

## Example

```typescript
import type { AdGroupAudienceSizingRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "autoTargetingEnabled": true,
  "placementGroup": null,
  "creativeTypes": null,
  "targetingSpec": null,
  "productGroupIds": null,
  "keywords": null,
} satisfies AdGroupAudienceSizingRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AdGroupAudienceSizingRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


