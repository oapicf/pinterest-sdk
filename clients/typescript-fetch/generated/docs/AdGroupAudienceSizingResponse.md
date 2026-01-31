
# AdGroupAudienceSizingResponse


## Properties

Name | Type
------------ | -------------
`audienceSizeLowerBound` | number
`audienceSizeUpperBound` | number

## Example

```typescript
import type { AdGroupAudienceSizingResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "audienceSizeLowerBound": 100000,
  "audienceSizeUpperBound": 150000,
} satisfies AdGroupAudienceSizingResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AdGroupAudienceSizingResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


