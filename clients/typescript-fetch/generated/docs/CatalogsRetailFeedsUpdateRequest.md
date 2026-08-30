
# CatalogsRetailFeedsUpdateRequest

Request object for updating a feed.

## Properties

Name | Type
------------ | -------------
`catalogType` | string
`credentials` | [CatalogsFeedCredentials](CatalogsFeedCredentials.md)
`defaultAvailability` | [ProductAvailabilityType](ProductAvailabilityType.md)
`defaultCurrency` | [NullableCurrency](NullableCurrency.md)
`format` | [CatalogsFormat](CatalogsFormat.md)
`location` | string
`name` | string
`preferredProcessingSchedule` | [CatalogsFeedProcessingSchedule](CatalogsFeedProcessingSchedule.md)
`status` | [CatalogsStatus](CatalogsStatus.md)

## Example

```typescript
import type { CatalogsRetailFeedsUpdateRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "catalogType": null,
  "credentials": null,
  "defaultAvailability": null,
  "defaultCurrency": null,
  "format": null,
  "location": null,
  "name": null,
  "preferredProcessingSchedule": null,
  "status": null,
} satisfies CatalogsRetailFeedsUpdateRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsRetailFeedsUpdateRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


