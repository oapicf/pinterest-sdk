

# ProductGroupPromotion

The class is defined in **[ProductGroupPromotion.java](../../src/main/java/org/openapitools/model/ProductGroupPromotion.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adGroupId** | `String` | ID of the ad group the product group belongs to. |  [optional property]
**bidInMicroCurrency** | `Integer` | The bid in micro currency. |  [optional property]
**catalogProductGroupId** | `String` | ID of the catalogs product group that this product group promotion references |  [optional property]
**catalogProductGroupName** | `String` | Catalogs product group name |  [optional property]
**collectionsHeaderType** | [**CollectionsHeaderTypeEnum**](#CollectionsHeaderTypeEnum) | Collections ad header type |  [optional property]
**collectionsHeroDestinationUrl** | `String` | Collections Hero Destination Url |  [optional property]
**collectionsHeroPinId** | `String` | Hero Pin ID if this PG is promoted as a Collection |  [optional property]
**creativeType** | `CreativeType` |  |  [optional property]
**customizableCtaType** | [**CustomizableCtaTypeEnum**](#CustomizableCtaTypeEnum) | Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are SHOP_NOW, BOOK_NOW, ON_SALE, GET_DEAL, BUY_ONLINE_PICKUP_IN_STORE |  [optional property]
**definition** | `String` | The full product group definition path |  [optional property]
**gridClickType** | `GridClickType` |  |  [optional property]
**id** | `String` | ID of the product group promotion. |  [optional property]
**included** | `Boolean` | True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads. |  [optional property]
**isGenerateBackground** | `Boolean` | Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement. |  [optional property]
**isMdl** | `Boolean` | If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog |  [optional property]
**parentId** | `String` | The parent Product Group ID of this Product Group |  [optional property]
**preferredMediaType** | [**PreferredMediaTypeEnum**](#PreferredMediaTypeEnum) | Select whether to promote the image or video pin by default for items in the promoted product group. If selecting IMAGE, image will be promoted for all ads in the product group, and when selecting VIDEO, video will be promoted when present, otherwise fall back to image. This is applicable for standard shopping ads only. |  [optional property]
**relativeDefinition** | `String` | The definition of the product group, relative to its parent - an attribute name/value pair |  [optional property]
**selectedImageTag** | `String` | The ad image tag selected for the product group promotion. |  [optional property]
**selectedVideoTag** | `String` | The ad video tag selected for the product group promotion. |  [optional property]
**slideshowCollectionsDescription** | `String` | Slideshow Collections Description |  [optional property]
**slideshowCollectionsTitle** | `String` | Slideshow Collections Title |  [optional property]
**status** | `EntityStatus` |  |  [optional property]
**trackingUrl** | `String` | Tracking template for proudct group promotions. 4000 limit |  [optional property]





## CollectionsHeaderTypeEnum

Name | Value
---- | -----
SHOP_THIS_COLLECTION | `"SHOP_THIS_COLLECTION"`
EXPLORE_THIS_COLLECTION | `"EXPLORE_THIS_COLLECTION"`
NO_HEADER | `"NO_HEADER"`
ON_SALE | `"ON_SALE"`
GET_DEAL | `"GET_DEAL"`




## CustomizableCtaTypeEnum

Name | Value
---- | -----
SHOP_NOW | `"SHOP_NOW"`
BOOK_NOW | `"BOOK_NOW"`
ON_SALE | `"ON_SALE"`
GET_DEAL | `"GET_DEAL"`
BUY_ONLINE_PICKUP_IN_STORE | `"BUY_ONLINE_PICKUP_IN_STORE"`








## PreferredMediaTypeEnum

Name | Value
---- | -----
VIDEO | `"VIDEO"`
IMAGE | `"IMAGE"`









