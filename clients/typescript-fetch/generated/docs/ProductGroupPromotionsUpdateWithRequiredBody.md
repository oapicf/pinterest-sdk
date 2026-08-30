
# ProductGroupPromotionsUpdateWithRequiredBody

Resource create or update operation model with required body fields (no OptionalProperties).

## Properties

Name | Type
------------ | -------------
`adGroupId` | string
`productGroupPromotion` | [Array&lt;ProductGroupPromotion&gt;](ProductGroupPromotion.md)

## Example

```typescript
import type { ProductGroupPromotionsUpdateWithRequiredBody } from ''

// TODO: Update the object below with actual values
const example = {
  "adGroupId": 2680059592705,
  "productGroupPromotion": [{"slideshow_collections_description":"Description","creative_type":"REGULAR","collections_hero_pin_id":"123123","catalog_product_group_name":"catalogProductGroupName to create","collections_hero_destination_url":"http://www.pinterest.com","tracking_url":"https://www.pinterest.com","slideshow_collections_title":"Title","status":"ACTIVE","is_mdl":true},{"id":"2680059592705","catalog_product_group_id":"1234123","slideshow_collections_description":"Description","creative_type":"REGULAR","collections_hero_pin_id":"123123","catalog_product_group_name":"catalogProductGroupName to update","collections_hero_destination_url":"http://www.pinterest.com","tracking_url":"https://www.pinterest.com","slideshow_collections_title":"Title","status":"ACTIVE"}],
} satisfies ProductGroupPromotionsUpdateWithRequiredBody

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ProductGroupPromotionsUpdateWithRequiredBody
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


