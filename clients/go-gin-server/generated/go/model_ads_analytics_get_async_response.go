/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * API version: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type AdsAnalyticsGetAsyncResponse struct {

	ReportStatus BulkReportingJobStatus `json:"report_status,omitempty"`

	Url *string `json:"url,omitempty"`

	Size *float32 `json:"size,omitempty"`
}
