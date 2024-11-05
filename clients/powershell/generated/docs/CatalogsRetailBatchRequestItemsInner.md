# CatalogsRetailBatchRequestItemsInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ItemId** | **String** | The catalog item id in the merchant namespace | 
**Operation** | **String** |  | 
**Attributes** | [**ItemAttributesRequest**](ItemAttributesRequest.md) |  | 
**UpdateMask** | [**UpdateMaskFieldType[]**](UpdateMaskFieldType.md) | The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item. | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsRetailBatchRequestItemsInner = Initialize-PSOpenAPIToolsCatalogsRetailBatchRequestItemsInner  -ItemId DS0294-M `
 -Operation null `
 -Attributes null `
 -UpdateMask [ad_link, adult, age_group, availability, average_review_rating, brand, checkout_enabled, color, condition, custom_label_0, custom_label_1, custom_label_2, custom_label_3, custom_label_4, description, free_shipping_label, free_shipping_limit, gender, google_product_category, gtin, item_group_id, last_updated_time, link, material, min_ad_price, mpn, number_of_ratings, number_of_reviews, pattern, price, product_type, sale_price, shipping, shipping_height, shipping_weight, shipping_width, size, size_system, size_type, tax, title, variant_names, variant_values]
```

- Convert the resource to JSON
```powershell
$CatalogsRetailBatchRequestItemsInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

