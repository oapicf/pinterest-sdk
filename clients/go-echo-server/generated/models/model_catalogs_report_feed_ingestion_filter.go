package models

type CatalogsReportFeedIngestionFilter struct {

	ReportType string `json:"report_type"`

	// ID of the feed entity.
	FeedId string `json:"feed_id" validate:"regexp=^\\\\d+$"`

	// Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.
	ProcessingResultId string `json:"processing_result_id,omitempty" validate:"regexp=^\\\\d+$"`
}
