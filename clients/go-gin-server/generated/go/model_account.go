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

type Account struct {

	// Type of account
	AccountType string `json:"account_type,omitempty"`

	ProfileImage string `json:"profile_image,omitempty"`

	WebsiteUrl string `json:"website_url,omitempty"`

	Username string `json:"username,omitempty"`
}