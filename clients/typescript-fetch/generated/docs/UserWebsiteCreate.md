
# UserWebsiteCreate

Resource create operation model.

## Properties

Name | Type
------------ | -------------
`verificationMethod` | [WebsiteVerificationMethod](WebsiteVerificationMethod.md)
`website` | string

## Example

```typescript
import type { UserWebsiteCreate } from ''

// TODO: Update the object below with actual values
const example = {
  "verificationMethod": null,
  "website": null,
} satisfies UserWebsiteCreate

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as UserWebsiteCreate
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


