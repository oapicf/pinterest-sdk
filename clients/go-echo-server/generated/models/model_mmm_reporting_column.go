package models
// MmmReportingColumn : Marketing Mix Modeling (MMM) Reporting Columns
type MmmReportingColumn string

// List of MmmReportingColumn
const (
	SPEND_IN_DOLLAR MmmReportingColumn = "SPEND_IN_DOLLAR"
	SPEND_IN_MICRO_DOLLAR MmmReportingColumn = "SPEND_IN_MICRO_DOLLAR"
	ECPC_IN_DOLLAR MmmReportingColumn = "ECPC_IN_DOLLAR"
	ECTR MmmReportingColumn = "ECTR"
	CAMPAIGN_NAME MmmReportingColumn = "CAMPAIGN_NAME"
	TOTAL_ENGAGEMENT MmmReportingColumn = "TOTAL_ENGAGEMENT"
	EENGAGEMENT_RATE MmmReportingColumn = "EENGAGEMENT_RATE"
	ECPM_IN_DOLLAR MmmReportingColumn = "ECPM_IN_DOLLAR"
	CAMPAIGN_ID MmmReportingColumn = "CAMPAIGN_ID"
	ADVERTISER_ID MmmReportingColumn = "ADVERTISER_ID"
	AD_GROUP_ID MmmReportingColumn = "AD_GROUP_ID"
	AD_GROUP_NAME MmmReportingColumn = "AD_GROUP_NAME"
	CLICKTHROUGH_1 MmmReportingColumn = "CLICKTHROUGH_1"
	IMPRESSION_1 MmmReportingColumn = "IMPRESSION_1"
	CLICKTHROUGH_2 MmmReportingColumn = "CLICKTHROUGH_2"
	IMPRESSION_2 MmmReportingColumn = "IMPRESSION_2"
	TOTAL_CLICKTHROUGH MmmReportingColumn = "TOTAL_CLICKTHROUGH"
	TOTAL_IMPRESSION MmmReportingColumn = "TOTAL_IMPRESSION"
	ADVERTISER_NAME MmmReportingColumn = "ADVERTISER_NAME"
	SPEND_ORDER_LINE_PAID_TYPE MmmReportingColumn = "SPEND_ORDER_LINE_PAID_TYPE"
)
