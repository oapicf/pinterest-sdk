package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsFeedIngestionErrors.
  * @param ACCOUNT_FLAGGED We detected an issue with your account and are not currently ingesting your items. Please review our policies at policy.pinterest.com/community-guidelines#section-spam or contact us at help.pinterest.com/contact for more information.
  * @param FETCH_GOOGLE_SHEET_NOT_SHARED Update your Google Sheets sharing settings to 'Anyone with link' as a Viewer so that Pinterest can access your file.
  * @param IMAGE_FILE_NOT_ACCESSIBLE Image files are unreadable. Please upload new files to continue.
  * @param IMAGE_FILE_NOT_FOUND Image files are unreadable. Please upload new files to continue.
  * @param IMAGE_INVALID_FILE Image files are unreadable. Please upload new files to continue.
  * @param IMAGE_LEVEL_INTERNAL_ERROR We experienced a technical difficulty and were unable to download some images. The next download attempt will happen in 24 hours.
  * @param IMAGE_MALFORMED_URL Image files are unreadable. Please check your link and upload new files to continue.
  * @param LARGE_PRODUCT_COUNT_DECREASE The product count has decreased by more than 99% compared to the last successful ingestion.
  * @param LINE_LEVEL_INTERNAL_ERROR We experienced a technical difficulty and were unable to ingest this some items. The next ingestion will happen in 24 hours.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsFeedIngestionErrors(
  ACCOUNT_FLAGGED: Option[Int],
  FETCH_GOOGLE_SHEET_NOT_SHARED: Option[Int],
  IMAGE_FILE_NOT_ACCESSIBLE: Option[Int],
  IMAGE_FILE_NOT_FOUND: Option[Int],
  IMAGE_INVALID_FILE: Option[Int],
  IMAGE_LEVEL_INTERNAL_ERROR: Option[Int],
  IMAGE_MALFORMED_URL: Option[Int],
  LARGE_PRODUCT_COUNT_DECREASE: Option[Int],
  LINE_LEVEL_INTERNAL_ERROR: Option[Int]
)

object CatalogsFeedIngestionErrors {
  implicit lazy val catalogsFeedIngestionErrorsJsonFormat: Format[CatalogsFeedIngestionErrors] = Json.format[CatalogsFeedIngestionErrors]
}

