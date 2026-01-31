package org.openapitools.server.model


/**
 * @param downloadUrl  for example: ''null''
 * @param exportStatus  for example: ''null''
*/
final case class LeadsExportResponseData (
  downloadUrl: Option[String] = None,
  exportStatus: Option[LeadsExportStatus] = None
)

