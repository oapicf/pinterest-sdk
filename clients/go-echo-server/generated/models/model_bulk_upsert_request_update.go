package models

// BulkUpsertRequestUpdate - Request for creation of entities in bulk.
type BulkUpsertRequestUpdate struct {

	Campaigns []CampaignUpdateRequest `json:"campaigns,omitempty"`

	AdGroups []AdGroupUpdateRequest `json:"ad_groups,omitempty"`

	Ads []AdUpdateRequest `json:"ads,omitempty"`

	ProductGroups []ProductGroupPromotionUpdateRequest `json:"product_groups,omitempty"`

	Keywords []KeywordUpdate `json:"keywords,omitempty"`
}
