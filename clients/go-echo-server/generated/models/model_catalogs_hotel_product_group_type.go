package models
// CatalogsHotelProductGroupType : <p>Catalog hotel product group type</p> <p>MERCHANT_CREATED: Product groups created by merchants. <br>ALL_LISTINGS: Includes every hotel item in your catalog.
type CatalogsHotelProductGroupType string

// List of CatalogsHotelProductGroupType
const (
	MERCHANT_CREATED CatalogsHotelProductGroupType = "MERCHANT_CREATED"
	ALL_LISTINGS CatalogsHotelProductGroupType = "ALL_LISTINGS"
)
