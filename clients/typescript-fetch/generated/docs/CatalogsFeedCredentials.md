
# CatalogsFeedCredentials

This field is **OPTIONAL**. Use this if your feed file requires username and password.

## Properties

Name | Type
------------ | -------------
`password` | string
`username` | string

## Example

```typescript
import type { CatalogsFeedCredentials } from ''

// TODO: Update the object below with actual values
const example = {
  "password": null,
  "username": null,
} satisfies CatalogsFeedCredentials

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsFeedCredentials
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


