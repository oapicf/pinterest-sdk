
package org.openapitools.client.model


case class CatalogsFeedIngestionWarnings (
    /* We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours. */
    _ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR: Option[Integer],
    /* Additional image files are unreadable. Please upload new files to continue. */
    _ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE: Option[Integer],
    /* Additional image files are unreadable. Please check your link and upload new files to continue. */
    _ADDITIONAL_IMAGE_MALFORMED_URL: Option[Integer],
    /* Additional image files are unreadable. Please upload new files to continue. */
    _ADDITIONAL_IMAGE_FILE_NOT_FOUND: Option[Integer],
    /* Additional image files are unreadable. Please upload new files to continue. */
    _ADDITIONAL_IMAGE_INVALID_FILE: Option[Integer],
    /* price is not a supported column. Use base_price and sale_price instead. */
    _HOTEL_PRICE_HEADER_IS_PRESENT: Option[Integer]
)
object CatalogsFeedIngestionWarnings {
    def toStringBody(var_ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR: Object, var_ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE: Object, var_ADDITIONAL_IMAGE_MALFORMED_URL: Object, var_ADDITIONAL_IMAGE_FILE_NOT_FOUND: Object, var_ADDITIONAL_IMAGE_INVALID_FILE: Object, var_HOTEL_PRICE_HEADER_IS_PRESENT: Object) =
        s"""
        | {
        | "ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR":$var_ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR,"ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE":$var_ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE,"ADDITIONAL_IMAGE_MALFORMED_URL":$var_ADDITIONAL_IMAGE_MALFORMED_URL,"ADDITIONAL_IMAGE_FILE_NOT_FOUND":$var_ADDITIONAL_IMAGE_FILE_NOT_FOUND,"ADDITIONAL_IMAGE_INVALID_FILE":$var_ADDITIONAL_IMAGE_INVALID_FILE,"HOTEL_PRICE_HEADER_IS_PRESENT":$var_HOTEL_PRICE_HEADER_IS_PRESENT
        | }
        """.stripMargin
}
