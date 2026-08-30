package org.openapitools.server.model


/**
 * @param downloadUrl Pre-signed S3 URL to download the CSV file. for example: ''https://s3.amazonaws.com/bucket/dynamic_titles/review.csv?AWSAccessKeyId=...''
*/
final case class DynamicTitlesDownloadCSV (
  downloadUrl: Option[String] = None
)

