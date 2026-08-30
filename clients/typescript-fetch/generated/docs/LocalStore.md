
# LocalStore

Local store entity

## Properties

Name | Type
------------ | -------------
`addressPrimary` | string
`addressSecondary` | string
`city` | string
`country` | [Country](Country.md)
`createdAt` | Date
`id` | string
`latitude` | number
`longitude` | number
`name` | string
`postalCode` | string
`region` | string
`storeCode` | string
`updatedAt` | Date

## Example

```typescript
import type { LocalStore } from ''

// TODO: Update the object below with actual values
const example = {
  "addressPrimary": 123 Johnson St,
  "addressSecondary": Suite 100,
  "city": Sunnyvale,
  "country": null,
  "createdAt": 2022-03-14T15:15:22Z,
  "id": 1234567890,
  "latitude": -30.21,
  "longitude": 50.45,
  "name": Sunnyvale Store,
  "postalCode": 94043,
  "region": CA,
  "storeCode": store_1,
  "updatedAt": 2022-03-14T15:16:34Z,
} satisfies LocalStore

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as LocalStore
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


