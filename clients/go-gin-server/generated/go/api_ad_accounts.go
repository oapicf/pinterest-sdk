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

type AdAccountsAPI struct {
}

// Get /v5/ad_accounts/:ad_account_id/analytics
// Get ad account analytics 
func (api *AdAccountsAPI) AdAccountAnalytics(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /v5/ad_accounts/:ad_account_id/targeting_analytics
// Get targeting analytics for an ad account 
func (api *AdAccountsAPI) AdAccountTargetingAnalyticsGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /v5/ad_accounts
// Create ad account 
func (api *AdAccountsAPI) AdAccountsCreate(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /v5/ad_accounts/:ad_account_id
// Get ad account 
func (api *AdAccountsAPI) AdAccountsGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /v5/ad_accounts
// List ad accounts 
func (api *AdAccountsAPI) AdAccountsList(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /v5/ad_accounts/:ad_account_id/mmm_reports
// Create a request for a Marketing Mix Modeling (MMM) report 
func (api *AdAccountsAPI) AnalyticsCreateMmmReport(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /v5/ad_accounts/:ad_account_id/reports
// Create async request for an account analytics report 
func (api *AdAccountsAPI) AnalyticsCreateReport(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Post /v5/ad_accounts/:ad_account_id/templates/:template_id/reports
// Create async request for an analytics report using a template 
func (api *AdAccountsAPI) AnalyticsCreateTemplateReport(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /v5/ad_accounts/:ad_account_id/mmm_reports
// Get advertiser Marketing Mix Modeling (MMM) report. 
func (api *AdAccountsAPI) AnalyticsGetMmmReport(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /v5/ad_accounts/:ad_account_id/reports
// Get the account analytics report created by the async call 
func (api *AdAccountsAPI) AnalyticsGetReport(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Delete /v5/ad_accounts/:ad_account_id/sandbox
// Delete ads data for ad account in API Sandbox 
func (api *AdAccountsAPI) SandboxDelete(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /v5/ad_accounts/:ad_account_id/templates
// List templates 
func (api *AdAccountsAPI) TemplatesList(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

