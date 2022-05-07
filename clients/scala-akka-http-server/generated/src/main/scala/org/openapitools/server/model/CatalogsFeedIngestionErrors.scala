package org.openapitools.server.model


/**
 * @param imageDownloadError  for example: ''null''
 * @param imageDownloadConnectionTimeout  for example: ''null''
 * @param imageFormatUnrecognize  for example: ''null''
 * @param lineLevelInternalError  for example: ''null''
 * @param largeProductCountDecrease  for example: ''null''
*/
final case class CatalogsFeedIngestionErrors (
  imageDownloadError: Option[Int],
  imageDownloadConnectionTimeout: Option[Int],
  imageFormatUnrecognize: Option[Int],
  lineLevelInternalError: Option[Int],
  largeProductCountDecrease: Option[Int]
)

