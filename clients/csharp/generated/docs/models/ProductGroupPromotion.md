# Org.OpenAPITools.Model.ProductGroupPromotion

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdGroupId** | **string** | ID of the ad group the product group belongs to. | [optional] 
**BidInMicroCurrency** | **int** | The bid in micro currency. | [optional] 
**CatalogProductGroupId** | **string** | ID of the catalogs product group that this product group promotion references | [optional] 
**CatalogProductGroupName** | **string** | Catalogs product group name | [optional] 
**CollectionsHeaderType** | **string** | Collections ad header type | [optional] 
**CollectionsHeroDestinationUrl** | **string** | Collections Hero Destination Url | [optional] 
**CollectionsHeroPinId** | **string** | Hero Pin ID if this PG is promoted as a Collection | [optional] 
**CreativeType** | **CreativeType** |  | [optional] 
**CustomizableCtaType** | **string** | Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are SHOP_NOW, BOOK_NOW, ON_SALE, GET_DEAL, BUY_ONLINE_PICKUP_IN_STORE | [optional] 
**Definition** | **string** | The full product group definition path | [optional] 
**GridClickType** | **GridClickType** |  | [optional] 
**Id** | **string** | ID of the product group promotion. | [optional] 
**Included** | **bool** | True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads. | [optional] 
**IsGenerateBackground** | **bool** | Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement. | [optional] 
**IsMdl** | **bool** | If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog | [optional] 
**ParentId** | **string** | The parent Product Group ID of this Product Group | [optional] 
**PreferredMediaType** | **string** | Select whether to promote the image or video pin by default for items in the promoted product group. If selecting IMAGE, image will be promoted for all ads in the product group, and when selecting VIDEO, video will be promoted when present, otherwise fall back to image. This is applicable for standard shopping ads only. | [optional] 
**RelativeDefinition** | **string** | The definition of the product group, relative to its parent - an attribute name/value pair | [optional] 
**SelectedImageTag** | **string** | The ad image tag selected for the product group promotion. | [optional] 
**SelectedVideoTag** | **string** | The ad video tag selected for the product group promotion. | [optional] 
**SlideshowCollectionsDescription** | **string** | Slideshow Collections Description | [optional] 
**SlideshowCollectionsTitle** | **string** | Slideshow Collections Title | [optional] 
**Status** | **EntityStatus** |  | [optional] 
**TrackingUrl** | **string** | Tracking template for proudct group promotions. 4000 limit | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

