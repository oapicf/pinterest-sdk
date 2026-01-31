
# BusinessSharedAudienceResponse


## Properties

Name | Type
------------ | -------------
`audienceId` | string
`permissions` | [Array&lt;Role&gt;](Role.md)
`recipientBusinessIds` | Array&lt;string&gt;

## Example

```typescript
import type { BusinessSharedAudienceResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "audienceId": 2542621871096,
  "permissions": [RESOURCE_PINNER_LIST_READER, RESOURCE_PINNER_LIST_OWNER],
  "recipientBusinessIds": ["549755885175"],
} satisfies BusinessSharedAudienceResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as BusinessSharedAudienceResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


