package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CreativeType
import org.openapitools.models.EntityStatus
import org.openapitools.models.GridClickType

/**
 * 
 * @param adUnderscoregroupUnderscoreid ID of the ad group the product group belongs to.
 * @param bidUnderscoreinUnderscoremicroUnderscorecurrency The bid in micro currency.
 * @param catalogUnderscoreproductUnderscoregroupUnderscoreid ID of the catalogs product group that this product group promotion references
 * @param catalogUnderscoreproductUnderscoregroupUnderscorename Catalogs product group name
 * @param collectionsUnderscoreheaderUnderscoretype Collections ad header type
 * @param collectionsUnderscoreheroUnderscoredestinationUnderscoreurl Collections Hero Destination Url
 * @param collectionsUnderscoreheroUnderscorepinUnderscoreid Hero Pin ID if this PG is promoted as a Collection
 * @param creativeUnderscoretype 
 * @param customizableUnderscorectaUnderscoretype Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are SHOP_NOW, BOOK_NOW, ON_SALE, GET_DEAL, BUY_ONLINE_PICKUP_IN_STORE
 * @param definition The full product group definition path
 * @param gridUnderscoreclickUnderscoretype 
 * @param id ID of the product group promotion.
 * @param included True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.
 * @param isUnderscoregenerateUnderscorebackground Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement.
 * @param isUnderscoremdl If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog
 * @param parentUnderscoreid The parent Product Group ID of this Product Group
 * @param preferredUnderscoremediaUnderscoretype Select whether to promote the image or video pin by default for items in the promoted product group. If selecting IMAGE, image will be promoted for all ads in the product group, and when selecting VIDEO, video will be promoted when present, otherwise fall back to image. This is applicable for standard shopping ads only.
 * @param relativeUnderscoredefinition The definition of the product group, relative to its parent - an attribute name/value pair
 * @param selectedUnderscoreimageUnderscoretag The ad image tag selected for the product group promotion.
 * @param selectedUnderscorevideoUnderscoretag The ad video tag selected for the product group promotion.
 * @param slideshowUnderscorecollectionsUnderscoredescription Slideshow Collections Description
 * @param slideshowUnderscorecollectionsUnderscoretitle Slideshow Collections Title
 * @param status 
 * @param trackingUnderscoreurl Tracking template for proudct group promotions. 4000 limit
 */
case class ProductGroupPromotion(adUnderscoregroupUnderscoreid: Option[String],
                bidUnderscoreinUnderscoremicroUnderscorecurrency: Option[Int],
                catalogUnderscoreproductUnderscoregroupUnderscoreid: Option[String],
                catalogUnderscoreproductUnderscoregroupUnderscorename: Option[String],
                collectionsUnderscoreheaderUnderscoretype: Option[String],
                collectionsUnderscoreheroUnderscoredestinationUnderscoreurl: Option[String],
                collectionsUnderscoreheroUnderscorepinUnderscoreid: Option[String],
                creativeUnderscoretype: Option[CreativeType],
                customizableUnderscorectaUnderscoretype: Option[String],
                definition: Option[String],
                gridUnderscoreclickUnderscoretype: Option[GridClickType],
                id: Option[String],
                included: Option[Boolean],
                isUnderscoregenerateUnderscorebackground: Option[Boolean],
                isUnderscoremdl: Option[Boolean],
                parentUnderscoreid: Option[String],
                preferredUnderscoremediaUnderscoretype: Option[String],
                relativeUnderscoredefinition: Option[String],
                selectedUnderscoreimageUnderscoretag: Option[String],
                selectedUnderscorevideoUnderscoretag: Option[String],
                slideshowUnderscorecollectionsUnderscoredescription: Option[String],
                slideshowUnderscorecollectionsUnderscoretitle: Option[String],
                status: Option[EntityStatus],
                trackingUnderscoreurl: Option[String]
                )

object ProductGroupPromotion {
    /**
     * Creates the codec for converting ProductGroupPromotion from and to JSON.
     */
    implicit val decoder: Decoder[ProductGroupPromotion] = deriveDecoder
    implicit val encoder: ObjectEncoder[ProductGroupPromotion] = deriveEncoder
}
