package org.openapitools.server.model


/**
 * @param ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours. for example: ''null''
 * @param ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE Additional image files are unreadable. Please upload new files to continue. for example: ''null''
 * @param ADDITIONAL_IMAGE_MALFORMED_URL Additional image files are unreadable. Please check your link and upload new files to continue. for example: ''null''
 * @param ADDITIONAL_IMAGE_FILE_NOT_FOUND Additional image files are unreadable. Please upload new files to continue. for example: ''null''
 * @param ADDITIONAL_IMAGE_INVALID_FILE Additional image files are unreadable. Please upload new files to continue. for example: ''null''
 * @param HOTEL_PRICE_HEADER_IS_PRESENT price is not a supported column. Use base_price and sale_price instead. for example: ''null''
*/
final case class CatalogsFeedIngestionWarnings (
  ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR: Option[Int] = None,
  ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE: Option[Int] = None,
  ADDITIONAL_IMAGE_MALFORMED_URL: Option[Int] = None,
  ADDITIONAL_IMAGE_FILE_NOT_FOUND: Option[Int] = None,
  ADDITIONAL_IMAGE_INVALID_FILE: Option[Int] = None,
  HOTEL_PRICE_HEADER_IS_PRESENT: Option[Int] = None
)

