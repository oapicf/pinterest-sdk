
# CatalogsHotelGuestRatings

If specified, you must provide all properties

## Properties

Name | Type
------------ | -------------
`score` | number
`numberOfReviewers` | number
`maxScore` | number
`ratingSystem` | string

## Example

```typescript
import type { CatalogsHotelGuestRatings } from ''

// TODO: Update the object below with actual values
const example = {
  "score": null,
  "numberOfReviewers": null,
  "maxScore": null,
  "ratingSystem": null,
} satisfies CatalogsHotelGuestRatings

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsHotelGuestRatings
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


