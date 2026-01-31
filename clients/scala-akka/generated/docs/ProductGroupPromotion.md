

# ProductGroupPromotion


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adGroupId** | **String** | ID of the ad group the product group belongs to. |  [optional]
**bidInMicroCurrency** | **Int** | The bid in micro currency. |  [optional]
**catalogProductGroupId** | **String** | ID of the catalogs product group that this product group promotion references |  [optional]
**catalogProductGroupName** | **String** | Catalogs product group name |  [optional]
**collectionsHeaderType** | [**CollectionsHeaderType**](#CollectionsHeaderType) | Collections ad header type |  [optional]
**collectionsHeroDestinationUrl** | **String** | Collections Hero Destination Url |  [optional]
**collectionsHeroPinId** | **String** | Hero Pin ID if this PG is promoted as a Collection |  [optional]
**creativeType** | **CreativeType** |  |  [optional]
**customizableCtaType** | [**CustomizableCtaType**](#CustomizableCtaType) | Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are SHOP_NOW, BOOK_NOW, ON_SALE, GET_DEAL, BUY_ONLINE_PICKUP_IN_STORE |  [optional]
**definition** | **String** | The full product group definition path |  [optional]
**gridClickType** | **GridClickType** |  |  [optional]
**id** | **String** | ID of the product group promotion. |  [optional]
**included** | **Boolean** | True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads. |  [optional]
**isGenerateBackground** | **Boolean** | Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement. |  [optional]
**isMdl** | **Boolean** | If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog |  [optional]
**parentId** | **String** | The parent Product Group ID of this Product Group |  [optional]
**preferredMediaType** | [**PreferredMediaType**](#PreferredMediaType) | Select whether to promote the image or video pin by default for items in the promoted product group. If selecting IMAGE, image will be promoted for all ads in the product group, and when selecting VIDEO, video will be promoted when present, otherwise fall back to image. This is applicable for standard shopping ads only. |  [optional]
**relativeDefinition** | **String** | The definition of the product group, relative to its parent - an attribute name/value pair |  [optional]
**selectedImageTag** | **String** | The ad image tag selected for the product group promotion. |  [optional]
**selectedVideoTag** | **String** | The ad video tag selected for the product group promotion. |  [optional]
**slideshowCollectionsDescription** | **String** | Slideshow Collections Description |  [optional]
**slideshowCollectionsTitle** | **String** | Slideshow Collections Title |  [optional]
**status** | **EntityStatus** |  |  [optional]
**trackingUrl** | **String** | Tracking template for proudct group promotions. 4000 limit |  [optional]


## Enum: CollectionsHeaderType
Allowed values: [SHOP_THIS_COLLECTION, EXPLORE_THIS_COLLECTION, NO_HEADER, ON_SALE, GET_DEAL, ]



## Enum: CustomizableCtaType
Allowed values: [SHOP_NOW, BOOK_NOW, ON_SALE, GET_DEAL, BUY_ONLINE_PICKUP_IN_STORE, ]



## Enum: PreferredMediaType
Allowed values: [VIDEO, IMAGE, ]




