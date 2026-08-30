package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsFeedIngestionErrors._

case class CatalogsFeedIngestionErrors (
  /* We detected an issue with your account and are not currently ingesting your items. Please review our policies at policy.pinterest.com/community-guidelines#section-spam or contact us at help.pinterest.com/contact for more information. */
  ACCOUNT_FLAGGED: Option[Integer],
/* Update your Google Sheets sharing settings to 'Anyone with link' as a Viewer so that Pinterest can access your file. */
  FETCH_GOOGLE_SHEET_NOT_SHARED: Option[Integer],
/* Image files are unreadable. Please upload new files to continue. */
  IMAGE_FILE_NOT_ACCESSIBLE: Option[Integer],
/* Image files are unreadable. Please upload new files to continue. */
  IMAGE_FILE_NOT_FOUND: Option[Integer],
/* Image files are unreadable. Please upload new files to continue. */
  IMAGE_INVALID_FILE: Option[Integer],
/* We experienced a technical difficulty and were unable to download some images. The next download attempt will happen in 24 hours. */
  IMAGE_LEVEL_INTERNAL_ERROR: Option[Integer],
/* Image files are unreadable. Please check your link and upload new files to continue. */
  IMAGE_MALFORMED_URL: Option[Integer],
/* The product count has decreased by more than 99% compared to the last successful ingestion. */
  LARGE_PRODUCT_COUNT_DECREASE: Option[Integer],
/* We experienced a technical difficulty and were unable to ingest this some items. The next ingestion will happen in 24 hours. */
  LINE_LEVEL_INTERNAL_ERROR: Option[Integer])

object CatalogsFeedIngestionErrors {
  import DateTimeCodecs._

  implicit val CatalogsFeedIngestionErrorsCodecJson: CodecJson[CatalogsFeedIngestionErrors] = CodecJson.derive[CatalogsFeedIngestionErrors]
  implicit val CatalogsFeedIngestionErrorsDecoder: EntityDecoder[CatalogsFeedIngestionErrors] = jsonOf[CatalogsFeedIngestionErrors]
  implicit val CatalogsFeedIngestionErrorsEncoder: EntityEncoder[CatalogsFeedIngestionErrors] = jsonEncoderOf[CatalogsFeedIngestionErrors]
}
