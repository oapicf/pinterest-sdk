package org.openapitools.server.model


/**
 * = ProductGroupPromotion =
 *
 * @param adGroupId ID of the ad group the product group belongs to. for example: ''2680059592705''
 * @param bidInMicroCurrency The bid in micro currency. for example: ''14000000''
 * @param catalogProductGroupId ID of the catalogs product group that this product group promotion references for example: ''1231235''
 * @param catalogProductGroupName Catalogs product group name for example: ''catalogProductGroupName''
 * @param collectionsHeaderType Collections ad header type for example: ''SHOP_THIS_COLLECTION''
 * @param collectionsHeroDestinationUrl Collections Hero Destination Url for example: ''http://www.pinterest.com''
 * @param collectionsHeroPinId Hero Pin ID if this PG is promoted as a Collection for example: ''123123''
 * @param creativeType  for example: ''null''
 * @param customizableCtaType Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are SHOP_NOW, BOOK_NOW, ON_SALE, GET_DEAL, BUY_ONLINE_PICKUP_IN_STORE for example: ''SHOP_NOW''
 * @param definition The full product group definition path for example: ''*/product_type_0='kitchen'/product_type_1='beverage appliances'''
 * @param gridClickType  for example: ''null''
 * @param id ID of the product group promotion. for example: ''2680059592705''
 * @param included True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads. for example: ''true''
 * @param isGenerateBackground Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement. for example: ''true''
 * @param isMdl If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog for example: ''true''
 * @param parentId The parent Product Group ID of this Product Group for example: ''1231234''
 * @param preferredMediaType Select whether to promote the image or video pin by default for items in the promoted product group. If selecting IMAGE, image will be promoted for all ads in the product group, and when selecting VIDEO, video will be promoted when present, otherwise fall back to image. This is applicable for standard shopping ads only. for example: ''VIDEO''
 * @param relativeDefinition The definition of the product group, relative to its parent - an attribute name/value pair for example: ''product_type_1='beverage appliances'''
 * @param selectedImageTag The ad image tag selected for the product group promotion. for example: ''holiday_sale''
 * @param selectedVideoTag The ad video tag selected for the product group promotion. for example: ''holiday_sale''
 * @param slideshowCollectionsDescription Slideshow Collections Description for example: ''slideshow description''
 * @param slideshowCollectionsTitle Slideshow Collections Title for example: ''slideshow title''
 * @param status  for example: ''null''
 * @param trackingUrl Tracking template for proudct group promotions. 4000 limit for example: ''https://www.pinterest.com''
*/
final case class ProductGroupPromotion (
  adGroupId: Option[String] = None,
  bidInMicroCurrency: Option[Int] = None,
  catalogProductGroupId: Option[String] = None,
  catalogProductGroupName: Option[String] = None,
  collectionsHeaderType: Option[String] = None,
  collectionsHeroDestinationUrl: Option[String] = None,
  collectionsHeroPinId: Option[String] = None,
  creativeType: Option[CreativeType] = None,
  customizableCtaType: Option[String] = None,
  definition: Option[String] = None,
  gridClickType: Option[GridClickType] = None,
  id: Option[String] = None,
  included: Option[Boolean] = None,
  isGenerateBackground: Option[Boolean] = None,
  isMdl: Option[Boolean] = None,
  parentId: Option[String] = None,
  preferredMediaType: Option[String] = None,
  relativeDefinition: Option[String] = None,
  selectedImageTag: Option[String] = None,
  selectedVideoTag: Option[String] = None,
  slideshowCollectionsDescription: Option[String] = None,
  slideshowCollectionsTitle: Option[String] = None,
  status: Option[EntityStatus] = None,
  trackingUrl: Option[String] = None
)

