
# BrandAccountsCreateRequest


## Properties

Name | Type
------------ | -------------
`name` | string
`username` | string
`country` | [Country](Country.md)
`about` | string
`website` | string
`profileImage` | [ImageBase64](ImageBase64.md)

## Example

```typescript
import type { BrandAccountsCreateRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "name": Canada Stores,
  "username": canada_stores,
  "country": null,
  "about": Stores in Canada,
  "website": https://www.example.com,
  "profileImage": null,
} satisfies BrandAccountsCreateRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as BrandAccountsCreateRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


