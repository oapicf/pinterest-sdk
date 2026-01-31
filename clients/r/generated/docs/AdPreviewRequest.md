# openapi::AdPreviewRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**image_url** | **character** | Image URL. | 
**title** | **character** | Title displayed below ad. | 
**pin_id** | **character** | Pin ID. | 
**catalog_product_group_id** | **character** | Catalog Product Group Id. | [Pattern: ^\\d+$] 
**creative_type** | **character** | Ad format of the shopping ad preview. | [Enum: [SHOPPING, CAROUSEL, COLLECTION, REGULAR]] 
**customizable_cta_type** | [**CustomizableCTAType**](CustomizableCTAType.md) | Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are &#x60;SHOP_NOW&#x60;, &#x60;BOOK_NOW&#x60;, &#x60;ON_SALE&#x60;, &#x60;GET_DEAL&#x60;, &#x60;BUY_ONLINE_PICKUP_IN_STORE&#x60; | [optional] [Enum: ] 
**hero_image_title** | **character** | Title displayed below ad. | [optional] 
**hero_image_url** | **character** | Hero image URL. | [optional] 
**hero_pin_id** | **character** | Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required. | [optional] [Pattern: ^\\d+$] 
**image_tag** | **character** | Multi image template tag. | [optional] 
**item_id** | **character** | Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING. | [optional] 
**preferred_media_type** | **character** | Preferred media type. | [optional] [Enum: [VIDEO, IMAGE]] 
**video_tag** | **character** | Multi video template tag, image_tag and video_tag are mutual exclusive. | [optional] 


