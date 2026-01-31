# ProductGroupPromotion

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adGroupId** | **String!** | ID of the ad group the product group belongs to. | [optional] [default to null]
**bidInMicroCurrency** | **Int** | The bid in micro currency. | [optional] [default to null]
**catalogProductGroupId** | **String** | ID of the catalogs product group that this product group promotion references | [optional] [default to null]
**catalogProductGroupName** | **String** | Catalogs product group name | [optional] [default to null]
**collectionsHeaderType** | **String** | Collections ad header type | [optional] [default to null]
**collectionsHeroDestinationUrl** | **String** | Collections Hero Destination Url | [optional] [default to null]
**collectionsHeroPinId** | **String** | Hero Pin ID if this PG is promoted as a Collection | [optional] [default to null]
**creativeType** | [***CreativeType**](CreativeType.md) |  | [optional] [default to null]
**customizableCtaType** | **String** | Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are SHOP_NOW, BOOK_NOW, ON_SALE, GET_DEAL, BUY_ONLINE_PICKUP_IN_STORE | [optional] [default to null]
**definition** | **String** | The full product group definition path | [optional] [default to null]
**gridClickType** | [***GridClickType**](GridClickType.md) |  | [optional] [default to null]
**Id_** | **String!** | ID of the product group promotion. | [optional] [default to null]
**included** | **Boolean** | True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads. | [optional] [default to null]
**isGenerateBackground** | **Boolean** | Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement. | [optional] [default to null]
**isMdl** | **Boolean** | If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog | [optional] [default to null]
**parentId** | **String** | The parent Product Group ID of this Product Group | [optional] [default to null]
**preferredMediaType** | **String** | Select whether to promote the image or video pin by default for items in the promoted product group. If selecting IMAGE, image will be promoted for all ads in the product group, and when selecting VIDEO, video will be promoted when present, otherwise fall back to image. This is applicable for standard shopping ads only. | [optional] [default to null]
**relativeDefinition** | **String** | The definition of the product group, relative to its parent - an attribute name/value pair | [optional] [default to null]
**selectedImageTag** | **String** | The ad image tag selected for the product group promotion. | [optional] [default to null]
**selectedVideoTag** | **String** | The ad video tag selected for the product group promotion. | [optional] [default to null]
**slideshowCollectionsDescription** | **String** | Slideshow Collections Description | [optional] [default to null]
**slideshowCollectionsTitle** | **String** | Slideshow Collections Title | [optional] [default to null]
**status** | [***EntityStatus**](EntityStatus.md) |  | [optional] [default to null]
**trackingUrl** | **String** | Tracking template for proudct group promotions. 4000 limit | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


