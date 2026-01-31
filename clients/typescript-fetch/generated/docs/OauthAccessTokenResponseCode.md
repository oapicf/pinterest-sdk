
# OauthAccessTokenResponseCode


## Properties

Name | Type
------------ | -------------
`refreshToken` | string
`refreshTokenExpiresIn` | number
`responseType` | string
`accessToken` | string
`tokenType` | string
`expiresIn` | number
`scope` | string

## Example

```typescript
import type { OauthAccessTokenResponseCode } from ''

// TODO: Update the object below with actual values
const example = {
  "refreshToken": null,
  "refreshTokenExpiresIn": null,
  "responseType": null,
  "accessToken": null,
  "tokenType": null,
  "expiresIn": null,
  "scope": null,
} satisfies OauthAccessTokenResponseCode

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as OauthAccessTokenResponseCode
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


