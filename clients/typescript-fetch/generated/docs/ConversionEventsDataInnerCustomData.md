
# ConversionEventsDataInnerCustomData

Object containing other custom data.

## Properties

Name | Type
------------ | -------------
`currency` | string
`value` | string
`contentIds` | Array&lt;string&gt;
`contentName` | string
`contentCategory` | string
`contentBrand` | string
`contents` | [Array&lt;ConversionEventsDataInnerCustomDataContentsInner&gt;](ConversionEventsDataInnerCustomDataContentsInner.md)
`numItems` | number
`orderId` | string
`searchString` | string
`optOutType` | string
`np` | string

## Example

```typescript
import type { ConversionEventsDataInnerCustomData } from ''

// TODO: Update the object below with actual values
const example = {
  "currency": USD,
  "value": 72.39,
  "contentIds": ["red-pinterest-shirt-logo-1","purple-pinterest-shirt-logo-3"],
  "contentName": pinterest-themed-clothing,
  "contentCategory": shirts,
  "contentBrand": pinterest-brand,
  "contents": null,
  "numItems": 2,
  "orderId": my_order_id,
  "searchString": sample string,
  "optOutType": LDP,
  "np": ss-company,
} satisfies ConversionEventsDataInnerCustomData

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ConversionEventsDataInnerCustomData
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


