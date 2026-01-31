
# UserWebsiteVerifyRequest

User website verification request

## Properties

Name | Type
------------ | -------------
`verificationMethod` | string
`website` | string

## Example

```typescript
import type { UserWebsiteVerifyRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "verificationMethod": null,
  "website": pintest-website-12345678.test/test_1,
} satisfies UserWebsiteVerifyRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as UserWebsiteVerifyRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


