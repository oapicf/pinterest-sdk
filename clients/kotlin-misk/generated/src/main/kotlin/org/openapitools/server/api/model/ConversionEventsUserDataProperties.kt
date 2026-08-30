package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ConversionEventsUserDataProperties(
    /** The unique identifier stored in _epik cookie on your domain or &amp;epik&#x3D; query parameter in the URL. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. */
    val clickId: kotlin.String? = null,
    /** The user&#39;s IP address, which can be either in IPv4 or IPv6 format. Used for matching. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA. */
    val clientIpAddress: kotlin.String? = null,
    /** The user agent string of the user&#39;s web browser. We highly recommend this for all events. It may improve reporting performance such as ROAS/CPA. */
    val clientUserAgent: kotlin.String? = null,
    /** Sha256 hashes of two-character ISO-3166 country code indicating the user&#39;s country, in lowercase. The string should be in the UTF-8 format. */
    val country: kotlin.collections.List<kotlin.String>? = null,
    /** Sha256 hashes of user&#39;s city, in lowercase, and without spaces or punctuation. User residency city (mostly billing). The string should be in the UTF-8 format. */
    val ct: kotlin.collections.List<kotlin.String>? = null,
    /** Sha256 hashes of user&#39;s date of birthday, given as year, month, and day. The string should be in the UTF-8 format. */
    val db: kotlin.collections.List<kotlin.String>? = null,
    /** Sha256 hashes of lowercase version of user&#39;s email addresses. Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. */
    val em: kotlin.collections.List<kotlin.String>? = null,
    /** Sha256 hashes of the unique id from the advertiser that identifies a user in their space, e.g. user id, loyalty id, etc. We highly recommend this on all events. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. */
    val externalId: kotlin.collections.List<kotlin.String>? = null,
    /** Sha256 hashes of user&#39;s first name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. */
    val fn: kotlin.collections.List<kotlin.String>? = null,
    /** Sha256 hashes of user&#39;s gender, in lowercase. Either \&quot;f\&quot; or \&quot;m\&quot; or \&quot;n\&quot; for non-binary gender. The string should be in the UTF-8 format. */
    val ge: kotlin.collections.List<kotlin.String>? = null,
    /** Sha256 hashes of user&#39;s \&quot;Google Advertising IDs\&quot; (GAIDs) or \&quot;Apple&#39;s Identifier for Advertisers\&quot; (IDFAs). Used for matching. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. */
    val hashedMaids: kotlin.collections.List<kotlin.String>? = null,
    /** Sha256 hashes of user&#39;s last name, in lowercase. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. */
    val ln: kotlin.collections.List<kotlin.String>? = null,
    /** A unique identifier of visitors&#39; information defined by third party partners. e.g RampID */
    val partnerId: kotlin.String? = null,
    /** Sha256 hashes of user&#39;s phone numbers, only digits with country code, area code, and number. Remove any symbols, letters, spaces and leading zeros. We highly recommend this on checkout events at least. It may improve reporting performance such as ROAS/CPA. The string should be in the UTF-8 format. */
    val ph: kotlin.collections.List<kotlin.String>? = null,
    /** Sha256 hashes of user&#39;s state, given as a two-letter code in lowercase. User residency state (mostly billing). The string should be in the UTF-8 format. */
    val st: kotlin.collections.List<kotlin.String>? = null,
    /** Sha256 hashes of user&#39;s zipcode, only digits. User residency zipcode (mostly billing). The string should be in the UTF-8 format. */
    val zp: kotlin.collections.List<kotlin.String>? = null
)
