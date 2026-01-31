
# TargetingTemplateUpdateRequest


## Properties

Name | Type
------------ | -------------
`id` | string
`operationType` | string
`targetingAttributes` | [TargetingSpec](TargetingSpec.md)

## Example

```typescript
import type { TargetingTemplateUpdateRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "id": 643,
  "operationType": null,
  "targetingAttributes": null,
} satisfies TargetingTemplateUpdateRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as TargetingTemplateUpdateRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


