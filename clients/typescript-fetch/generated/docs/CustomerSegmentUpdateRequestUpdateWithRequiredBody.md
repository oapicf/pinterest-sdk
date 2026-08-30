
# CustomerSegmentUpdateRequestUpdateWithRequiredBody

Resource create or update operation model with required body fields (no OptionalProperties).

## Properties

Name | Type
------------ | -------------
`audienceIds` | Array&lt;string&gt;
`id` | string
`operationType` | [AudienceUpdateOperationType](AudienceUpdateOperationType.md)

## Example

```typescript
import type { CustomerSegmentUpdateRequestUpdateWithRequiredBody } from ''

// TODO: Update the object below with actual values
const example = {
  "audienceIds": null,
  "id": null,
  "operationType": null,
} satisfies CustomerSegmentUpdateRequestUpdateWithRequiredBody

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CustomerSegmentUpdateRequestUpdateWithRequiredBody
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


