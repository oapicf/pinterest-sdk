/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * API version: 5.3.0
 * Contact: pinterest-api@pinterest.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

type CatalogsFeedIngestionErrors struct {

	ImageDownloadError int32 `json:"image_download_error,omitempty"`

	ImageDownloadConnectionTimeout int32 `json:"image_download_connection_timeout,omitempty"`

	ImageFormatUnrecognize int32 `json:"image_format_unrecognize,omitempty"`

	LineLevelInternalError int32 `json:"line_level_internal_error,omitempty"`

	LargeProductCountDecrease int32 `json:"large_product_count_decrease,omitempty"`
}