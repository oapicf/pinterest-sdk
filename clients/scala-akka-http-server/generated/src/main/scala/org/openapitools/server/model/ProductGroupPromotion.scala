package org.openapitools.server.model


/**
 * @param adGroupId ID of the ad group the product group belongs to. for example: ''2680059592705''
 * @param bidInMicroCurrency The bid in micro currency. for example: ''14000000''
 * @param catalogProductGroupId ID of the catalogs product group that this product group promotion references (required for create operations) for example: ''1231235''
 * @param catalogProductGroupName Catalogs product group name for example: ''catalogProductGroupName''
 * @param collectionsHeaderType  for example: ''null''
 * @param collectionsHeroDestinationUrl Collections Hero Destination Url for example: ''http://www.pinterest.com''
 * @param collectionsHeroPinId Hero Pin ID if this PG is promoted as a Collection for example: ''123123''
 * @param creativeType  for example: ''null''
 * @param customizableCtaType  for example: ''null''
 * @param definition The full product group definition path for example: ''*/product_type_0='kitchen'/product_type_1='beverage appliances'''
 * @param gridClickType  for example: ''null''
 * @param id ID of the product group promotion (required for update operations). for example: ''2680059592705''
 * @param included True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads. for example: ''true''
 * @param isGenerateBackground Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement. for example: ''true''
 * @param isImageAutoResizing Set to `TRUE` to automatically resize your product images with generative AI. This ensures that images have optimal appearance for better performance. for example: ''true''
 * @param isMdl If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog for example: ''true''
 * @param parentId The parent Product Group ID of this Product Group for example: ''1231234''
 * @param preferredMediaType  for example: ''null''
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
  collectionsHeaderType: Option[CollectionsHeaderType] = None,
  collectionsHeroDestinationUrl: Option[String] = None,
  collectionsHeroPinId: Option[String] = None,
  creativeType: Option[CreativeType] = None,
  customizableCtaType: Option[ProductGroupPromotionCustomizableCTAType] = None,
  definition: Option[String] = None,
  gridClickType: Option[GridClickType] = None,
  id: Option[String] = None,
  included: Option[Boolean] = None,
  isGenerateBackground: Option[Boolean] = None,
  isImageAutoResizing: Option[Boolean] = None,
  isMdl: Option[Boolean] = None,
  parentId: Option[String] = None,
  preferredMediaType: Option[PreferredMediaType] = None,
  relativeDefinition: Option[String] = None,
  selectedImageTag: Option[String] = None,
  selectedVideoTag: Option[String] = None,
  slideshowCollectionsDescription: Option[String] = None,
  slideshowCollectionsTitle: Option[String] = None,
  status: Option[EntityStatus] = None,
  trackingUrl: Option[String] = None
)

