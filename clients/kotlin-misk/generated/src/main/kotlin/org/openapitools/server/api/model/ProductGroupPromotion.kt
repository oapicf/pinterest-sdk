package org.openapitools.server.api.model

import org.openapitools.server.api.model.CollectionsHeaderType
import org.openapitools.server.api.model.CreativeType
import org.openapitools.server.api.model.EntityStatus
import org.openapitools.server.api.model.GridClickType
import org.openapitools.server.api.model.PreferredMediaType
import org.openapitools.server.api.model.ProductGroupPromotionCustomizableCTAType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ProductGroupPromotion(
    /** ID of the ad group the product group belongs to. */
    val adGroupId: kotlin.String? = null,
    /** The bid in micro currency. */
    val bidInMicroCurrency: kotlin.Int? = null,
    /** ID of the catalogs product group that this product group promotion references (required for create operations) */
    val catalogProductGroupId: kotlin.String? = null,
    /** Catalogs product group name */
    val catalogProductGroupName: kotlin.String? = null,
    val collectionsHeaderType: CollectionsHeaderType? = null,
    /** Collections Hero Destination Url */
    val collectionsHeroDestinationUrl: kotlin.String? = null,
    /** Hero Pin ID if this PG is promoted as a Collection */
    val collectionsHeroPinId: kotlin.String? = null,
    val creativeType: CreativeType? = null,
    val customizableCtaType: ProductGroupPromotionCustomizableCTAType? = null,
    /** The full product group definition path */
    val definition: kotlin.String? = null,
    val gridClickType: GridClickType? = null,
    /** ID of the product group promotion (required for update operations). */
    val id: kotlin.String? = null,
    /** True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads. */
    val included: kotlin.Boolean? = null,
    /** Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement. */
    val isGenerateBackground: kotlin.Boolean? = null,
    /** Set to &#x60;TRUE&#x60; to automatically resize your product images with generative AI. This ensures that images have optimal appearance for better performance. */
    val isImageAutoResizing: kotlin.Boolean? = null,
    /** If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog */
    val isMdl: kotlin.Boolean? = null,
    /** The parent Product Group ID of this Product Group */
    val parentId: kotlin.String? = null,
    val preferredMediaType: PreferredMediaType? = null,
    /** The definition of the product group, relative to its parent - an attribute name/value pair */
    val relativeDefinition: kotlin.String? = null,
    /** The ad image tag selected for the product group promotion. */
    val selectedImageTag: kotlin.String? = null,
    /** The ad video tag selected for the product group promotion. */
    val selectedVideoTag: kotlin.String? = null,
    /** Slideshow Collections Description */
    val slideshowCollectionsDescription: kotlin.String? = null,
    /** Slideshow Collections Title */
    val slideshowCollectionsTitle: kotlin.String? = null,
    val status: EntityStatus? = null,
    /** Tracking template for proudct group promotions. 4000 limit */
    val trackingUrl: kotlin.String? = null
)
