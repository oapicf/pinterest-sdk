
# BusinessAccessUserSummary

Metadata of the member/partner that has access to the asset.

## Properties

Name | Type
------------ | -------------
`email` | string
`id` | string
`username` | string

## Example

```typescript
import type { BusinessAccessUserSummary } from ''

// TODO: Update the object below with actual values
const example = {
  "email": business0101@business.com,
  "id": 383791336903426391,
  "username": business0101,
} satisfies BusinessAccessUserSummary

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as BusinessAccessUserSummary
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


