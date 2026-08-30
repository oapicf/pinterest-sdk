
# CatalogsVerticalFeedsCreateRequest

Request object for creating a feed.

## Properties

Name | Type
------------ | -------------
`catalogId` | string
`catalogType` | string
`credentials` | [CatalogsFeedCredentials](CatalogsFeedCredentials.md)
`defaultAvailability` | [ProductAvailabilityType](ProductAvailabilityType.md)
`defaultCountry` | [Country](Country.md)
`defaultCurrency` | [NullableCurrency](NullableCurrency.md)
`defaultLocale` | [CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale](CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale.md)
`format` | [CatalogsFormat](CatalogsFormat.md)
`location` | string
`name` | string
`preferredProcessingSchedule` | [CatalogsFeedProcessingSchedule](CatalogsFeedProcessingSchedule.md)
`status` | [CatalogsStatus](CatalogsStatus.md)

## Example

```typescript
import type { CatalogsVerticalFeedsCreateRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "catalogId": null,
  "catalogType": null,
  "credentials": null,
  "defaultAvailability": null,
  "defaultCountry": null,
  "defaultCurrency": null,
  "defaultLocale": null,
  "format": null,
  "location": null,
  "name": null,
  "preferredProcessingSchedule": null,
  "status": null,
} satisfies CatalogsVerticalFeedsCreateRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsVerticalFeedsCreateRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


