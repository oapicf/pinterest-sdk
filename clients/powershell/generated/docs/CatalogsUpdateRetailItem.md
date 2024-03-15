# CatalogsUpdateRetailItem
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ItemId** | **String** | The catalog item id in the merchant namespace | 
**Operation** | **String** |  | 
**Attributes** | [**UpdatableItemAttributes**](UpdatableItemAttributes.md) |  | 
**UpdateMask** | [**UpdateMaskFieldType[]**](UpdateMaskFieldType.md) | The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item. | [optional] 

## Examples

- Prepare the resource
```powershell
$CatalogsUpdateRetailItem = Initialize-PSOpenAPIToolsCatalogsUpdateRetailItem  -ItemId DS0294-M `
 -Operation null `
 -Attributes null `
 -UpdateMask [&quot;ad_link&quot;,&quot;adult&quot;,&quot;age_group&quot;,&quot;availability&quot;,&quot;average_review_rating&quot;,&quot;brand&quot;,&quot;checkout_enabled&quot;,&quot;color&quot;,&quot;condition&quot;,&quot;custom_label_0&quot;,&quot;custom_label_1&quot;,&quot;custom_label_2&quot;,&quot;custom_label_3&quot;,&quot;custom_label_4&quot;,&quot;description&quot;,&quot;free_shipping_label&quot;,&quot;free_shipping_limit&quot;,&quot;gender&quot;,&quot;google_product_category&quot;,&quot;gtin&quot;,&quot;item_group_id&quot;,&quot;last_updated_time&quot;,&quot;link&quot;,&quot;material&quot;,&quot;min_ad_price&quot;,&quot;mpn&quot;,&quot;number_of_ratings&quot;,&quot;number_of_reviews&quot;,&quot;pattern&quot;,&quot;price&quot;,&quot;product_type&quot;,&quot;sale_price&quot;,&quot;shipping&quot;,&quot;shipping_height&quot;,&quot;shipping_weight&quot;,&quot;shipping_width&quot;,&quot;size&quot;,&quot;size_system&quot;,&quot;size_type&quot;,&quot;tax&quot;,&quot;title&quot;,&quot;variant_names&quot;,&quot;variant_values&quot;]
```

- Convert the resource to JSON
```powershell
$CatalogsUpdateRetailItem | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

