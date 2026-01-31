
# CatalogsUpdatableHotelAttributes


## Properties

Name | Type
------------ | -------------
`name` | string
`link` | string
`description` | string
`brand` | string
`latitude` | number
`longitude` | number
`neighborhood` | Array&lt;string&gt;
`address` | [CatalogsHotelAddress](CatalogsHotelAddress.md)
`customLabel0` | string
`customLabel1` | string
`customLabel2` | string
`customLabel3` | string
`customLabel4` | string
`category` | string
`basePrice` | string
`salePrice` | string
`guestRatings` | [CatalogsHotelGuestRatings](CatalogsHotelGuestRatings.md)

## Example

```typescript
import type { CatalogsUpdatableHotelAttributes } from ''

// TODO: Update the object below with actual values
const example = {
  "name": null,
  "link": null,
  "description": null,
  "brand": null,
  "latitude": null,
  "longitude": null,
  "neighborhood": null,
  "address": null,
  "customLabel0": null,
  "customLabel1": null,
  "customLabel2": null,
  "customLabel3": null,
  "customLabel4": null,
  "category": null,
  "basePrice": 100 USD,
  "salePrice": 90 USD,
  "guestRatings": null,
} satisfies CatalogsUpdatableHotelAttributes

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsUpdatableHotelAttributes
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


