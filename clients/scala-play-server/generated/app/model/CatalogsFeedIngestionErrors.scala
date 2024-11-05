package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsFeedIngestionErrors.
  * @param LINE_LEVEL_INTERNAL_ERROR We experienced a technical difficulty and were unable to ingest this some items. The next ingestion will happen in 24 hours.
  * @param LARGE_PRODUCT_COUNT_DECREASE The product count has decreased by more than 99% compared to the last successful ingestion.
  * @param ACCOUNT_FLAGGED We detected an issue with your account and are not currently ingesting your items. Please review our policies at policy.pinterest.com/community-guidelines#section-spam or contact us at help.pinterest.com/contact for more information.
  * @param IMAGE_LEVEL_INTERNAL_ERROR We experienced a technical difficulty and were unable to download some images. The next download attempt will happen in 24 hours.
  * @param IMAGE_FILE_NOT_ACCESSIBLE Image files are unreadable. Please upload new files to continue.
  * @param IMAGE_MALFORMED_URL Image files are unreadable. Please check your link and upload new files to continue.
  * @param IMAGE_FILE_NOT_FOUND Image files are unreadable. Please upload new files to continue.
  * @param IMAGE_INVALID_FILE Image files are unreadable. Please upload new files to continue.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CatalogsFeedIngestionErrors(
  LINE_LEVEL_INTERNAL_ERROR: Option[Int],
  LARGE_PRODUCT_COUNT_DECREASE: Option[CatalogsFeedIngestionErrors.LARGEPRODUCTCOUNTDECREASE.Value],
  ACCOUNT_FLAGGED: Option[Int],
  IMAGE_LEVEL_INTERNAL_ERROR: Option[Int],
  IMAGE_FILE_NOT_ACCESSIBLE: Option[Int],
  IMAGE_MALFORMED_URL: Option[Int],
  IMAGE_FILE_NOT_FOUND: Option[Int],
  IMAGE_INVALID_FILE: Option[Int]
)

object CatalogsFeedIngestionErrors {
  implicit lazy val catalogsFeedIngestionErrorsJsonFormat: Format[CatalogsFeedIngestionErrors] = Json.format[CatalogsFeedIngestionErrors]

  // noinspection TypeAnnotation
  object LARGEPRODUCTCOUNTDECREASE extends Enumeration {
    val _1 = Value("1")

    type LARGEPRODUCTCOUNTDECREASE = Value
    implicit lazy val LARGEPRODUCTCOUNTDECREASEJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

