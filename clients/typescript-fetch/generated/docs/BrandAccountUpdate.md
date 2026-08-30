
# BrandAccountUpdate

Resource create or update operation model.

## Properties

Name | Type
------------ | -------------
`about` | string
`country` | [Country](Country.md)
`name` | string
`profileImage` | [BrandAccountProfileImageUpdate](BrandAccountProfileImageUpdate.md)
`username` | string
`website` | string

## Example

```typescript
import type { BrandAccountUpdate } from ''

// TODO: Update the object below with actual values
const example = {
  "about": null,
  "country": null,
  "name": null,
  "profileImage": null,
  "username": null,
  "website": null,
} satisfies BrandAccountUpdate

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as BrandAccountUpdate
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


