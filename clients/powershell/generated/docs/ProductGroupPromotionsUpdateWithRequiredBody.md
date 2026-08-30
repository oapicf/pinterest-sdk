# ProductGroupPromotionsUpdateWithRequiredBody
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdGroupId** | **String** | ID of the ad group the product group promotion belongs to. | 
**ProductGroupPromotion** | [**ProductGroupPromotion[]**](ProductGroupPromotion.md) | List of product group promotions to create or update. | 

## Examples

- Prepare the resource
```powershell
$ProductGroupPromotionsUpdateWithRequiredBody = Initialize-PSOpenAPIToolsProductGroupPromotionsUpdateWithRequiredBody  -AdGroupId 2680059592705 `
 -ProductGroupPromotion [{&quot;slideshow_collections_description&quot;:&quot;Description&quot;,&quot;creative_type&quot;:&quot;REGULAR&quot;,&quot;collections_hero_pin_id&quot;:&quot;123123&quot;,&quot;catalog_product_group_name&quot;:&quot;catalogProductGroupName to create&quot;,&quot;collections_hero_destination_url&quot;:&quot;http://www.pinterest.com&quot;,&quot;tracking_url&quot;:&quot;https://www.pinterest.com&quot;,&quot;slideshow_collections_title&quot;:&quot;Title&quot;,&quot;status&quot;:&quot;ACTIVE&quot;,&quot;is_mdl&quot;:true},{&quot;id&quot;:&quot;2680059592705&quot;,&quot;catalog_product_group_id&quot;:&quot;1234123&quot;,&quot;slideshow_collections_description&quot;:&quot;Description&quot;,&quot;creative_type&quot;:&quot;REGULAR&quot;,&quot;collections_hero_pin_id&quot;:&quot;123123&quot;,&quot;catalog_product_group_name&quot;:&quot;catalogProductGroupName to update&quot;,&quot;collections_hero_destination_url&quot;:&quot;http://www.pinterest.com&quot;,&quot;tracking_url&quot;:&quot;https://www.pinterest.com&quot;,&quot;slideshow_collections_title&quot;:&quot;Title&quot;,&quot;status&quot;:&quot;ACTIVE&quot;}]
```

- Convert the resource to JSON
```powershell
$ProductGroupPromotionsUpdateWithRequiredBody | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

