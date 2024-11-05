package org.openapitools.server.model


/**
 * @param exportStatus  for example: ''null''
 * @param downloadUrl  for example: ''null''
*/
final case class LeadsExportResponseData (
  exportStatus: Option[LeadsExportStatus] = None,
  downloadUrl: Option[String] = None
)

