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

import (
	"github.com/gin-gonic/gin"
)

type BulkAPI struct {
}

// Post /v5/ad_accounts/:ad_account_id/bulk/download
// Get advertiser entities in bulk 
func (api *BulkAPI) BulkDownloadCreate(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /v5/ad_accounts/:ad_account_id/bulk/:bulk_request_id
// Download advertiser entities in bulk 
func (api *BulkAPI) BulkRequestGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /v5/ad_accounts/:ad_account_id/bulk/upsert
// Create/update ad entities in bulk 
func (api *BulkAPI) BulkUpsertCreate(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

