
# UserWebsiteVerificationCode


## Properties

Name | Type
------------ | -------------
`verificationCode` | string
`dnsTxtRecord` | string
`metatag` | string
`filename` | string
`fileContent` | string

## Example

```typescript
import type { UserWebsiteVerificationCode } from ''

// TODO: Update the object below with actual values
const example = {
  "verificationCode": e1edcc1a43976c646367e9c6c9a9b7b6,
  "dnsTxtRecord": pinterest-site-verification=e1edcc1a43976c646367e9c6c9a9b7b6,
  "metatag": <meta name="p:domain_verify" content="e1edcc1a43976c646367e9c6c9a9b7b6"/>,
  "filename": pinterest-e1edc.html,
  "fileContent": null,
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


