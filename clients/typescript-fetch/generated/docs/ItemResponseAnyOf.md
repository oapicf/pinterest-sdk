
# ItemResponseAnyOf


## Properties

Name | Type
------------ | -------------
`catalogType` | [CatalogsType](CatalogsType.md)
`itemId` | string
`pins` | [Array&lt;Pin&gt;](Pin.md)
`attributes` | [CatalogsCreativeAssetsAttributes](CatalogsCreativeAssetsAttributes.md)
`hotelId` | string
`creativeAssetsId` | string

## Example

```typescript
import type { ItemResponseAnyOf } from ''

// TODO: Update the object below with actual values
const example = {
  "catalogType": null,
  "itemId": DS0294-M,
  "pins": null,
  "attributes": null,
  "hotelId": DS0294-M,
  "creativeAssetsId": DS0294-M,
} satisfies ItemResponseAnyOf

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ItemResponseAnyOf
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


