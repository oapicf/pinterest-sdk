package org.openapitools.server.model


/**
 * @param ACCOUNT_FLAGGED We detected an issue with your account and are not currently ingesting your items. Please review our policies at policy.pinterest.com/community-guidelines#section-spam or contact us at help.pinterest.com/contact for more information. for example: ''null''
 * @param FETCH_GOOGLE_SHEET_NOT_SHARED Update your Google Sheets sharing settings to 'Anyone with link' as a Viewer so that Pinterest can access your file. for example: ''null''
 * @param IMAGE_FILE_NOT_ACCESSIBLE Image files are unreadable. Please upload new files to continue. for example: ''null''
 * @param IMAGE_FILE_NOT_FOUND Image files are unreadable. Please upload new files to continue. for example: ''null''
 * @param IMAGE_INVALID_FILE Image files are unreadable. Please upload new files to continue. for example: ''null''
 * @param IMAGE_LEVEL_INTERNAL_ERROR We experienced a technical difficulty and were unable to download some images. The next download attempt will happen in 24 hours. for example: ''null''
 * @param IMAGE_MALFORMED_URL Image files are unreadable. Please check your link and upload new files to continue. for example: ''null''
 * @param LARGE_PRODUCT_COUNT_DECREASE The product count has decreased by more than 99% compared to the last successful ingestion. for example: ''null''
 * @param LINE_LEVEL_INTERNAL_ERROR We experienced a technical difficulty and were unable to ingest this some items. The next ingestion will happen in 24 hours. for example: ''null''
*/
final case class CatalogsFeedIngestionErrors (
  ACCOUNT_FLAGGED: Option[Int] = None,
  FETCH_GOOGLE_SHEET_NOT_SHARED: Option[Int] = None,
  IMAGE_FILE_NOT_ACCESSIBLE: Option[Int] = None,
  IMAGE_FILE_NOT_FOUND: Option[Int] = None,
  IMAGE_INVALID_FILE: Option[Int] = None,
  IMAGE_LEVEL_INTERNAL_ERROR: Option[Int] = None,
  IMAGE_MALFORMED_URL: Option[Int] = None,
  LARGE_PRODUCT_COUNT_DECREASE: Option[Int] = None,
  LINE_LEVEL_INTERNAL_ERROR: Option[Int] = None
)

