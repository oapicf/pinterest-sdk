package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ProductGroupPromotion.
  * @param adGroupId ID of the ad group the product group belongs to.
  * @param bidInMicroCurrency The bid in micro currency.
  * @param catalogProductGroupId ID of the catalogs product group that this product group promotion references
  * @param catalogProductGroupName Catalogs product group name
  * @param collectionsHeaderType Collections ad header type
  * @param collectionsHeroDestinationUrl Collections Hero Destination Url
  * @param collectionsHeroPinId Hero Pin ID if this PG is promoted as a Collection
  * @param customizableCtaType Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are SHOP_NOW, BOOK_NOW, ON_SALE, GET_DEAL, BUY_ONLINE_PICKUP_IN_STORE
  * @param definition The full product group definition path
  * @param id ID of the product group promotion.
  * @param included True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.
  * @param isGenerateBackground Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement.
  * @param isMdl If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog
  * @param parentId The parent Product Group ID of this Product Group
  * @param preferredMediaType Select whether to promote the image or video pin by default for items in the promoted product group. If selecting IMAGE, image will be promoted for all ads in the product group, and when selecting VIDEO, video will be promoted when present, otherwise fall back to image. This is applicable for standard shopping ads only.
  * @param relativeDefinition The definition of the product group, relative to its parent - an attribute name/value pair
  * @param selectedImageTag The ad image tag selected for the product group promotion.
  * @param selectedVideoTag The ad video tag selected for the product group promotion.
  * @param slideshowCollectionsDescription Slideshow Collections Description
  * @param slideshowCollectionsTitle Slideshow Collections Title
  * @param trackingUrl Tracking template for proudct group promotions. 4000 limit
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ProductGroupPromotion(
  adGroupId: Option[String],
  bidInMicroCurrency: Option[Int],
  catalogProductGroupId: Option[String],
  catalogProductGroupName: Option[String],
  collectionsHeaderType: Option[ProductGroupPromotion.CollectionsHeaderType.Value],
  collectionsHeroDestinationUrl: Option[String],
  collectionsHeroPinId: Option[String],
  creativeType: Option[CreativeType],
  customizableCtaType: Option[ProductGroupPromotion.CustomizableCtaType.Value],
  definition: Option[String],
  gridClickType: Option[GridClickType],
  id: Option[String],
  included: Option[Boolean],
  isGenerateBackground: Option[Boolean],
  isMdl: Option[Boolean],
  parentId: Option[String],
  preferredMediaType: Option[ProductGroupPromotion.PreferredMediaType.Value],
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

  // noinspection TypeAnnotation
  object CollectionsHeaderType extends Enumeration {
    val SHOPTHISCOLLECTION = Value("SHOP_THIS_COLLECTION")
    val EXPLORETHISCOLLECTION = Value("EXPLORE_THIS_COLLECTION")
    val NOHEADER = Value("NO_HEADER")
    val ONSALE = Value("ON_SALE")
    val GETDEAL = Value("GET_DEAL")

    type CollectionsHeaderType = Value
    implicit lazy val CollectionsHeaderTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object CustomizableCtaType extends Enumeration {
    val SHOPNOW = Value("SHOP_NOW")
    val BOOKNOW = Value("BOOK_NOW")
    val ONSALE = Value("ON_SALE")
    val GETDEAL = Value("GET_DEAL")
    val BUYONLINEPICKUPINSTORE = Value("BUY_ONLINE_PICKUP_IN_STORE")

    type CustomizableCtaType = Value
    implicit lazy val CustomizableCtaTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object PreferredMediaType extends Enumeration {
    val VIDEO = Value("VIDEO")
    val IMAGE = Value("IMAGE")

    type PreferredMediaType = Value
    implicit lazy val PreferredMediaTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

