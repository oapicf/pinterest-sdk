
# CatalogsHotelFeed

Catalogs Hotel Feed object

## Properties

Name | Type
------------ | -------------
`catalogId` | string
`catalogType` | string
`createdAt` | Date
`credentials` | [CatalogsFeedCredentials](CatalogsFeedCredentials.md)
`defaultCurrency` | [NullableCurrency](NullableCurrency.md)
`defaultLocale` | string
`format` | [CatalogsFormat](CatalogsFormat.md)
`id` | string
`location` | string
`name` | string
`preferredProcessingSchedule` | [CatalogsFeedProcessingSchedule](CatalogsFeedProcessingSchedule.md)
`status` | [CatalogsStatus](CatalogsStatus.md)
`updatedAt` | Date

## Example

```typescript
import type { CatalogsHotelFeed } from ''

// TODO: Update the object below with actual values
const example = {
  "catalogId": null,
  "catalogType": null,
  "createdAt": null,
  "credentials": null,
  "defaultCurrency": null,
  "defaultLocale": null,
  "format": null,
  "id": 864344156814050986,
  "location": null,
  "name": null,
  "preferredProcessingSchedule": null,
  "status": null,
  "updatedAt": null,
} satisfies CatalogsHotelFeed

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsHotelFeed
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


