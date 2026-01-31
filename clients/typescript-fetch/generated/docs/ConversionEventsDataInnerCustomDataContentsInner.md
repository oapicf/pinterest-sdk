
# ConversionEventsDataInnerCustomDataContentsInner


## Properties

Name | Type
------------ | -------------
`id` | string
`itemPrice` | string
`quantity` | number
`itemName` | string
`itemCategory` | string
`itemBrand` | string

## Example

```typescript
import type { ConversionEventsDataInnerCustomDataContentsInner } from ''

// TODO: Update the object below with actual values
const example = {
  "id": red-pinterest-shirt-logo-1,
  "itemPrice": 1325.12,
  "quantity": 5,
  "itemName": pinterest-clothing-shirt,
  "itemCategory": pinterest-entertainment,
  "itemBrand": pinterest,
} satisfies ConversionEventsDataInnerCustomDataContentsInner

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ConversionEventsDataInnerCustomDataContentsInner
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


