
# ProductGroupPromotion

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **adGroupId** | **kotlin.String** | ID of the ad group the product group belongs to. |  [optional] |
| **bidInMicroCurrency** | **kotlin.Int** | The bid in micro currency. |  [optional] |
| **catalogProductGroupId** | **kotlin.String** | ID of the catalogs product group that this product group promotion references |  [optional] |
| **catalogProductGroupName** | **kotlin.String** | Catalogs product group name |  [optional] |
| **collectionsHeaderType** | [**inline**](#CollectionsHeaderType) | Collections ad header type |  [optional] |
| **collectionsHeroDestinationUrl** | **kotlin.String** | Collections Hero Destination Url |  [optional] |
| **collectionsHeroPinId** | **kotlin.String** | Hero Pin ID if this PG is promoted as a Collection |  [optional] |
| **creativeType** | [**CreativeType**](CreativeType.md) |  |  [optional] |
| **customizableCtaType** | [**inline**](#CustomizableCtaType) | Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are SHOP_NOW, BOOK_NOW, ON_SALE, GET_DEAL, BUY_ONLINE_PICKUP_IN_STORE |  [optional] |
| **definition** | **kotlin.String** | The full product group definition path |  [optional] |
| **gridClickType** | [**GridClickType**](GridClickType.md) |  |  [optional] |
| **id** | **kotlin.String** | ID of the product group promotion. |  [optional] |
| **included** | **kotlin.Boolean** | True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads. |  [optional] |
| **isGenerateBackground** | **kotlin.Boolean** | Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement. |  [optional] |
| **isMdl** | **kotlin.Boolean** | If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog |  [optional] |
| **parentId** | **kotlin.String** | The parent Product Group ID of this Product Group |  [optional] |
| **preferredMediaType** | [**inline**](#PreferredMediaType) | Select whether to promote the image or video pin by default for items in the promoted product group. If selecting IMAGE, image will be promoted for all ads in the product group, and when selecting VIDEO, video will be promoted when present, otherwise fall back to image. This is applicable for standard shopping ads only. |  [optional] |
| **relativeDefinition** | **kotlin.String** | The definition of the product group, relative to its parent - an attribute name/value pair |  [optional] |
| **selectedImageTag** | **kotlin.String** | The ad image tag selected for the product group promotion. |  [optional] |
| **selectedVideoTag** | **kotlin.String** | The ad video tag selected for the product group promotion. |  [optional] |
| **slideshowCollectionsDescription** | **kotlin.String** | Slideshow Collections Description |  [optional] |
| **slideshowCollectionsTitle** | **kotlin.String** | Slideshow Collections Title |  [optional] |
| **status** | [**EntityStatus**](EntityStatus.md) |  |  [optional] |
| **trackingUrl** | **kotlin.String** | Tracking template for proudct group promotions. 4000 limit |  [optional] |


<a id="CollectionsHeaderType"></a>
## Enum: collections_header_type
| Name | Value |
| ---- | ----- |
| collectionsHeaderType | SHOP_THIS_COLLECTION, EXPLORE_THIS_COLLECTION, NO_HEADER, ON_SALE, GET_DEAL,  |


<a id="CustomizableCtaType"></a>
## Enum: customizable_cta_type
| Name | Value |
| ---- | ----- |
| customizableCtaType | SHOP_NOW, BOOK_NOW, ON_SALE, GET_DEAL, BUY_ONLINE_PICKUP_IN_STORE,  |


<a id="PreferredMediaType"></a>
## Enum: preferred_media_type
| Name | Value |
| ---- | ----- |
| preferredMediaType | VIDEO, IMAGE,  |



