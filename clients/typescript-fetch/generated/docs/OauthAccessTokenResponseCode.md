
# OauthAccessTokenResponseCode


## Properties

Name | Type
------------ | -------------
`refreshToken` | string
`refreshTokenExpiresAt` | number
`refreshTokenExpiresIn` | number
`accessToken` | string
`expiresIn` | number
`responseType` | string
`scope` | string
`tokenType` | string

## Example

```typescript
import type { OauthAccessTokenResponseCode } from ''

// TODO: Update the object below with actual values
const example = {
  "refreshToken": null,
  "refreshTokenExpiresAt": null,
  "refreshTokenExpiresIn": null,
  "accessToken": null,
  "expiresIn": null,
  "responseType": null,
  "scope": null,
  "tokenType": null,
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


