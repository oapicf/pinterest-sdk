# ad_preview_request_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**image_url** | **char \*** | Image URL. | 
**title** | **char \*** | Title displayed below ad. | 
**pin_id** | **char \*** | Pin ID. | 
**catalog_product_group_id** | **char \*** | Catalog Product Group Id. | 
**creative_type** | **pinterest_rest_api_ad_preview_request_CREATIVETYPE_e** | Ad format of the shopping ad preview. | 
**customizable_cta_type** | **customizable_cta_type_t \*** | Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are &#x60;SHOP_NOW&#x60;, &#x60;BOOK_NOW&#x60;, &#x60;ON_SALE&#x60;, &#x60;GET_DEAL&#x60;, &#x60;BUY_ONLINE_PICKUP_IN_STORE&#x60; | [optional] 
**hero_image_title** | **char \*** | Title displayed below ad. | [optional] 
**hero_image_url** | **char \*** | Hero image URL. | [optional] 
**hero_pin_id** | **char \*** | Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required. | [optional] 
**image_tag** | **char \*** | Multi image template tag. | [optional] 
**item_id** | **char \*** | Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING. | [optional] 
**preferred_media_type** | **pinterest_rest_api_ad_preview_request_PREFERREDMEDIATYPE_e** | Preferred media type. | [optional] 
**video_tag** | **char \*** | Multi video template tag, image_tag and video_tag are mutual exclusive. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


