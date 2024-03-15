
package org.openapitools.client.model


case class CatalogsFeedIngestionErrors (
    /* We experienced a technical difficulty and were unable to ingest this some items. The next ingestion will happen in 24 hours. */
    _LINE_LEVEL_INTERNAL_ERROR: Option[Integer],
    /* The product count has decreased by more than 99% compared to the last successful ingestion. */
    _LARGE_PRODUCT_COUNT_DECREASE: Option[Integer],
    /* We detected an issue with your account and are not currently ingesting your items. Please review our policies at policy.pinterest.com/community-guidelines#section-spam or contact us at help.pinterest.com/contact for more information. */
    _ACCOUNT_FLAGGED: Option[Integer],
    /* We experienced a technical difficulty and were unable to download some images. The next download attempt will happen in 24 hours. */
    _IMAGE_LEVEL_INTERNAL_ERROR: Option[Integer],
    /* Image files are unreadable. Please upload new files to continue. */
    _IMAGE_FILE_NOT_ACCESSIBLE: Option[Integer],
    /* Image files are unreadable. Please check your link and upload new files to continue. */
    _IMAGE_MALFORMED_URL: Option[Integer],
    /* Image files are unreadable. Please upload new files to continue. */
    _IMAGE_FILE_NOT_FOUND: Option[Integer],
    /* Image files are unreadable. Please upload new files to continue. */
    _IMAGE_INVALID_FILE: Option[Integer]
)
object CatalogsFeedIngestionErrors {
    def toStringBody(var_LINE_LEVEL_INTERNAL_ERROR: Object, var_LARGE_PRODUCT_COUNT_DECREASE: Object, var_ACCOUNT_FLAGGED: Object, var_IMAGE_LEVEL_INTERNAL_ERROR: Object, var_IMAGE_FILE_NOT_ACCESSIBLE: Object, var_IMAGE_MALFORMED_URL: Object, var_IMAGE_FILE_NOT_FOUND: Object, var_IMAGE_INVALID_FILE: Object) =
        s"""
        | {
        | "LINE_LEVEL_INTERNAL_ERROR":$var_LINE_LEVEL_INTERNAL_ERROR,"LARGE_PRODUCT_COUNT_DECREASE":$var_LARGE_PRODUCT_COUNT_DECREASE,"ACCOUNT_FLAGGED":$var_ACCOUNT_FLAGGED,"IMAGE_LEVEL_INTERNAL_ERROR":$var_IMAGE_LEVEL_INTERNAL_ERROR,"IMAGE_FILE_NOT_ACCESSIBLE":$var_IMAGE_FILE_NOT_ACCESSIBLE,"IMAGE_MALFORMED_URL":$var_IMAGE_MALFORMED_URL,"IMAGE_FILE_NOT_FOUND":$var_IMAGE_FILE_NOT_FOUND,"IMAGE_INVALID_FILE":$var_IMAGE_INVALID_FILE
        | }
        """.stripMargin
}
