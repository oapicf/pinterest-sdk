
# CatalogsCreativeAssetsFeedsCreateRequest

Request object for creating a feed.

## Properties

Name | Type
------------ | -------------
`defaultCurrency` | [NullableCurrency](NullableCurrency.md)
`name` | string
`format` | [CatalogsFormat](CatalogsFormat.md)
`defaultLocale` | [CatalogsFeedsCreateRequestDefaultLocale](CatalogsFeedsCreateRequestDefaultLocale.md)
`defaultCountry` | [Country](Country.md)
`credentials` | [CatalogsFeedCredentials](CatalogsFeedCredentials.md)
`location` | string
`preferredProcessingSchedule` | [CatalogsFeedProcessingSchedule](CatalogsFeedProcessingSchedule.md)
`catalogType` | [CatalogsType](CatalogsType.md)
`catalogId` | string
`status` | [CatalogsStatus](CatalogsStatus.md)

## Example

```typescript
import type { CatalogsCreativeAssetsFeedsCreateRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "defaultCurrency": null,
  "name": null,
  "format": null,
  "defaultLocale": null,
  "defaultCountry": null,
  "credentials": null,
  "location": null,
  "preferredProcessingSchedule": null,
  "catalogType": null,
  "catalogId": null,
  "status": null,
} satisfies CatalogsCreativeAssetsFeedsCreateRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsCreativeAssetsFeedsCreateRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


