
# ItemResponse

Object describing an item record or error. Discriminated by `item_response_kind` (one unique value per leaf).

## Properties

Name | Type
------------ | -------------
`attributes` | [CatalogsCreativeAssetsAttributes](CatalogsCreativeAssetsAttributes.md)
`catalogType` | string
`itemId` | string
`itemResponseKind` | string
`pins` | [Array&lt;Pin&gt;](Pin.md)
`hotelId` | string
`creativeAssetsId` | string
`errors` | [Array&lt;ItemValidationEvent&gt;](ItemValidationEvent.md)

## Example

```typescript
import type { ItemResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "attributes": null,
  "catalogType": null,
  "itemId": DS0294-M,
  "itemResponseKind": null,
  "pins": null,
  "hotelId": DS0294-M,
  "creativeAssetsId": DS0294-M,
  "errors": null,
} satisfies ItemResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ItemResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


