
# OauthAccessToken

Describes the valid schema for possible OAuth access token requests.

## Properties

Name | Type
------------ | -------------
`accessToken` | string
`expiresIn` | number
`refreshToken` | string
`refreshTokenExpiresAt` | number
`refreshTokenExpiresIn` | number
`responseType` | [TokenGrantType](TokenGrantType.md)
`scope` | string
`tokenType` | string

## Example

```typescript
import type { OauthAccessToken } from ''

// TODO: Update the object below with actual values
const example = {
  "accessToken": null,
  "expiresIn": null,
  "refreshToken": null,
  "refreshTokenExpiresAt": null,
  "refreshTokenExpiresIn": null,
  "responseType": null,
  "scope": null,
  "tokenType": null,
} satisfies OauthAccessToken

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as OauthAccessToken
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


