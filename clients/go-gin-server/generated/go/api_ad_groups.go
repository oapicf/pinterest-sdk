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

type AdGroupsAPI struct {
}

// Get /v5/ad_accounts/:ad_account_id/ad_groups/analytics
// Get ad group analytics 
func (api *AdGroupsAPI) AdGroupsAnalytics(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /v5/ad_accounts/:ad_account_id/ad_groups/audience_sizing
// Get audience sizing 
func (api *AdGroupsAPI) AdGroupsAudienceSizing(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /v5/ad_accounts/:ad_account_id/bid_floor
// Get bid floors 
func (api *AdGroupsAPI) AdGroupsBidFloorGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /v5/ad_accounts/:ad_account_id/ad_groups
// Create ad groups 
func (api *AdGroupsAPI) AdGroupsCreate(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /v5/ad_accounts/:ad_account_id/ad_groups/:ad_group_id
// Get ad group 
func (api *AdGroupsAPI) AdGroupsGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /v5/ad_accounts/:ad_account_id/ad_groups
// List ad groups 
func (api *AdGroupsAPI) AdGroupsList(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /v5/ad_accounts/:ad_account_id/ad_groups/targeting_analytics
// Get targeting analytics for ad groups 
func (api *AdGroupsAPI) AdGroupsTargetingAnalyticsGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Patch /v5/ad_accounts/:ad_account_id/ad_groups
// Update ad groups 
func (api *AdGroupsAPI) AdGroupsUpdate(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

