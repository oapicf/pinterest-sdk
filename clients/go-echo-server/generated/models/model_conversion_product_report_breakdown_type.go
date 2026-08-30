package models

type ConversionProductReportBreakdownType string

// List of ConversionProductReportBreakdownType
const (
	PRODUCT_BRAND ConversionProductReportBreakdownType = "PRODUCT_BRAND"
	PRODUCT_CATEGORY ConversionProductReportBreakdownType = "PRODUCT_CATEGORY"
	PRODUCT_BRAND_AND_CATEGORY ConversionProductReportBreakdownType = "PRODUCT_BRAND_AND_CATEGORY"
	PRODUCT_SKU ConversionProductReportBreakdownType = "PRODUCT_SKU"
	PRODUCT_SKU_GROUP ConversionProductReportBreakdownType = "PRODUCT_SKU_GROUP"
)
