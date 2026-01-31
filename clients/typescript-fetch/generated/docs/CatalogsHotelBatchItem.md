
# CatalogsHotelBatchItem

Hotel batch item

## Properties

Name | Type
------------ | -------------
`hotelId` | string
`operation` | string
`attributes` | [CatalogsUpdatableHotelAttributes](CatalogsUpdatableHotelAttributes.md)

## Example

```typescript
import type { CatalogsHotelBatchItem } from ''

// TODO: Update the object below with actual values
const example = {
  "hotelId": DS0294-M,
  "operation": null,
  "attributes": null,
} satisfies CatalogsHotelBatchItem

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsHotelBatchItem
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


