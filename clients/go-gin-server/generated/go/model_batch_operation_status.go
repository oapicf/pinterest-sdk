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
// BatchOperationStatus : The status of the operation performed by the batch
type BatchOperationStatus string

// List of BatchOperationStatus
const (
	PROCESSING BatchOperationStatus = "PROCESSING"
	COMPLETED BatchOperationStatus = "COMPLETED"
)