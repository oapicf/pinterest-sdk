package models
// CatalogsProductGroupType : Catalog product group type  - **MERCHANT_CREATED**: Product groups created by merchants. - **ALL_PRODUCTS**: Consists of every product in your latest successful feed upload. - **BEST_DEALS**: Consists of products with the deepest drop in price. - **PINNER_FAVORITES**: Consists of products that are resonating most with people on Pinterest, based on engagement. - **TOP_SELLERS**: Consists of products with the highest conversion rate, if you have the conversion tag installed. - **BACK_IN_STOCK**: Consists of products that were previously out of stock and are now in stock. - **NEW_ARRIVALS**: Consists of products that are new to your Catalog. - **SHOPIFY_COLLECTIONS**: Product groups created based on Shopify Product Collections. - **I2PC**: Product groups created based on predicted product category. - **CATALOG_EXPANSION**: Consists of high-potential, recommended products from your catalog.
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
	SHOPIFY_COLLECTIONS CatalogsProductGroupType = "SHOPIFY_COLLECTIONS"
	I2_PC CatalogsProductGroupType = "I2PC"
	CATALOG_EXPANSION CatalogsProductGroupType = "CATALOG_EXPANSION"
)
