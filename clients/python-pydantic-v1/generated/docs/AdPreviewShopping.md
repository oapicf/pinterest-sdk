# AdPreviewShopping

Ad preview from a catalog product group (shopping).

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_product_group_id** | **str** | Catalog Product Group Id. | 
**creative_type** | [**AdShoppingPreviewCreativeType**](AdShoppingPreviewCreativeType.md) | Ad format of the shopping ad preview. | 
**customizable_cta_type** | [**CustomizableCTAType**](CustomizableCTAType.md) | Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are &#x60;SHOP_NOW&#x60;, &#x60;BOOK_NOW&#x60;, &#x60;ON_SALE&#x60;, &#x60;GET_DEAL&#x60;, &#x60;BUY_ONLINE_PICKUP_IN_STORE&#x60; | [optional] 
**hero_image_title** | **str** | Title displayed below ad. | [optional] 
**hero_image_url** | **str** | Hero image URL. | [optional] 
**hero_pin_id** | **str** | Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required. | [optional] 
**image_tag** | **str** | Multi image template tag. | [optional] 
**item_id** | **str** | Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING. | [optional] 
**preferred_media_type** | [**BasePreferredMediaType**](BasePreferredMediaType.md) | Preferred media type. | [optional] 
**show_promotion** | **bool** | Include promotion data in preview when available on catalog item. Defaults to false. | [optional] 
**video_tag** | **str** | Multi video template tag, image_tag and video_tag are mutual exclusive. | [optional] 

## Example

```python
from openapi_client.models.ad_preview_shopping import AdPreviewShopping

# TODO update the JSON string below
json = "{}"
# create an instance of AdPreviewShopping from a JSON string
ad_preview_shopping_instance = AdPreviewShopping.from_json(json)
# print the JSON string representation of the object
print AdPreviewShopping.to_json()

# convert the object into a dict
ad_preview_shopping_dict = ad_preview_shopping_instance.to_dict()
# create an instance of AdPreviewShopping from a dict
ad_preview_shopping_from_dict = AdPreviewShopping.from_dict(ad_preview_shopping_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


