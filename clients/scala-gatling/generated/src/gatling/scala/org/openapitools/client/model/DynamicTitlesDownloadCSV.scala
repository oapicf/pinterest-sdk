
package org.openapitools.client.model


case class DynamicTitlesDownloadCSV (
    /* Pre-signed S3 URL to download the CSV file. */
    _downloadUrl: Option[String]
)
object DynamicTitlesDownloadCSV {
    def toStringBody(var_downloadUrl: Object) =
        s"""
        | {
        | "downloadUrl":$var_downloadUrl
        | }
        """.stripMargin
}
