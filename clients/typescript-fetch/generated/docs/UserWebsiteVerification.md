
# UserWebsiteVerification


## Properties

Name | Type
------------ | -------------
`dnsTxtRecord` | string
`fileContent` | string
`filename` | string
`metatag` | string
`verificationCode` | string

## Example

```typescript
import type { UserWebsiteVerification } from ''

// TODO: Update the object below with actual values
const example = {
  "dnsTxtRecord": null,
  "fileContent": null,
  "filename": null,
  "metatag": null,
  "verificationCode": null,
} satisfies UserWebsiteVerification

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as UserWebsiteVerification
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


