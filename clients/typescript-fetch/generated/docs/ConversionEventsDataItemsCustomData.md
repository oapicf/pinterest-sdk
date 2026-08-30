
# ConversionEventsDataItemsCustomData

Object containing other custom data.

## Properties

Name | Type
------------ | -------------
`contentBrand` | string
`contentCategory` | string
`contentIds` | Array&lt;string&gt;
`contentName` | string
`contents` | [Array&lt;ConversionEventsDataItemsCustomDataContentsItems&gt;](ConversionEventsDataItemsCustomDataContentsItems.md)
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
import type { ConversionEventsDataItemsCustomData } from ''

// TODO: Update the object below with actual values
const example = {
  "contentBrand": null,
  "contentCategory": null,
  "contentIds": null,
  "contentName": null,
  "contents": null,
  "currency": null,
  "externalMeasurementId": null,
  "externalMeasurementVendorId": null,
  "np": null,
  "numItems": null,
  "optOutType": null,
  "orderId": null,
  "predictedLtv": null,
  "searchString": null,
  "value": null,
} satisfies ConversionEventsDataItemsCustomData

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ConversionEventsDataItemsCustomData
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


