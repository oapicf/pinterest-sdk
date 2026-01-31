
# UserWebsiteVerificationCode


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
import type { UserWebsiteVerificationCode } from ''

// TODO: Update the object below with actual values
const example = {
  "dnsTxtRecord": pinterest-site-verification=e1edcc1a43976c646367e9c6c9a9b7b6,
  "fileContent": null,
  "filename": pinterest-e1edc.html,
  "metatag": <meta name="p:domain_verify" content="e1edcc1a43976c646367e9c6c9a9b7b6"/>,
  "verificationCode": e1edcc1a43976c646367e9c6c9a9b7b6,
} satisfies UserWebsiteVerificationCode

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as UserWebsiteVerificationCode
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


