
# CatalogsHotelFeedsCreateRequest

Request object for creating a feed. Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.

## Properties

Name | Type
------------ | -------------
`catalogId` | string
`catalogType` | string
`credentials` | [CatalogsFeedCredentials](CatalogsFeedCredentials.md)
`defaultCurrency` | [NullableCurrency](NullableCurrency.md)
`defaultLocale` | [CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale](CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale.md)
`format` | [CatalogsFormat](CatalogsFormat.md)
`location` | string
`name` | string
`preferredProcessingSchedule` | [CatalogsFeedProcessingSchedule](CatalogsFeedProcessingSchedule.md)
`status` | [CatalogsStatus](CatalogsStatus.md)

## Example

```typescript
import type { CatalogsHotelFeedsCreateRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "catalogId": null,
  "catalogType": null,
  "credentials": null,
  "defaultCurrency": null,
  "defaultLocale": null,
  "format": null,
  "location": null,
  "name": null,
  "preferredProcessingSchedule": null,
  "status": null,
} satisfies CatalogsHotelFeedsCreateRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsHotelFeedsCreateRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


