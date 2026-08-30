
# StoreMetadata

Store metadata for a specific store location

## Properties

Name | Type
------------ | -------------
`geohash` | string
`latitude` | number
`longitude` | number
`storeCode` | string
`storeId` | string
`storeName` | string

## Example

```typescript
import type { StoreMetadata } from ''

// TODO: Update the object below with actual values
const example = {
  "geohash": 9q,
  "latitude": 37.37695098,
  "longitude": -122.032913,
  "storeCode": store_1,
  "storeId": 9070947806573,
  "storeName": Store 1 Sunnyvale,
} satisfies StoreMetadata

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as StoreMetadata
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


