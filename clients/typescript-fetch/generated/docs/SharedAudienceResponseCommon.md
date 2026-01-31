
# SharedAudienceResponseCommon


## Properties

Name | Type
------------ | -------------
`audienceId` | string
`permissions` | [Array&lt;Role&gt;](Role.md)

## Example

```typescript
import type { SharedAudienceResponseCommon } from ''

// TODO: Update the object below with actual values
const example = {
  "audienceId": 2542621871096,
  "permissions": ["RESOURCE_PINNER_LIST_READER","RESOURCE_PINNER_LIST_OWNER"],
} satisfies SharedAudienceResponseCommon

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as SharedAudienceResponseCommon
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


