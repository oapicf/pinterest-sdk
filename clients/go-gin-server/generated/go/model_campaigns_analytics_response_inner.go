/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * API version: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type CampaignsAnalyticsResponseInner struct {

	// The ID of the campaing that this metrics belongs to.
	CAMPAIGN_ID string `json:"CAMPAIGN_ID"`

	// Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
	DATE string `json:"DATE,omitempty"`
}