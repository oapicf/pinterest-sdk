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

type OrderLinesAPI struct {
}

// Get /v5/ad_accounts/:ad_account_id/order_lines/:order_line_id
// Get order line 
func (api *OrderLinesAPI) OrderLinesGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /v5/ad_accounts/:ad_account_id/order_lines
// Get order lines 
func (api *OrderLinesAPI) OrderLinesList(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

