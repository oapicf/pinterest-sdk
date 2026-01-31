
# CatalogsHotelFeed

Catalogs Hotel Feed object

## Properties

Name | Type
------------ | -------------
`createdAt` | Date
`id` | string
`updatedAt` | Date
`name` | string
`format` | [CatalogsFormat](CatalogsFormat.md)
`catalogType` | [CatalogsType](CatalogsType.md)
`credentials` | [CatalogsFeedCredentials](CatalogsFeedCredentials.md)
`location` | string
`preferredProcessingSchedule` | [CatalogsFeedProcessingSchedule](CatalogsFeedProcessingSchedule.md)
`status` | [CatalogsStatus](CatalogsStatus.md)
`defaultCurrency` | [NullableCurrency](NullableCurrency.md)
`defaultLocale` | string
`catalogId` | string

## Example

```typescript
import type { CatalogsHotelFeed } from ''

// TODO: Update the object below with actual values
const example = {
  "createdAt": 2022-03-14T15:15:22Z,
  "id": null,
  "updatedAt": 2022-03-14T15:16:34Z,
  "name": null,
  "format": null,
  "catalogType": null,
  "credentials": null,
  "location": null,
  "preferredProcessingSchedule": null,
  "status": null,
  "defaultCurrency": null,
  "defaultLocale": en-US,
  "catalogId": null,
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


