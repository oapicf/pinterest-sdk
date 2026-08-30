package models
// CollectionsHeaderType : Collections ad header type
type CollectionsHeaderType string

// List of CollectionsHeaderType
const (
	SHOP_THIS_COLLECTION CollectionsHeaderType = "SHOP_THIS_COLLECTION"
	EXPLORE_THIS_COLLECTION CollectionsHeaderType = "EXPLORE_THIS_COLLECTION"
	NO_HEADER CollectionsHeaderType = "NO_HEADER"
	ON_SALE CollectionsHeaderType = "ON_SALE"
	GET_DEAL CollectionsHeaderType = "GET_DEAL"
)
