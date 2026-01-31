
# CatalogsHotelItemResponse

Object describing a hotel record

## Properties

Name | Type
------------ | -------------
`attributes` | [CatalogsHotelAttributes](CatalogsHotelAttributes.md)
`catalogType` | [CatalogsType](CatalogsType.md)
`hotelId` | string
`pins` | [Array&lt;Pin&gt;](Pin.md)

## Example

```typescript
import type { CatalogsHotelItemResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "attributes": null,
  "catalogType": null,
  "hotelId": DS0294-M,
  "pins": null,
} satisfies CatalogsHotelItemResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsHotelItemResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


