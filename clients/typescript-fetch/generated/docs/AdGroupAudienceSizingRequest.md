
# AdGroupAudienceSizingRequest


## Properties

Name | Type
------------ | -------------
`autoTargetingEnabled` | boolean
`creativeTypes` | Array&lt;string&gt;
`keywords` | [Array&lt;AdGroupAudienceSizingRequestKeywordsInner&gt;](AdGroupAudienceSizingRequestKeywordsInner.md)
`placementGroup` | [PlacementGroupType](PlacementGroupType.md)
`productGroupIds` | Array&lt;string&gt;
`targetingSpec` | [TargetingSpec](TargetingSpec.md)

## Example

```typescript
import type { AdGroupAudienceSizingRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "autoTargetingEnabled": true,
  "creativeTypes": null,
  "keywords": null,
  "placementGroup": null,
  "productGroupIds": null,
  "targetingSpec": null,
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


