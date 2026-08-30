package models

type AdsAnalyticsCreateAsyncRequest struct {

	// List of ad group ids
	AdGroupIds []string `json:"ad_group_ids,omitempty"`

	// List of values for filtering
	AdGroupStatuses []AdGroupSummaryStatus `json:"ad_group_statuses,omitempty"`

	// List of ad ids. This parameter is not supported for Product Item level reports.
	AdIds []string `json:"ad_ids,omitempty"`

	// List of values for filtering. This parameter is not supported for Product Item level reports.
	AdStatuses []PinPromotionSummaryStatus `json:"ad_statuses,omitempty"`

	// List of attribution types for the conversion report.
	AttributionTypes []ConversionReportAttributionType `json:"attribution_types,omitempty"`

	// Campaign brand label for filtering.
	CampaignBrandLabel string `json:"campaign_brand_label,omitempty"`

	// Campaign custom label for filtering.
	CampaignCustomLabel string `json:"campaign_custom_label,omitempty"`

	// List of campaign ids
	CampaignIds []string `json:"campaign_ids,omitempty"`

	// List of values for filtering. [\"WEB_SESSIONS\"] is in BETA.
	CampaignObjectiveTypes []CampaignObjectiveType `json:"campaign_objective_types,omitempty"`

	// List of status values for filtering
	CampaignStatuses []CampaignSummaryStatus `json:"campaign_statuses,omitempty"`

	// Number of days to use as the conversion attribution window for a pin click action.
	ClickWindowDays ConversionAttributionWindowDays `json:"click_window_days,omitempty"`

	// Metric and entity columns. Pin promotion and ad related columns are not supported for Product Item level reports.
	Columns []ReportingColumnAsync `json:"columns,omitempty"`

	// Determines if the targeting types included in the request should be consolidated into a single breakdown.
	CombineTargetingTypes bool `json:"combine_targeting_types,omitempty"`

	// Date dimension for conversion metrics.
	ConversionReportTime ConversionReportTimeType `json:"conversion_report_time,omitempty"`

	// List of advertiser-defined custom conversion event metrics to include in the report
	CustomConversionEventMetrics []CustomConversionEventMetrics `json:"custom_conversion_event_metrics,omitempty"`

	// Metric report end date (UTC). Format: YYYY-MM-DD
	EndDate string `json:"end_date" validate:"regexp=^\\d{4}-\\d{2}-\\d{2}$"`

	// Which hour of the end date to stop the report (inclusive). Only allowed for hourly reports.
	EndHour int32 `json:"end_hour,omitempty"`

	// Number of days to use as the conversion attribution window for an engagement action.
	EngagementWindowDays ConversionAttributionWindowDays `json:"engagement_window_days,omitempty"`

	//   TOTAL - metrics are aggregated over the specified date range.   DAY - metrics are broken down daily.   HOUR - metrics are broken down hourly.   WEEKLY - metrics are broken down weekly.   MONTHLY - metrics are broken down monthly.
	Granularity Granularity `json:"granularity"`

	// Level of the report
	Level MetricsReportingLevel `json:"level,omitempty"`

	// List of metrics filters
	MetricsFilters []AdsAnalyticsMetricsFilter `json:"metrics_filters,omitempty"`

	PrimarySort PrimarySort `json:"primary_sort,omitempty"`

	// List of product group ids
	ProductGroupIds []string `json:"product_group_ids,omitempty"`

	// List of values for filtering
	ProductGroupStatuses []ProductGroupSummaryStatus `json:"product_group_statuses,omitempty"`

	// List of product item ids
	ProductItemIds []string `json:"product_item_ids,omitempty"`

	ReportFormat DataOutputFormat `json:"report_format,omitempty"`

	// Specify the timezone to be applied for the reporting.
	ReportingTimezone ReportingTimeZone `json:"reporting_timezone,omitempty"`

	// Metric report start date (UTC). Format: YYYY-MM-DD
	StartDate string `json:"start_date" validate:"regexp=^\\d{4}-\\d{2}-\\d{2}$"`

	// Which hour of the start date to begin the report. Only allowed for hourly reports.
	StartHour int32 `json:"start_hour,omitempty"`

	// List of targeting types. Requires `level` to be a value ending in `_TARGETING`.
	TargetingTypes []AdAdsAnalyticsAsyncTargetingTypes `json:"targeting_types,omitempty"`

	// Number of days to use as the conversion attribution window for a view action.
	ViewWindowDays ConversionAttributionWindowDays `json:"view_window_days,omitempty"`
}
