
# CatalogsRetailBatchRequestItemsItems


## Properties

Name | Type
------------ | -------------
`attributes` | [ItemAttributesRequest](ItemAttributesRequest.md)
`itemId` | string
`operation` | string
`updateMask` | [Array&lt;UpdateMaskFieldType&gt;](UpdateMaskFieldType.md)
`lastUpdatedTime` | number

## Example

```typescript
import type { CatalogsRetailBatchRequestItemsItems } from ''

// TODO: Update the object below with actual values
const example = {
  "attributes": null,
  "itemId": DS0294-M,
  "operation": null,
  "updateMask": [ad_link, adult, age_group, availability, average_review_rating, brand, checkout_enabled, color, condition, custom_label_0, custom_label_1, custom_label_2, custom_label_3, custom_label_4, description, free_shipping_label, free_shipping_limit, gender, google_product_category, gtin, item_group_id, last_updated_time, link, material, min_ad_price, mpn, number_of_ratings, number_of_reviews, pattern, price, product_type, sale_price, shipping, shipping_height, shipping_weight, shipping_width, size, size_system, size_type, tax, title, variant_names, variant_values, promotion_id],
  "lastUpdatedTime": 1641483432072,
} satisfies CatalogsRetailBatchRequestItemsItems

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsRetailBatchRequestItemsItems
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


