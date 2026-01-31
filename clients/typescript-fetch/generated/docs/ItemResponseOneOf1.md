
# ItemResponseOneOf1

Error item response

## Properties

Name | Type
------------ | -------------
`catalogType` | [CatalogsType](CatalogsType.md)
`errors` | [Array&lt;ItemValidationEvent&gt;](ItemValidationEvent.md)
`itemId` | string
`hotelId` | string
`creativeAssetsId` | string

## Example

```typescript
import type { ItemResponseOneOf1 } from ''

// TODO: Update the object below with actual values
const example = {
  "catalogType": null,
  "errors": null,
  "itemId": DS0294-M,
  "hotelId": DS0294-M,
  "creativeAssetsId": DS0294-M,
} satisfies ItemResponseOneOf1

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ItemResponseOneOf1
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


