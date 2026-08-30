package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ProductGroupPromotion.
  * @param adGroupId ID of the ad group the product group belongs to.
  * @param bidInMicroCurrency The bid in micro currency.
  * @param catalogProductGroupId ID of the catalogs product group that this product group promotion references (required for create operations)
  * @param catalogProductGroupName Catalogs product group name
  * @param collectionsHeroDestinationUrl Collections Hero Destination Url
  * @param collectionsHeroPinId Hero Pin ID if this PG is promoted as a Collection
  * @param definition The full product group definition path
  * @param id ID of the product group promotion (required for update operations).
  * @param included True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.
  * @param isGenerateBackground Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement.
  * @param isImageAutoResizing Set to `TRUE` to automatically resize your product images with generative AI. This ensures that images have optimal appearance for better performance.
  * @param isMdl If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog
  * @param parentId The parent Product Group ID of this Product Group
  * @param relativeDefinition The definition of the product group, relative to its parent - an attribute name/value pair
  * @param selectedImageTag The ad image tag selected for the product group promotion.
  * @param selectedVideoTag The ad video tag selected for the product group promotion.
  * @param slideshowCollectionsDescription Slideshow Collections Description
  * @param slideshowCollectionsTitle Slideshow Collections Title
  * @param trackingUrl Tracking template for proudct group promotions. 4000 limit
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ProductGroupPromotion(
  adGroupId: Option[String],
  bidInMicroCurrency: Option[Int],
  catalogProductGroupId: Option[String],
  catalogProductGroupName: Option[String],
  collectionsHeaderType: Option[CollectionsHeaderType],
  collectionsHeroDestinationUrl: Option[String],
  collectionsHeroPinId: Option[String],
  creativeType: Option[CreativeType],
  customizableCtaType: Option[ProductGroupPromotionCustomizableCTAType],
  definition: Option[String],
  gridClickType: Option[GridClickType],
  id: Option[String],
  included: Option[Boolean],
  isGenerateBackground: Option[Boolean],
  isImageAutoResizing: Option[Boolean],
  isMdl: Option[Boolean],
  parentId: Option[String],
  preferredMediaType: Option[PreferredMediaType],
  relativeDefinition: Option[String],
  selectedImageTag: Option[String],
  selectedVideoTag: Option[String],
  slideshowCollectionsDescription: Option[String],
  slideshowCollectionsTitle: Option[String],
  status: Option[EntityStatus],
  trackingUrl: Option[String]
)

object ProductGroupPromotion {
  implicit lazy val productGroupPromotionJsonFormat: Format[ProductGroupPromotion] = Json.format[ProductGroupPromotion]
}

