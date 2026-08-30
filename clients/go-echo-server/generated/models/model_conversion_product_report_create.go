package models

// ConversionProductReportCreate - Resource create operation model.
type ConversionProductReportCreate struct {

	//   List of ad group ids.   Only support ad_group_ids field when level of the report is AD_GROUP.
	AdGroupIds []string `json:"ad_group_ids,omitempty"`

	//   List of campaign ids.   Only support campaign_ids field when level of the report is CAMPAIGN.
	CampaignIds []string `json:"campaign_ids,omitempty"`

	// List of values for filtering. Default is ['CONSIDERATION','AWARENESS','WEB_CONVERSION','VIDEO_COMPLETION'].
	CampaignObjectiveTypes []ConversionObjectiveType `json:"campaign_objective_types,omitempty"`

	// Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
	ClickWindowDays ConversionAttributionWindowDays `json:"click_window_days,omitempty"`

	// Metric and entity columns
	Columns []ConversionProductReportingColumn `json:"columns"`

	//   Required attribution type of the B/C/S report.   When the attribution type is BRAND_ATTRIBUTION, start_date for the report must be after 2025-04-01.
	ConversionProductAttributionType ConversionProductAttributionType `json:"conversion_product_attribution_type,omitempty"`

	// Report breakdown type. This is used to specify the breakdown of the report by brand, category, or SKU.
	ConversionProductBreakdown ConversionProductReportBreakdownType `json:"conversion_product_breakdown,omitempty"`

	// The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
	ConversionReportTime ConversionReportTimeType `json:"conversion_report_time,omitempty"`

	//   Metric report end date (UTC). Format: YYYY-MM-DD.   A max of 1 year is allowed between the start and end date for reports.
	EndDate string `json:"end_date" validate:"regexp=^\\d{4}-\\d{2}-\\d{2}$"`

	// Report granularity for time-based metric aggregation
	Granularity ConversionProductReportGranularity `json:"granularity"`

	// Level of the report
	Level ConversionProductReportLevel `json:"level"`

	//   List of SKU ids.   Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP.
	ProductSkuIds []string `json:"product_sku_ids,omitempty"`

	// Name of the conversion product report
	ReportName string `json:"report_name"`

	//   Metric report start date (UTC). Format: YYYY-MM-DD.   Start date must be after 2024-03-16. 7 day minimum time window for report is required.
	StartDate string `json:"start_date" validate:"regexp=^\\d{4}-\\d{2}-\\d{2}$"`

	// Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
	ViewWindowDays ConversionAttributionWindowDays `json:"view_window_days,omitempty"`
}
