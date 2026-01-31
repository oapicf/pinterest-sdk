
# ItemUpdateBatchRecord

Object describing an item batch record to update items

## Properties

Name | Type
------------ | -------------
`itemId` | string
`attributes` | [UpdatableItemAttributes](UpdatableItemAttributes.md)
`updateMask` | [Array&lt;UpdateMaskFieldType&gt;](UpdateMaskFieldType.md)

## Example

```typescript
import type { ItemUpdateBatchRecord } from ''

// TODO: Update the object below with actual values
const example = {
  "itemId": DS0294-M,
  "attributes": null,
  "updateMask": ["ad_link","adult","age_group","availability","average_review_rating","brand","checkout_enabled","color","condition","custom_label_0","custom_label_1","custom_label_2","custom_label_3","custom_label_4","description","free_shipping_label","free_shipping_limit","gender","google_product_category","gtin","item_group_id","last_updated_time","link","material","min_ad_price","mpn","number_of_ratings","number_of_reviews","pattern","price","product_type","sale_price","shipping","shipping_height","shipping_weight","shipping_width","size","size_system","size_type","tax","title","variant_names","variant_values"],
} satisfies ItemUpdateBatchRecord

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ItemUpdateBatchRecord
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


