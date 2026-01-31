
# CatalogsHotelFeedsUpdateRequest

Request object for updating a feed.

## Properties

Name | Type
------------ | -------------
`defaultCurrency` | [NullableCurrency](NullableCurrency.md)
`name` | string
`format` | [CatalogsFormat](CatalogsFormat.md)
`credentials` | [CatalogsFeedCredentials](CatalogsFeedCredentials.md)
`location` | string
`preferredProcessingSchedule` | [CatalogsFeedProcessingSchedule](CatalogsFeedProcessingSchedule.md)
`status` | [CatalogsStatus](CatalogsStatus.md)
`catalogType` | [CatalogsType](CatalogsType.md)

## Example

```typescript
import type { CatalogsHotelFeedsUpdateRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "defaultCurrency": null,
  "name": null,
  "format": null,
  "credentials": null,
  "location": null,
  "preferredProcessingSchedule": null,
  "status": null,
  "catalogType": null,
} satisfies CatalogsHotelFeedsUpdateRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsHotelFeedsUpdateRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


