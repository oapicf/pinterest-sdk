
# Table `AdPreviewRequest`
(mapped from: AdPreviewRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**imageUrl** | image_url | text NOT NULL |  | **kotlin.String** | Image URL. | 
**title** | title | text NOT NULL |  | **kotlin.String** | Title displayed below ad. | 
**pinId** | pin_id | text NOT NULL |  | **kotlin.String** | Pin ID. | 
**catalogProductGroupId** | catalog_product_group_id | text NOT NULL |  | **kotlin.String** | Catalog Product Group Id. | 
**creativeType** | creative_type | text NOT NULL |  | [**creative_type**](#CreativeType) | Ad format of the shopping ad preview. | 
**customizableCtaType** | customizable_cta_type | long |  | [**CustomizableCTAType**](CustomizableCTAType.md) | Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are &#x60;SHOP_NOW&#x60;, &#x60;BOOK_NOW&#x60;, &#x60;ON_SALE&#x60;, &#x60;GET_DEAL&#x60;, &#x60;BUY_ONLINE_PICKUP_IN_STORE&#x60; |  [optional] [foreignkey]
**heroImageTitle** | hero_image_title | text |  | **kotlin.String** | Title displayed below ad. |  [optional]
**heroImageUrl** | hero_image_url | text |  | **kotlin.String** | Hero image URL. |  [optional]
**heroPinId** | hero_pin_id | text |  | **kotlin.String** | Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required. |  [optional]
**imageTag** | image_tag | text |  | **kotlin.String** | Multi image template tag. |  [optional]
**itemId** | item_id | text |  | **kotlin.String** | Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING. |  [optional]
**preferredMediaType** | preferred_media_type | text |  | [**preferred_media_type**](#PreferredMediaType) | Preferred media type. |  [optional]
**videoTag** | video_tag | text |  | **kotlin.String** | Multi video template tag, image_tag and video_tag are mutual exclusive. |  [optional]















