
# ConversionEventsDataInnerCustomData

Object containing other custom data.

## Properties

Name | Type
------------ | -------------
`contentBrand` | string
`contentCategory` | string
`contentIds` | Array&lt;string&gt;
`contentName` | string
`contents` | [Array&lt;ConversionEventsDataInnerCustomDataContentsInner&gt;](ConversionEventsDataInnerCustomDataContentsInner.md)
`currency` | string
`externalMeasurementId` | string
`externalMeasurementVendorId` | number
`np` | string
`numItems` | number
`optOutType` | string
`orderId` | string
`predictedLtv` | string
`searchString` | string
`value` | string

## Example

```typescript
import type { ConversionEventsDataInnerCustomData } from ''

// TODO: Update the object below with actual values
const example = {
  "contentBrand": pinterest-brand,
  "contentCategory": shirts,
  "contentIds": ["product-id-001","product-id-002"],
  "contentName": pinterest-themed-clothing,
  "contents": [{"id":"product-id-001","item_price":"14.99","quantity":3,"item_name":"pinterest-shirt-girl","item_category":"pinterest-clothing-shirts","item_brand":"pinterest"},{"id":"product-id-002","item_price":"13.71","quantity":2,"item_name":"pinterest-shirt-men","item_category":"pinterest-clothing-shirts","item_brand":"pinterest"}],
  "currency": USD,
  "externalMeasurementId": rbos-cb7a9e56-4988-4ca0-801b-05c79b29785f,
  "externalMeasurementVendorId": 1,
  "np": ss-company,
  "numItems": 5,
  "optOutType": LDP,
  "orderId": my_order_id,
  "predictedLtv": 2794.82,
  "searchString": sample string,
  "value": 72.39,
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


