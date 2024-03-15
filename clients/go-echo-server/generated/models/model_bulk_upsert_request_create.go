package models

// BulkUpsertRequestCreate - Request for creation of entities in bulk.
type BulkUpsertRequestCreate struct {

	Campaigns []CampaignCreateRequest `json:"campaigns,omitempty"`

	AdGroups []AdGroupCreateRequest `json:"ad_groups,omitempty"`

	Ads []AdCreateRequest `json:"ads,omitempty"`

	ProductGroups []ProductGroupPromotionCreateRequest `json:"product_groups,omitempty"`

	Keywords []KeywordsRequest `json:"keywords,omitempty"`
}
