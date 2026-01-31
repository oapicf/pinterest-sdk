

# AdPreviewShopping

The class is defined in **[AdPreviewShopping.java](../../src/main/java/org/openapitools/model/AdPreviewShopping.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalogProductGroupId** | `String` | Catalog Product Group Id. | 
**creativeType** | [**CreativeTypeEnum**](#CreativeTypeEnum) | Ad format of the shopping ad preview. | 
**customizableCtaType** | `CustomizableCTAType` | Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are &#x60;SHOP_NOW&#x60;, &#x60;BOOK_NOW&#x60;, &#x60;ON_SALE&#x60;, &#x60;GET_DEAL&#x60;, &#x60;BUY_ONLINE_PICKUP_IN_STORE&#x60; |  [optional property]
**heroImageTitle** | `String` | Title displayed below ad. |  [optional property]
**heroImageUrl** | `String` | Hero image URL. |  [optional property]
**heroPinId** | `String` | Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required. |  [optional property]
**imageTag** | `String` | Multi image template tag. |  [optional property]
**itemId** | `String` | Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING. |  [optional property]
**preferredMediaType** | [**PreferredMediaTypeEnum**](#PreferredMediaTypeEnum) | Preferred media type. |  [optional property]
**videoTag** | `String` | Multi video template tag, image_tag and video_tag are mutual exclusive. |  [optional property]


## CreativeTypeEnum

Name | Value
---- | -----
SHOPPING | `"SHOPPING"`
CAROUSEL | `"CAROUSEL"`
COLLECTION | `"COLLECTION"`
REGULAR | `"REGULAR"`







## PreferredMediaTypeEnum

Name | Value
---- | -----
VIDEO | `"VIDEO"`
IMAGE | `"IMAGE"`



