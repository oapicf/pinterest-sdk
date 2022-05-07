package models
// CatalogsProductGroupType : Catalog product group type
type CatalogsProductGroupType string

// List of CatalogsProductGroupType
const (
	MERCHANT_CREATED CatalogsProductGroupType = "MERCHANT_CREATED"
	ALL_PRODUCTS CatalogsProductGroupType = "ALL_PRODUCTS"
	BEST_DEALS CatalogsProductGroupType = "BEST_DEALS"
	PINNER_FAVORITES CatalogsProductGroupType = "PINNER_FAVORITES"
	TOP_SELLERS CatalogsProductGroupType = "TOP_SELLERS"
	BACK_IN_STOCK CatalogsProductGroupType = "BACK_IN_STOCK"
	NEW_ARRIVALS CatalogsProductGroupType = "NEW_ARRIVALS"
)
