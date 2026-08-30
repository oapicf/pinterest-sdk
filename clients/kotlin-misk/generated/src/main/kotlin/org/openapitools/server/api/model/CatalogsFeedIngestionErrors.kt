package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsFeedIngestionErrors(
    /** We detected an issue with your account and are not currently ingesting your items. Please review our policies at policy.pinterest.com/community-guidelines#section-spam or contact us at help.pinterest.com/contact for more information. */
    val ACCOUNT_FLAGGED: kotlin.Int? = null,
    /** Update your Google Sheets sharing settings to &#39;Anyone with link&#39; as a Viewer so that Pinterest can access your file. */
    val FETCH_GOOGLE_SHEET_NOT_SHARED: kotlin.Int? = null,
    /** Image files are unreadable. Please upload new files to continue. */
    val IMAGE_FILE_NOT_ACCESSIBLE: kotlin.Int? = null,
    /** Image files are unreadable. Please upload new files to continue. */
    val IMAGE_FILE_NOT_FOUND: kotlin.Int? = null,
    /** Image files are unreadable. Please upload new files to continue. */
    val IMAGE_INVALID_FILE: kotlin.Int? = null,
    /** We experienced a technical difficulty and were unable to download some images. The next download attempt will happen in 24 hours. */
    val IMAGE_LEVEL_INTERNAL_ERROR: kotlin.Int? = null,
    /** Image files are unreadable. Please check your link and upload new files to continue. */
    val IMAGE_MALFORMED_URL: kotlin.Int? = null,
    /** The product count has decreased by more than 99% compared to the last successful ingestion. */
    val LARGE_PRODUCT_COUNT_DECREASE: kotlin.Int? = null,
    /** We experienced a technical difficulty and were unable to ingest this some items. The next ingestion will happen in 24 hours. */
    val LINE_LEVEL_INTERNAL_ERROR: kotlin.Int? = null
)
