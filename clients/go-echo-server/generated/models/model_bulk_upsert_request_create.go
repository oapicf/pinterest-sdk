package models

// BulkUpsertRequestCreate - Request for creation of entities in bulk.
type BulkUpsertRequestCreate struct {

	AdGroups []AdGroupCreateRequest `json:"ad_groups,omitempty"`

	Ads []AdCreateRequest `json:"ads,omitempty"`

	Campaigns []CampaignCreateRequest `json:"campaigns,omitempty"`

	CatalogProductGroups []MultipleProductGroupsInner `json:"catalog_product_groups,omitempty"`

	Keywords []KeywordsRequest `json:"keywords,omitempty"`

	Labels []LabelCreateRequest `json:"labels,omitempty"`

	ProductGroups []ProductGroupPromotionCreateRequest `json:"product_groups,omitempty"`
}
