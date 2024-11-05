package org.openapitools.server.model


/**
 * @param reportType  for example: ''null''
 * @param feedId ID of the feed entity. for example: ''null''
 * @param processingResultId Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result. for example: ''null''
*/
final case class CatalogsReportFeedIngestionFilter (
  reportType: String,
  feedId: String,
  processingResultId: Option[String] = None
)

