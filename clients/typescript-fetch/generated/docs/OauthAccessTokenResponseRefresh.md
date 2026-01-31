
# OauthAccessTokenResponseRefresh

A successful OAuth access token response for the refresh token flow.

## Properties

Name | Type
------------ | -------------
`accessToken` | string
`expiresIn` | number
`responseType` | string
`scope` | string
`tokenType` | string
`refreshToken` | string
`refreshTokenExpiresAt` | number
`refreshTokenExpiresIn` | number

## Example

```typescript
import type { OauthAccessTokenResponseRefresh } from ''

// TODO: Update the object below with actual values
const example = {
  "accessToken": null,
  "expiresIn": null,
  "responseType": null,
  "scope": null,
  "tokenType": null,
  "refreshToken": null,
  "refreshTokenExpiresAt": null,
  "refreshTokenExpiresIn": null,
} satisfies OauthAccessTokenResponseRefresh

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as OauthAccessTokenResponseRefresh
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


