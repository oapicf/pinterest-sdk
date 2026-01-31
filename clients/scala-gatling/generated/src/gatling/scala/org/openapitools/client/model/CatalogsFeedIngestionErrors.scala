
package org.openapitools.client.model


case class CatalogsFeedIngestionErrors (
    /* We detected an issue with your account and are not currently ingesting your items. Please review our policies at policy.pinterest.com/community-guidelines#section-spam or contact us at help.pinterest.com/contact for more information. */
    _ACCOUNT_FLAGGED: Option[Integer],
    /* Update your Google Sheets sharing settings to 'Anyone with link' as a Viewer so that Pinterest can access your file. */
    _FETCH_GOOGLE_SHEET_NOT_SHARED: Option[Integer],
    /* Image files are unreadable. Please upload new files to continue. */
    _IMAGE_FILE_NOT_ACCESSIBLE: Option[Integer],
    /* Image files are unreadable. Please upload new files to continue. */
    _IMAGE_FILE_NOT_FOUND: Option[Integer],
    /* Image files are unreadable. Please upload new files to continue. */
    _IMAGE_INVALID_FILE: Option[Integer],
    /* We experienced a technical difficulty and were unable to download some images. The next download attempt will happen in 24 hours. */
    _IMAGE_LEVEL_INTERNAL_ERROR: Option[Integer],
    /* Image files are unreadable. Please check your link and upload new files to continue. */
    _IMAGE_MALFORMED_URL: Option[Integer],
    /* The product count has decreased by more than 99% compared to the last successful ingestion. */
    _LARGE_PRODUCT_COUNT_DECREASE: Option[Integer],
    /* We experienced a technical difficulty and were unable to ingest this some items. The next ingestion will happen in 24 hours. */
    _LINE_LEVEL_INTERNAL_ERROR: Option[Integer]
)
object CatalogsFeedIngestionErrors {
    def toStringBody(var_ACCOUNT_FLAGGED: Object, var_FETCH_GOOGLE_SHEET_NOT_SHARED: Object, var_IMAGE_FILE_NOT_ACCESSIBLE: Object, var_IMAGE_FILE_NOT_FOUND: Object, var_IMAGE_INVALID_FILE: Object, var_IMAGE_LEVEL_INTERNAL_ERROR: Object, var_IMAGE_MALFORMED_URL: Object, var_LARGE_PRODUCT_COUNT_DECREASE: Object, var_LINE_LEVEL_INTERNAL_ERROR: Object) =
        s"""
        | {
        | "ACCOUNT_FLAGGED":$var_ACCOUNT_FLAGGED,"FETCH_GOOGLE_SHEET_NOT_SHARED":$var_FETCH_GOOGLE_SHEET_NOT_SHARED,"IMAGE_FILE_NOT_ACCESSIBLE":$var_IMAGE_FILE_NOT_ACCESSIBLE,"IMAGE_FILE_NOT_FOUND":$var_IMAGE_FILE_NOT_FOUND,"IMAGE_INVALID_FILE":$var_IMAGE_INVALID_FILE,"IMAGE_LEVEL_INTERNAL_ERROR":$var_IMAGE_LEVEL_INTERNAL_ERROR,"IMAGE_MALFORMED_URL":$var_IMAGE_MALFORMED_URL,"LARGE_PRODUCT_COUNT_DECREASE":$var_LARGE_PRODUCT_COUNT_DECREASE,"LINE_LEVEL_INTERNAL_ERROR":$var_LINE_LEVEL_INTERNAL_ERROR
        | }
        """.stripMargin
}
