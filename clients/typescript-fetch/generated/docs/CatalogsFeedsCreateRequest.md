
# CatalogsFeedsCreateRequest

Request object for creating a feed. Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.

## Properties

Name | Type
------------ | -------------
`defaultCurrency` | [NullableCurrency](NullableCurrency.md)
`name` | string
`format` | [CatalogsFormat](CatalogsFormat.md)
`defaultLocale` | [CatalogsFeedsCreateRequestDefaultLocale](CatalogsFeedsCreateRequestDefaultLocale.md)
`credentials` | [CatalogsFeedCredentials](CatalogsFeedCredentials.md)
`location` | string
`preferredProcessingSchedule` | [CatalogsFeedProcessingSchedule](CatalogsFeedProcessingSchedule.md)
`defaultCountry` | [Country](Country.md)
`defaultAvailability` | [ProductAvailabilityType](ProductAvailabilityType.md)
`status` | [CatalogsStatus](CatalogsStatus.md)

## Example

```typescript
import type { CatalogsFeedsCreateRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "defaultCurrency": null,
  "name": null,
  "format": null,
  "defaultLocale": null,
  "credentials": null,
  "location": null,
  "preferredProcessingSchedule": null,
  "defaultCountry": null,
  "defaultAvailability": null,
  "status": null,
} satisfies CatalogsFeedsCreateRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsFeedsCreateRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


