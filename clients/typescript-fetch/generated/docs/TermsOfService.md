
# TermsOfService


## Properties

Name | Type
------------ | -------------
`id` | string
`html` | string
`hasAccepted` | boolean
`adAccountId` | string

## Example

```typescript
import type { TermsOfService } from ''

// TODO: Update the object below with actual values
const example = {
  "id": 2650449554526,
  "html": example test,
  "hasAccepted": true,
  "adAccountId": 549755885175,
} satisfies TermsOfService

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as TermsOfService
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


