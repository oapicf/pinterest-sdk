package org.openapitools.server.model


/**
 * @param errors List of validation errors. Empty on success. for example: ''null''
 * @param status Processing status. Present on success. for example: ''SUCCESS''
*/
final case class DynamicTitlesProcessCSV (
  errors: Option[Seq[DynamicTitlesProcessCSVError]] = None,
  status: Option[String] = None
)

