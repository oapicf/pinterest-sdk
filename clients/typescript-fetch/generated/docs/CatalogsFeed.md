
# CatalogsFeed

Catalogs Feed object

## Properties

Name | Type
------------ | -------------
`createdAt` | Date
`id` | string
`updatedAt` | Date
`catalogType` | [CatalogsType](CatalogsType.md)
`credentials` | [CatalogsFeedCredentials](CatalogsFeedCredentials.md)
`defaultAvailability` | [ProductAvailabilityType](ProductAvailabilityType.md)
`defaultCountry` | [Country](Country.md)
`defaultCurrency` | [NullableCurrency](NullableCurrency.md)
`defaultLocale` | string
`format` | [CatalogsFormat](CatalogsFormat.md)
`location` | string
`name` | string
`preferredProcessingSchedule` | [CatalogsFeedProcessingSchedule](CatalogsFeedProcessingSchedule.md)
`status` | [CatalogsStatus](CatalogsStatus.md)
`catalogId` | string

## Example

```typescript
import type { CatalogsFeed } from ''

// TODO: Update the object below with actual values
const example = {
  "createdAt": 2022-03-14T15:15:22Z,
  "id": null,
  "updatedAt": 2022-03-14T15:16:34Z,
  "catalogType": null,
  "credentials": null,
  "defaultAvailability": null,
  "defaultCountry": null,
  "defaultCurrency": null,
  "defaultLocale": en-US,
  "format": null,
  "location": null,
  "name": null,
  "preferredProcessingSchedule": null,
  "status": null,
  "catalogId": null,
} satisfies CatalogsFeed

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsFeed
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


