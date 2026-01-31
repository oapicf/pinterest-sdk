
# SharedAudience


## Properties

Name | Type
------------ | -------------
`audienceId` | string
`operationType` | [OperationType](OperationType.md)
`recipientAccountIds` | Array&lt;string&gt;

## Example

```typescript
import type { SharedAudience } from ''

// TODO: Update the object below with actual values
const example = {
  "audienceId": 2542621871096,
  "operationType": null,
  "recipientAccountIds": null,
} satisfies SharedAudience

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as SharedAudience
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


