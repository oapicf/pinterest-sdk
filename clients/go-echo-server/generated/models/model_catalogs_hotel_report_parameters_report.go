package models

import (
	"gopkg.in/validator.v2"
)

type CatalogsHotelReportParametersReport struct {

	ReportType string `json:"report_type,omitempty"`

	// ID of the feed entity.
	FeedId string `json:"feed_id"`

	// Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.
	ProcessingResultId string `json:"processing_result_id,omitempty"`

	// Unique identifier of a catalog. If not given, oldest catalog will be used
	CatalogId string `json:"catalog_id,omitempty"`
}
