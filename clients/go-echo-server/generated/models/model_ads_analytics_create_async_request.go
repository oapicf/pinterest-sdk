package models

type AdsAnalyticsCreateAsyncRequest struct {

	// List of types of attribution for the conversion report
	AttributionTypes []ConversionReportAttributionType `json:"attribution_types,omitempty"`

	// Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
	ClickWindowDays ConversionAttributionWindowDays `json:"click_window_days,omitempty"`

	// The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
	ConversionReportTime ConversionReportTimeType `json:"conversion_report_time,omitempty"`

	// Metric report end date (UTC). Format: YYYY-MM-DD
	EndDate string `json:"end_date" validate:"regexp=^(\\\\d{4})-(\\\\d{2})-(\\\\d{2})$"`

	// Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
	EngagementWindowDays ConversionAttributionWindowDays `json:"engagement_window_days,omitempty"`

	// TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
	Granularity Granularity `json:"granularity"`

	// Metric report start date (UTC). Format: YYYY-MM-DD
	StartDate string `json:"start_date" validate:"regexp=^(\\\\d{4})-(\\\\d{2})-(\\\\d{2})$"`

	// Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
	ViewWindowDays ConversionAttributionWindowDays `json:"view_window_days,omitempty"`

	// List of campaign ids
	CampaignIds []string `json:"campaign_ids,omitempty"`

	// List of status values for filtering
	CampaignStatuses []CampaignSummaryStatus `json:"campaign_statuses,omitempty"`

	// List of values for filtering. [\"WEB_SESSIONS\"] in BETA.
	CampaignObjectiveTypes []ObjectiveType `json:"campaign_objective_types,omitempty"`

	// Campaign brand label for filtering.
	CampaignBrandLabel string `json:"campaign_brand_label,omitempty"`

	// List of ad group ids
	AdGroupIds []string `json:"ad_group_ids,omitempty"`

	// List of values for filtering
	AdGroupStatuses []AdGroupSummaryStatus `json:"ad_group_statuses,omitempty"`

	// List of ad ids [This parameter is no supported for Product Item Level Reports]
	AdIds []string `json:"ad_ids,omitempty"`

	// List of values for filtering [This parameter is not supported for Product Item Level Reports]
	AdStatuses []PinPromotionSummaryStatus `json:"ad_statuses,omitempty"`

	// List of product group ids
	ProductGroupIds []string `json:"product_group_ids,omitempty"`

	// List of values for filtering
	ProductGroupStatuses []ProductGroupSummaryStatus `json:"product_group_statuses,omitempty"`

	// List of product item ids
	ProductItemIds []string `json:"product_item_ids,omitempty"`

	// List of targeting types. Requires `level` to be a value ending in `_TARGETING`. [\"AUDIENCE_MULTIPLIER\"] is only available in CAMPAIGN_TARGETING level. [\"MEDIA_TYPE\"] is only available in PRODUCT_ITEM_TARGETING level. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
	TargetingTypes []string `json:"targeting_types,omitempty"`

	// List of metrics filters
	MetricsFilters []AdsAnalyticsMetricsFilter `json:"metrics_filters,omitempty"`

	// Metric and entity columns. Pin promotion and ad related columns are not supported for the Product Item level reports.
	Columns []ReportingColumnAsync `json:"columns"`

	// Determines if the targeting types included in the request should be consolidated into a single breakdown. For example, when combine_targeting_types is set to true, if GENDER and COUNTRY are targeting types in the request, the response will have a targeting type of GENDER_AND_COUNTRY and targeting values such as female&US. This feature is currently in BETA and is not available to all users.
	CombineTargetingTypes bool `json:"combine_targeting_types,omitempty"`

	// List of advertiser-defined custom conversion event metrics to include in the report
	CustomConversionEventMetrics []AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics `json:"custom_conversion_event_metrics,omitempty"`

	// Which hour of the end date to stop the report (inclusive). For example, with an end_date of '2020-01-01' and end_hour of '15', the report will contain metrics up to '2020-01-01 14:59:59'. The entire day will be included if no end hour is provided. Only allowed for hourly reports.
	EndHour int32 `json:"end_hour,omitempty"`

	// Level of the report
	Level MetricsReportingLevel `json:"level"`

	// Whether to first sort the report by date or by entity ID of the reporting entity level. Date will be used as the first level key for JSON reports that use BY_DATE. BY_DATE is recommended for large requests.
	PrimarySort string `json:"primary_sort,omitempty"`

	// Specification for formatting the report data. Reports in JSON will not zero-fill metrics, whereas reports in CSV will. Both report formats will omit rows where all the columns are equal to 0.
	ReportFormat DataOutputFormat `json:"report_format,omitempty"`

	// Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
	ReportingTimezone ReportingTimeZone `json:"reporting_timezone,omitempty"`

	// Which hour of the start date to begin the report. The entire day will be included if no start hour is provided. Only allowed for hourly reports.
	StartHour int32 `json:"start_hour,omitempty"`
}
