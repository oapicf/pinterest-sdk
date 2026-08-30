package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsAiContentDisclosure
import org.openapitools.server.api.model.CatalogsHotelAddress
import org.openapitools.server.api.model.CatalogsHotelGuestRatings
import org.openapitools.server.api.model.CatalogsHotelMainImage
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsHotelAttributes(
    /** Hotel address */
    val address: CatalogsHotelAddress? = null,
    /** Base price of the hotel room per night followed by the ISO currency code */
    val basePrice: kotlin.String? = null,
    /** The brand to which this hotel belongs to. */
    val brand: kotlin.String? = null,
    /** The type of property. The category can be any type of internal description desired. */
    val category: kotlin.String? = null,
    /** Custom grouping of hotels */
    val customLabel0: kotlin.String? = null,
    /** Custom grouping of hotels */
    val customLabel1: kotlin.String? = null,
    /** Custom grouping of hotels */
    val customLabel2: kotlin.String? = null,
    /** Custom grouping of hotels */
    val customLabel3: kotlin.String? = null,
    /** Custom grouping of hotels */
    val customLabel4: kotlin.String? = null,
    /** Brief description of the hotel. */
    val description: kotlin.String? = null,
    /** If specified, you must provide all properties */
    val guestRatings: CatalogsHotelGuestRatings? = null,
    /** Latitude of the hotel. */
    val latitude: java.math.BigDecimal? = null,
    /** Link to the product page */
    val link: kotlin.String? = null,
    /** Longitude of the hotel. */
    val longitude: java.math.BigDecimal? = null,
    /** The hotel&#39;s name. */
    val name: kotlin.String? = null,
    /** A list of neighborhoods where the hotel is located */
    val neighborhood: kotlin.collections.List<kotlin.String>? = null,
    /** Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel. */
    val salePrice: kotlin.String? = null,
    /** &lt;&#x3D; 2000 characters. The links to additional images for your hotel. Up to ten additional images can be used to show a hotel from different angles. Must begin with http:// or https://. */
    val additionalImageLink: kotlin.collections.List<kotlin.String>? = null,
    /** AI content disclosures for individual assets (main_image.link or additional_image_link) on this hotel item. Each entry declares which disclosure types apply to a single asset URL. */
    val aiDisclosures: kotlin.collections.List<CatalogsAiContentDisclosure>? = null,
    /** The main hotel image */
    val mainImage: CatalogsHotelMainImage? = null
)
