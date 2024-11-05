package org.openapitools.server.model


/**
 * @param startDate Export leads collected on and after start date (UTC). Format: YYYY-MM-DD for example: ''2020-12-20''
 * @param endDate Export leads collected on and before end date (UTC). Format: YYYY-MM-DD for example: ''2020-12-20''
 * @param adId ID for the ad collecting leads for example: ''687201361754''
*/
final case class LeadsExportCreateRequest (
  startDate: String,
  endDate: String,
  adId: String
)

