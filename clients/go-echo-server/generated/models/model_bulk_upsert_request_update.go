package models

// BulkUpsertRequestUpdate - Request for creation of entities in bulk.
type BulkUpsertRequestUpdate struct {

	AdGroups []AdGroupUpdateRequest `json:"ad_groups,omitempty"`

	Ads []AdUpdateRequest `json:"ads,omitempty"`

	Campaigns []CampaignUpdateRequest `json:"campaigns,omitempty"`

	CatalogProductGroups []CatalogsProductGroupsUpdateRequest `json:"catalog_product_groups,omitempty"`

	Keywords []KeywordUpdate `json:"keywords,omitempty"`

	Labels []LabelBulkUpdateRequest `json:"labels,omitempty"`

	ProductGroups []ProductGroupPromotionUpdateRequest `json:"product_groups,omitempty"`
}
