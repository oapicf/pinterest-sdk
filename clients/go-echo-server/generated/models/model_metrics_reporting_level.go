package models
// MetricsReportingLevel : Level of the reporting request
type MetricsReportingLevel string

// List of MetricsReportingLevel
const (
	ADVERTISER MetricsReportingLevel = "ADVERTISER"
	ADVERTISER_TARGETING MetricsReportingLevel = "ADVERTISER_TARGETING"
	CAMPAIGN MetricsReportingLevel = "CAMPAIGN"
	CAMPAIGN_TARGETING MetricsReportingLevel = "CAMPAIGN_TARGETING"
	AD_GROUP MetricsReportingLevel = "AD_GROUP"
	AD_GROUP_TARGETING MetricsReportingLevel = "AD_GROUP_TARGETING"
	PIN_PROMOTION MetricsReportingLevel = "PIN_PROMOTION"
	PIN_PROMOTION_TARGETING MetricsReportingLevel = "PIN_PROMOTION_TARGETING"
	KEYWORD MetricsReportingLevel = "KEYWORD"
	PRODUCT_GROUP MetricsReportingLevel = "PRODUCT_GROUP"
	PRODUCT_GROUP_TARGETING MetricsReportingLevel = "PRODUCT_GROUP_TARGETING"
	PRODUCT_ITEM MetricsReportingLevel = "PRODUCT_ITEM"
	PRODUCT_ITEM_TARGETING MetricsReportingLevel = "PRODUCT_ITEM_TARGETING"
)
