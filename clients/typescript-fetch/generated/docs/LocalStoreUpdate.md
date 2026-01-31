
# LocalStoreUpdate


## Properties

Name | Type
------------ | -------------
`addressPrimary` | string
`addressSecondary` | string
`city` | string
`country` | [Country](Country.md)
`id` | string
`latitude` | number
`longitude` | number
`name` | string
`postalCode` | string
`region` | string
`storeCode` | string

## Example

```typescript
import type { LocalStoreUpdate } from ''

// TODO: Update the object below with actual values
const example = {
  "addressPrimary": 123 Johnson St,
  "addressSecondary": Suite 100,
  "city": Sunnyvale,
  "country": null,
  "id": 1234567890,
  "latitude": -30.21,
  "longitude": 50.45,
  "name": Sunnyvale Store,
  "postalCode": 94043,
  "region": CA,
  "storeCode": store_1,
} satisfies LocalStoreUpdate

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as LocalStoreUpdate
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


