package models

type ProductGroupPromotion struct {

	// ID of the product group promotion.
	Id string `json:"id,omitempty"`

	// ID of the ad group the product group belongs to.
	AdGroupId string `json:"ad_group_id,omitempty"`

	// The bid in micro currency.
	BidInMicroCurrency *int32 `json:"bid_in_micro_currency,omitempty"`

	// True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.
	Included *bool `json:"included,omitempty"`

	// The full product group definition path
	Definition *string `json:"definition,omitempty"`

	// The definition of the product group, relative to its parent - an attribute name/value pair
	RelativeDefinition *string `json:"relative_definition,omitempty"`

	// The parent Product Group ID of this Product Group
	ParentId *string `json:"parent_id,omitempty"`

	// Slideshow Collections Title
	SlideshowCollectionsTitle *string `json:"slideshow_collections_title,omitempty"`

	// Slideshow Collections Description
	SlideshowCollectionsDescription *string `json:"slideshow_collections_description,omitempty"`

	// If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog
	IsMdl *bool `json:"is_mdl,omitempty"`

	Status EntityStatus `json:"status,omitempty"`

	// Tracking template for proudct group promotions. 4000 limit
	TrackingUrl *string `json:"tracking_url,omitempty"`

	// ID of the catalogs product group that this product group promotion references
	CatalogProductGroupId *string `json:"catalog_product_group_id,omitempty"`

	// Catalogs product group name
	CatalogProductGroupName *string `json:"catalog_product_group_name,omitempty"`

	CreativeType CreativeType `json:"creative_type,omitempty"`

	// Hero Pin ID if this PG is promoted as a Collection
	CollectionsHeroPinId *string `json:"collections_hero_pin_id,omitempty"`

	// Collections Hero Destination Url
	CollectionsHeroDestinationUrl *string `json:"collections_hero_destination_url,omitempty"`

	GridClickType *GridClickType `json:"grid_click_type,omitempty"`
}
