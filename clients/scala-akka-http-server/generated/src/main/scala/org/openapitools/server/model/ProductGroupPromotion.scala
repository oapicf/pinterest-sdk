package org.openapitools.server.model


/**
 * = ProductGroupPromotion =
 *
 * @param id ID of the product group promotion. for example: ''2680059592705''
 * @param adGroupId ID of the ad group the product group belongs to. for example: ''2680059592705''
 * @param bidInMicroCurrency The bid in micro currency. for example: ''14000000''
 * @param included True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads. for example: ''true''
 * @param definition The full product group definition path for example: ''*/product_type_0='kitchen'/product_type_1='beverage appliances'''
 * @param relativeDefinition The definition of the product group, relative to its parent - an attribute name/value pair for example: ''product_type_1='beverage appliances'''
 * @param parentId The parent Product Group ID of this Product Group for example: ''1231234''
 * @param slideshowCollectionsTitle Slideshow Collections Title for example: ''slideshow title''
 * @param slideshowCollectionsDescription Slideshow Collections Description for example: ''slideshow description''
 * @param isMdl If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog for example: ''true''
 * @param status  for example: ''null''
 * @param trackingUrl Tracking template for proudct group promotions. 4000 limit for example: ''https://www.pinterest.com''
 * @param catalogProductGroupId ID of the catalogs product group that this product group promotion references for example: ''1231235''
 * @param catalogProductGroupName Catalogs product group name for example: ''catalogProductGroupName''
 * @param creativeType  for example: ''null''
 * @param collectionsHeroPinId Hero Pin ID if this PG is promoted as a Collection for example: ''123123''
 * @param collectionsHeroDestinationUrl Collections Hero Destination Url for example: ''http://www.pinterest.com''
 * @param gridClickType  for example: ''null''
*/
final case class ProductGroupPromotion (
  id: Option[String] = None,
  adGroupId: Option[String] = None,
  bidInMicroCurrency: Option[Int] = None,
  included: Option[Boolean] = None,
  definition: Option[String] = None,
  relativeDefinition: Option[String] = None,
  parentId: Option[String] = None,
  slideshowCollectionsTitle: Option[String] = None,
  slideshowCollectionsDescription: Option[String] = None,
  isMdl: Option[Boolean] = None,
  status: Option[EntityStatus] = None,
  trackingUrl: Option[String] = None,
  catalogProductGroupId: Option[String] = None,
  catalogProductGroupName: Option[String] = None,
  creativeType: Option[CreativeType] = None,
  collectionsHeroPinId: Option[String] = None,
  collectionsHeroDestinationUrl: Option[String] = None,
  gridClickType: Option[GridClickType] = None
)

