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

// BulkUpsertRequestCreate - Request for creation of entities in bulk.
type BulkUpsertRequestCreate struct {

	Campaigns []CampaignCreateRequest `json:"campaigns,omitempty"`

	AdGroups []AdGroupCreateRequest `json:"ad_groups,omitempty"`

	Ads []AdCreateRequest `json:"ads,omitempty"`

	ProductGroups []ProductGroupPromotionCreateRequest `json:"product_groups,omitempty"`

	Keywords []KeywordsRequest `json:"keywords,omitempty"`
}