
# AudienceDefinition

Queryable audience representation.

## Properties

Name | Type
------------ | -------------
`date` | string
`type` | string
`scope` | string

## Example

```typescript
import type { AudienceDefinition } from ''

// TODO: Update the object below with actual values
const example = {
  "date": 2022-10-09,
  "type": null,
  "scope": null,
} satisfies AudienceDefinition

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AudienceDefinition
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


