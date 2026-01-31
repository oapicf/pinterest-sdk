
# AudienceDefinition

Queryable audience representation.

## Properties

Name | Type
------------ | -------------
`date` | string
`scope` | string
`type` | string

## Example

```typescript
import type { AudienceDefinition } from ''

// TODO: Update the object below with actual values
const example = {
  "date": 2022-10-09,
  "scope": PARTNER,
  "type": IMPRESSION_PLUS_ENGAGEMENT,
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


