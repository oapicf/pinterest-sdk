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
 * @param id ID of the product group promotion.
 * @param adUnderscoregroupUnderscoreid ID of the ad group the product group belongs to.
 * @param bidUnderscoreinUnderscoremicroUnderscorecurrency The bid in micro currency.
 * @param included True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.
 * @param definition The full product group definition path
 * @param relativeUnderscoredefinition The definition of the product group, relative to its parent - an attribute name/value pair
 * @param parentUnderscoreid The parent Product Group ID of this Product Group
 * @param slideshowUnderscorecollectionsUnderscoretitle Slideshow Collections Title
 * @param slideshowUnderscorecollectionsUnderscoredescription Slideshow Collections Description
 * @param isUnderscoremdl If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog
 * @param status 
 * @param trackingUnderscoreurl Tracking template for proudct group promotions. 4000 limit
 * @param catalogUnderscoreproductUnderscoregroupUnderscoreid ID of the catalogs product group that this product group promotion references
 * @param catalogUnderscoreproductUnderscoregroupUnderscorename Catalogs product group name
 * @param collectionsUnderscoreheroUnderscorepinUnderscoreid Hero Pin ID if this PG is promoted as a Collection
 * @param collectionsUnderscoreheroUnderscoredestinationUnderscoreurl Collections Hero Destination Url
 * @param gridUnderscoreclickUnderscoretype 
 * @param creativeUnderscoretype 
 */
case class ProductGroupPromotionResponseElement(id: Option[String],
                adUnderscoregroupUnderscoreid: Option[String],
                bidUnderscoreinUnderscoremicroUnderscorecurrency: Option[Int],
                included: Option[Boolean],
                definition: Option[String],
                relativeUnderscoredefinition: Option[String],
                parentUnderscoreid: Option[String],
                slideshowUnderscorecollectionsUnderscoretitle: Option[String],
                slideshowUnderscorecollectionsUnderscoredescription: Option[String],
                isUnderscoremdl: Option[Boolean],
                status: Option[EntityStatus],
                trackingUnderscoreurl: Option[String],
                catalogUnderscoreproductUnderscoregroupUnderscoreid: Option[String],
                catalogUnderscoreproductUnderscoregroupUnderscorename: Option[String],
                collectionsUnderscoreheroUnderscorepinUnderscoreid: Option[String],
                collectionsUnderscoreheroUnderscoredestinationUnderscoreurl: Option[String],
                gridUnderscoreclickUnderscoretype: Option[GridClickType],
                creativeUnderscoretype: Option[CreativeType]
                )

object ProductGroupPromotionResponseElement {
    /**
     * Creates the codec for converting ProductGroupPromotionResponseElement from and to JSON.
     */
    implicit val decoder: Decoder[ProductGroupPromotionResponseElement] = deriveDecoder
    implicit val encoder: ObjectEncoder[ProductGroupPromotionResponseElement] = deriveEncoder
}
