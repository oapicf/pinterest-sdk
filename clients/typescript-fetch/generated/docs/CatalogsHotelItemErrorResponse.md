
# CatalogsHotelItemErrorResponse

Object describing a hotel item error

## Properties

Name | Type
------------ | -------------
`catalogType` | string
`errors` | [Array&lt;ItemValidationEvent&gt;](ItemValidationEvent.md)
`hotelId` | string
`itemResponseKind` | string

## Example

```typescript
import type { CatalogsHotelItemErrorResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "catalogType": null,
  "errors": null,
  "hotelId": DS0294-M,
  "itemResponseKind": null,
} satisfies CatalogsHotelItemErrorResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsHotelItemErrorResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


