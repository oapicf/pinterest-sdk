# ProductGroupPromotion


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_group_id** | **str** | ID of the ad group the product group belongs to. | [optional] 
**bid_in_micro_currency** | **int** | The bid in micro currency. | [optional] 
**catalog_product_group_id** | **str** | ID of the catalogs product group that this product group promotion references (required for create operations) | [optional] 
**catalog_product_group_name** | **str** | Catalogs product group name | [optional] 
**collections_header_type** | [**CollectionsHeaderType**](CollectionsHeaderType.md) |  | [optional] 
**collections_hero_destination_url** | **str** | Collections Hero Destination Url | [optional] 
**collections_hero_pin_id** | **str** | Hero Pin ID if this PG is promoted as a Collection | [optional] 
**creative_type** | [**CreativeType**](CreativeType.md) |  | [optional] 
**customizable_cta_type** | [**ProductGroupPromotionCustomizableCTAType**](ProductGroupPromotionCustomizableCTAType.md) |  | [optional] 
**definition** | **str** | The full product group definition path | [optional] 
**grid_click_type** | [**GridClickType**](GridClickType.md) |  | [optional] 
**id** | **str** | ID of the product group promotion (required for update operations). | [optional] 
**included** | **bool** | True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads. | [optional] 
**is_generate_background** | **bool** | Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement. | [optional] 
**is_image_auto_resizing** | **bool** | Set to &#x60;TRUE&#x60; to automatically resize your product images with generative AI. This ensures that images have optimal appearance for better performance. | [optional] 
**is_mdl** | **bool** | If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog | [optional] 
**parent_id** | **str** | The parent Product Group ID of this Product Group | [optional] 
**preferred_media_type** | [**PreferredMediaType**](PreferredMediaType.md) |  | [optional] 
**relative_definition** | **str** | The definition of the product group, relative to its parent - an attribute name/value pair | [optional] 
**selected_image_tag** | **str** | The ad image tag selected for the product group promotion. | [optional] 
**selected_video_tag** | **str** | The ad video tag selected for the product group promotion. | [optional] 
**slideshow_collections_description** | **str** | Slideshow Collections Description | [optional] 
**slideshow_collections_title** | **str** | Slideshow Collections Title | [optional] 
**status** | [**EntityStatus**](EntityStatus.md) |  | [optional] 
**tracking_url** | **str** | Tracking template for proudct group promotions. 4000 limit | [optional] 

## Example

```python
from openapi_client.models.product_group_promotion import ProductGroupPromotion

# TODO update the JSON string below
json = "{}"
# create an instance of ProductGroupPromotion from a JSON string
product_group_promotion_instance = ProductGroupPromotion.from_json(json)
# print the JSON string representation of the object
print ProductGroupPromotion.to_json()

# convert the object into a dict
product_group_promotion_dict = product_group_promotion_instance.to_dict()
# create an instance of ProductGroupPromotion from a dict
product_group_promotion_from_dict = ProductGroupPromotion.from_dict(product_group_promotion_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


