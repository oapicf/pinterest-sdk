package org.openapitools.server.model


/**
 * @param generatedCount The count of generated titles. for example: ''987''
 * @param isReady Whether dynamic titles have been generated and are ready to be reviewed for the ad group. for example: ''true''
 * @param reviewedCount The count of advertiser reviewed titles. for example: ''456''
*/
final case class DynamicTitlesGetStatus (
  generatedCount: Option[Int] = None,
  isReady: Option[Boolean] = None,
  reviewedCount: Option[Int] = None
)

