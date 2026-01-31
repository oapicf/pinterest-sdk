
# CatalogsCreateHotelItem

A hotel item to be created.

## Properties

Name | Type
------------ | -------------
`attributes` | [CatalogsHotelAttributes](CatalogsHotelAttributes.md)
`hotelId` | string
`operation` | string

## Example

```typescript
import type { CatalogsCreateHotelItem } from ''

// TODO: Update the object below with actual values
const example = {
  "attributes": null,
  "hotelId": DS0294-M,
  "operation": null,
} satisfies CatalogsCreateHotelItem

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsCreateHotelItem
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


