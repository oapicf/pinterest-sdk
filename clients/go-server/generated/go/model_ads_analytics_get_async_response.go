// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * API version: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 */

package openapi




type AdsAnalyticsGetAsyncResponse struct {

	ReportStatus BulkReportingJobStatus `json:"report_status,omitempty"`

	Url *string `json:"url,omitempty"`

	Size *float32 `json:"size,omitempty"`
}

// AssertAdsAnalyticsGetAsyncResponseRequired checks if the required fields are not zero-ed
func AssertAdsAnalyticsGetAsyncResponseRequired(obj AdsAnalyticsGetAsyncResponse) error {
	return nil
}

// AssertAdsAnalyticsGetAsyncResponseConstraints checks if the values respects the defined constraints
func AssertAdsAnalyticsGetAsyncResponseConstraints(obj AdsAnalyticsGetAsyncResponse) error {
	return nil
}
