
# FeedsUpdateRequest


## Properties

Name | Type
------------ | -------------
`defaultAvailability` | [ProductAvailabilityType](ProductAvailabilityType.md)
`defaultCurrency` | [NullableCurrency](NullableCurrency.md)
`name` | string
`format` | [CatalogsFormat](CatalogsFormat.md)
`credentials` | [CatalogsFeedCredentials](CatalogsFeedCredentials.md)
`location` | string
`preferredProcessingSchedule` | [CatalogsFeedProcessingSchedule](CatalogsFeedProcessingSchedule.md)
`status` | [CatalogsStatus](CatalogsStatus.md)

## Example

```typescript
import type { FeedsUpdateRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "defaultAvailability": null,
  "defaultCurrency": null,
  "name": null,
  "format": null,
  "credentials": null,
  "location": null,
  "preferredProcessingSchedule": null,
  "status": null,
} satisfies FeedsUpdateRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as FeedsUpdateRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


