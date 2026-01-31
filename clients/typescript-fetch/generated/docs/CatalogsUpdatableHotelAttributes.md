
# CatalogsUpdatableHotelAttributes


## Properties

Name | Type
------------ | -------------
`address` | [CatalogsHotelAddress](CatalogsHotelAddress.md)
`basePrice` | string
`brand` | string
`category` | string
`customLabel0` | string
`customLabel1` | string
`customLabel2` | string
`customLabel3` | string
`customLabel4` | string
`description` | string
`guestRatings` | [CatalogsHotelGuestRatings](CatalogsHotelGuestRatings.md)
`latitude` | number
`link` | string
`longitude` | number
`name` | string
`neighborhood` | Array&lt;string&gt;
`salePrice` | string

## Example

```typescript
import type { CatalogsUpdatableHotelAttributes } from ''

// TODO: Update the object below with actual values
const example = {
  "address": null,
  "basePrice": 100 USD,
  "brand": null,
  "category": null,
  "customLabel0": null,
  "customLabel1": null,
  "customLabel2": null,
  "customLabel3": null,
  "customLabel4": null,
  "description": null,
  "guestRatings": null,
  "latitude": null,
  "link": null,
  "longitude": null,
  "name": null,
  "neighborhood": null,
  "salePrice": 90 USD,
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


